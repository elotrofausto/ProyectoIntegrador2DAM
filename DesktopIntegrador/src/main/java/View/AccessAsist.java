package View;

import Controller.BLogic;
import Models.XAsistenteModel;
import Models.XPersonaModel;
import Utils.SentenciasSQL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class AccessAsist extends javax.swing.JDialog {

    private XAsistenteModel asistente;
    private BLogic controler;

    public AccessAsist(java.awt.Frame parent, boolean modal, BLogic controler) throws SQLException {
        super(parent, modal);
        initComponents();
        this.controler = controler;
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabTitulo = new javax.swing.JLabel();
        tFieldUser = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jLabTitulo.setBackground(new java.awt.Color(224, 224, 224));
        jLabTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jLabTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabTitulo.setText("ACCESO");

        tFieldUser.setBackground(new java.awt.Color(255, 255, 255));
        tFieldUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tFieldUser.setForeground(new java.awt.Color(0, 0, 0));
        tFieldUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFieldUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASISTENTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tFieldUser.setPreferredSize(new java.awt.Dimension(150, 40));

        btnAceptar.setText("ACEPTAR");
        btnAceptar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tFieldPass.setBackground(new java.awt.Color(255, 255, 255));
        tFieldPass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tFieldPass.setForeground(new java.awt.Color(0, 0, 0));
        tFieldPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tFieldPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTRASEÑA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tFieldPass.setPreferredSize(new java.awt.Dimension(150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(tFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (tFieldPass.getPassword().length > 0 && tFieldUser.getText().length() > 0) {
            getAssistant();
            if (asistente == null) {
                JOptionPane.showMessageDialog(this, "El usuario introducido no existe");
            } else {
                if (asistente.getPassword().equals(String.valueOf(tFieldPass.getPassword()))) {
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "La contraseña introducida es incorrecta");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Rellene los campos, por favor");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Si cancela, se saldrá de la aplicación", "!AVISO¡", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabTitulo;
    private javax.swing.JPasswordField tFieldPass;
    private javax.swing.JTextField tFieldUser;
    // End of variables declaration//GEN-END:variables

    public XAsistenteModel getAsistente() {
        return asistente;
    }

    private void getAssistant() {
        try {
            controler.getHibernate().join();
            XPersonaModel persona = (XPersonaModel) controler.cargarDatos(XPersonaModel.class, SentenciasSQL.personaDatos, tFieldUser.getText());
            if (persona != null) {
                asistente = (XAsistenteModel) controler.cargarDatos(XAsistenteModel.class, SentenciasSQL.asistenteDatos, persona.getId());
            } else {
                asistente = null;
            }
        } catch (InterruptedException ex) {
            System.err.println("ERROR EN AccessAsist.getAssistant(). " + ex.getMessage());
        }
    }
}
