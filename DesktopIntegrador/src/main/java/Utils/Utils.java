package Utils;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author vesprada
 */
public class Utils {
    
 /*   public static JTable buildTable(ResultSet rs) {
        JTable table = new JTable(buildTableModel(rs));
        return table;
    }*/
    
    //Genera la estructura y modelo de la tabla
    public static TableModel buildTableModel(ResultSet rs) {
        Vector<String> columnNames = new Vector<>();
        Vector<Vector<Object>> data = new Vector<>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();

            // Nombres de las columnas
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnNames.add(metaData.getColumnLabel(column));
            }

            // Datos
            while (rs.next()) {
                Vector<Object> vector = new Vector<>();
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    vector.add(rs.getObject(columnIndex));
                }
                data.add(vector);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error generando la tabla. " + ex.getMessage());
        }
        return new DefaultTableModel(data, columnNames);
    }
    
    //Ajusta automáticamente el tamaño de las columnas de la tabla
    public static void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        //Eliminamos de la vista la columna id, porque no tiene utilidad visualmente, pero si para la logica
        columnModel.removeColumn(table.getColumn("id"));
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    //Asigna automaticamente la letra del dni
    public static String laLetra(String numeracion) {
        String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = Integer.valueOf(numeracion) % 23;
        return numeracion+juegoCaracteres.charAt(modulo);
    }
}
