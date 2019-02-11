/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.XDependienteModel;
import Models.XIpModel;
import Utils.HibernateUtil;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;

/**
 *
 * @author vesprada
 */
public class HibernateController {

    private static Session session;
    private static XIpModel ipLog;

    public HibernateController() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    //Métodos para el logueo de la aplicación desktop
    //--------------------------------------------------------------------------
    //Loguea la aplicación en la BD, marcándola como disponible.
    public void logDesktopApp(ServerSocket server) {
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(BLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.beginTransaction();
        ipLog = new XIpModel();
        ipLog.setIp(ip.getHostAddress() + ":" + server.getLocalPort());
        session.save(ipLog);
        session.getTransaction().commit();
    }

    //desloguea la aplicación de la BD, borrando el registro de la tabla
    public void logOffAndClose() {
        remove(ipLog);
    }

    //Métodos 
    //--------------------------------------------------------------------------
    //Elimina un objeto de la BD
    public void remove(Object object) throws HibernateException {
        session.beginTransaction();
        session.remove(object);
        session.getTransaction().commit();
        session.close();
    }

    //Guarda un objeto en la BD
    public void save(Object object) throws HibernateException {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        session.close();
    }

    //Actualiza un objeto en la BD
    public void update(Object object) throws HibernateException {
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
        session.close();
    }

    //Devuelve todos los registros de la BD del tipo recibido como parámetro
    public List<Object> read(Class c) {
        List<Object> list = session.createQuery("from " + c.getName()).list();
        return list;
    }

    //Consulta y recupera una lista de objetos de la BD dada una query concreta
    public List<Object> readWithQuery(String query) throws HibernateException {
        List<Object> list = session.createQuery(query).list();
        return list;
    }

    public TableModel getRs(String query, Object dependiente) {
        session.beginTransaction();
        TableModel tm;
        tm = session.doReturningWork(new ReturningWork<TableModel>() {
            @Override
            public TableModel execute(Connection connection) throws SQLException {
                TableModel dtm;
                try (PreparedStatement stmt = connection.prepareStatement(query)) {
                    if (dependiente != null) {
                        stmt.setInt(1, ((XDependienteModel) dependiente).getId());
                    }
                    ResultSet rs = stmt.executeQuery();
                    dtm = Utils.Utils.buildTableModel(rs);
                }
                return dtm;
            }
        });
        session.getTransaction().commit();
        return tm;
    }

}
