package View;

import Utils.PanelFX;
import java.awt.BorderLayout;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class GoHome extends javax.swing.JDialog {

    //Alcoy+Miraculosa+538.346041,-0.484756&zoom=18
    private PanelFX panel;
    private final String INIT = "https://www.google.com/maps/dir/?api=1";
    private final String ORIGIN = "&origin=";
    private final String DESTINATION = "&destination=";
    private final String END = "&travelmode=walking";

    public GoHome(java.awt.Frame parent, boolean modal, String origen, String destino) {
        super(parent, modal);
        panel = new PanelFX();
        initComponents();
        initUI(origen, destino);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCanvas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanelCanvasLayout = new javax.swing.GroupLayout(jPanelCanvas);
        jPanelCanvas.setLayout(jPanelCanvasLayout);
        jPanelCanvasLayout.setHorizontalGroup(
            jPanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jPanelCanvasLayout.setVerticalGroup(
            jPanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initUI(String origen, String destino) {
        String url = INIT + ORIGIN + origen + DESTINATION + destino + END;
        panel.loadURL(url);
        panel.setBounds(1, 1, jPanelCanvas.getWidth() - 1, jPanelCanvas.getHeight() - 1);
        this.jPanelCanvas.setLayout(new BorderLayout());
        this.jPanelCanvas.add(panel,BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelCanvas;
    // End of variables declaration//GEN-END:variables
}
