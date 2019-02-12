package View;

import Models.XDependienteModel;
import Utils.ModelList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * @author Yop
 */
public class Search extends javax.swing.JDialog {

    private ModelList modelo;
    private XDependienteModel dependiente;

    public Search(java.awt.Frame parent, boolean modal, List<Object> listaDependientes) {
        super(parent, modal);
        initList(listaDependientes);
        initComponents();
        jListDependientes.setModel(modelo);
        jListDependientes.setSelectedIndex(0);
        dependiente = null;
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabTitle = new javax.swing.JLabel();
        jPanelDependientes = new javax.swing.JPanel();
        jTfBuscar = new javax.swing.JTextField();
        jScrollPaneLista = new javax.swing.JScrollPane();
        jListDependientes = new javax.swing.JList<>();
        jbtnAceptar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabTitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabTitle.setText("BUSCAR DEPENDIENTE");

        jPanelDependientes.setBorder(javax.swing.BorderFactory.createTitledBorder("DEPENDIENTES"));

        jTfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTfBuscarKeyReleased(evt);
            }
        });

        jScrollPaneLista.setViewportView(jListDependientes);

        javax.swing.GroupLayout jPanelDependientesLayout = new javax.swing.GroupLayout(jPanelDependientes);
        jPanelDependientes.setLayout(jPanelDependientesLayout);
        jPanelDependientesLayout.setHorizontalGroup(
            jPanelDependientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDependientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDependientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfBuscar)
                    .addComponent(jScrollPaneLista, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDependientesLayout.setVerticalGroup(
            jPanelDependientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDependientesLayout.createSequentialGroup()
                .addComponent(jTfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneLista, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbtnAceptar.setText("ACEPTAR");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("CANCELAR");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDependientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jBtnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                            .addComponent(jbtnAceptar))
                        .addComponent(jLabTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDependientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jBtnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        dependiente = null;
        dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        if (!jListDependientes.isSelectionEmpty()) {
            dependiente = (XDependienteModel) ((ModelList) jListDependientes.getModel()).getObject(jListDependientes.getSelectedIndex());
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "No ha seleccionado ningún dependiente");
        }
    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jTfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfBuscarKeyReleased
        ArrayList<Object> lista = modelo.getLista();
        ModelList tempo = new ModelList();
        if (jTfBuscar.getText().length() > 0) {
            for (Object object : lista) {
                if (((XDependienteModel) object).equals(jTfBuscar.getText())) {
                    tempo.addObject(object);
                }
            }
            jListDependientes.setModel(tempo);
            if (tempo.getSize() > 0) {
                jListDependientes.setSelectedIndex(0);
            }
        } else {
            jListDependientes.setModel(modelo);
        }
    }//GEN-LAST:event_jTfBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JLabel jLabTitle;
    private javax.swing.JList<String> jListDependientes;
    private javax.swing.JPanel jPanelDependientes;
    private javax.swing.JScrollPane jScrollPaneLista;
    private javax.swing.JTextField jTfBuscar;
    private javax.swing.JButton jbtnAceptar;
    // End of variables declaration//GEN-END:variables

    private void initList(List<Object> listaDependientes) {
        modelo = new ModelList();
        for (Object listaDependiente : listaDependientes) {
            modelo.addObject(listaDependiente);
        }
    }

    public XDependienteModel getDependiente() {
        return dependiente;
    }

}
