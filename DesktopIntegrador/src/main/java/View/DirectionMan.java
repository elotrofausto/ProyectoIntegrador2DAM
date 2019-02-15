package View;

import Controller.BLogic;
import Models.XCiudadModel;
import Models.XCsModel;
import Models.XDireccionModel;
import Models.XProvinciaModel;
import Models.XViviendaModel;
import Utils.SentenciasSQL;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class DirectionMan extends javax.swing.JDialog {

    private final String CITY = "CIUDADES", INIT = "DATOS DE ", HOME = "VIVIENDA";
    private String name;
    private BLogic controller;
    private Object object;
    private XCiudadModel ciudad;
    private List<Object> listaCiudades;

    public DirectionMan(MainView parent, boolean modal, BLogic controller, String name, List<Object> listaCiudades) {
        super(parent, modal);
        this.name = name;
        this.listaCiudades = listaCiudades;
        this.controller = controller;
        this.object = null;
        initComponents();
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        tfTelf = new javax.swing.JTextField();
        tfNomEdif = new javax.swing.JTextField();
        tfNomVia = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNum = new javax.swing.JTextField();
        tfEsc = new javax.swing.JTextField();
        tfLetra = new javax.swing.JTextField();
        tfPiso = new javax.swing.JTextField();
        jComboTipo = new javax.swing.JComboBox<>();
        tfNomCity = new javax.swing.JTextField();
        tfNomProv = new javax.swing.JTextField();
        jbtnSearchCity = new javax.swing.JButton();
        jCheckBox = new javax.swing.JCheckBox();
        tfAcceso = new javax.swing.JTextField();
        jbtnAyuda = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE CENTRO MEDICO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfTelf.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf.setToolTipText("");
        tfTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf.setPreferredSize(new java.awt.Dimension(150, 40));

        tfNomEdif.setBackground(new java.awt.Color(255, 255, 255));
        tfNomEdif.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomEdif.setForeground(new java.awt.Color(0, 0, 0));
        tfNomEdif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomEdif.setToolTipText("");
        tfNomEdif.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomEdif.setPreferredSize(new java.awt.Dimension(200, 40));

        tfNomVia.setBackground(new java.awt.Color(255, 255, 255));
        tfNomVia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomVia.setForeground(new java.awt.Color(0, 0, 0));
        tfNomVia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomVia.setToolTipText("");
        tfNomVia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE DE VÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomVia.setPreferredSize(new java.awt.Dimension(300, 40));

        btnAceptar.setForeground(new java.awt.Color(0, 102, 102));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfNum.setBackground(new java.awt.Color(255, 255, 255));
        tfNum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNum.setForeground(new java.awt.Color(0, 0, 0));
        tfNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNum.setToolTipText("");
        tfNum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNum.setPreferredSize(new java.awt.Dimension(80, 40));

        tfEsc.setBackground(new java.awt.Color(255, 255, 255));
        tfEsc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEsc.setForeground(new java.awt.Color(0, 0, 0));
        tfEsc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEsc.setToolTipText("");
        tfEsc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESCALERA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfEsc.setPreferredSize(new java.awt.Dimension(80, 40));

        tfLetra.setBackground(new java.awt.Color(255, 255, 255));
        tfLetra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfLetra.setForeground(new java.awt.Color(0, 0, 0));
        tfLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLetra.setToolTipText("");
        tfLetra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LETRA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfLetra.setPreferredSize(new java.awt.Dimension(80, 40));

        tfPiso.setBackground(new java.awt.Color(255, 255, 255));
        tfPiso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPiso.setForeground(new java.awt.Color(0, 0, 0));
        tfPiso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPiso.setToolTipText("");
        tfPiso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PISO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfPiso.setPreferredSize(new java.awt.Dimension(80, 40));

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO VÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboTipo.setPreferredSize(new java.awt.Dimension(100, 40));

        tfNomCity.setEditable(false);
        tfNomCity.setBackground(new java.awt.Color(255, 255, 255));
        tfNomCity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomCity.setForeground(new java.awt.Color(0, 0, 0));
        tfNomCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomCity.setToolTipText("");
        tfNomCity.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIUDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomCity.setPreferredSize(new java.awt.Dimension(150, 40));

        tfNomProv.setEditable(false);
        tfNomProv.setBackground(new java.awt.Color(255, 255, 255));
        tfNomProv.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNomProv.setForeground(new java.awt.Color(0, 0, 0));
        tfNomProv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNomProv.setToolTipText("");
        tfNomProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROVINCIA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNomProv.setPreferredSize(new java.awt.Dimension(150, 40));

        jbtnSearchCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jbtnSearchCity.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnSearchCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchCityActionPerformed(evt);
            }
        });

        jCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox.setText("HABITUAL");
        jCheckBox.setPreferredSize(new java.awt.Dimension(150, 40));

        tfAcceso.setEditable(false);
        tfAcceso.setBackground(new java.awt.Color(255, 255, 255));
        tfAcceso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfAcceso.setForeground(new java.awt.Color(0, 0, 0));
        tfAcceso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAcceso.setToolTipText("");
        tfAcceso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCESO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfAcceso.setPreferredSize(new java.awt.Dimension(150, 40));

        jbtnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info.png"))); // NOI18N
        jbtnAyuda.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(tfNomEdif, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfNomVia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jbtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(tfNomCity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(tfAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jbtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(tfNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfPiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(tfEsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomEdif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSearchCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchCityActionPerformed
        Search search = new Search(null, true, listaCiudades, CITY);
        if (search.getDependiente() != null) {
            ciudad = (XCiudadModel) search.getDependiente();
            this.tfNomCity.setText(ciudad.getName());
            this.tfNomProv.setText(((XProvinciaModel) controller.cargarDatos(XProvinciaModel.class, SentenciasSQL.objectDatosId, ciudad.getId())).getName());
        }
    }//GEN-LAST:event_jbtnSearchCityActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        object = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (this.tfNomProv.getText().length() > 0 && this.tfNomVia.getText().length() > 0
                && this.tfNum.getText().length() > 0 && this.tfNomEdif.getText().length() > 0) {
            XDireccionModel direc = new XDireccionModel(ciudad, this.jComboTipo.getSelectedItem().toString(), this.tfNomVia.getText(),
                    Integer.valueOf(this.tfNum.getText()), Integer.valueOf(this.tfPiso.getText()), this.tfLetra.getText(), this.tfEsc.getText());
            if (name.equals(HOME)) {
                XViviendaModel vivi = new XViviendaModel(direc, this.tfNomEdif.getText(), this.jCheckBox.isSelected(), this.tfAcceso.getText());
                object = vivi;
            } else {
                XCsModel cs = new XCsModel(direc, this.tfTelf.getText(), this.tfNomEdif.getText());
                object = cs;
            }
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca los campos obligatorios");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jbtnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "Los campos obligatorios son: La Ciudad, Nombre, Nombre de Via y el Numero");
    }//GEN-LAST:event_jbtnAyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton jbtnAyuda;
    private javax.swing.JButton jbtnSearchCity;
    private javax.swing.JTextField tfAcceso;
    private javax.swing.JTextField tfEsc;
    private javax.swing.JTextField tfLetra;
    private javax.swing.JTextField tfNomCity;
    private javax.swing.JTextField tfNomEdif;
    private javax.swing.JTextField tfNomProv;
    private javax.swing.JTextField tfNomVia;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfTelf;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        if (name.equalsIgnoreCase(HOME)) {
            this.tfTelf.setVisible(false);
        } else {
            this.jCheckBox.setVisible(false);
            this.tfAcceso.setVisible(false);
        }
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, INIT + name, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Object getObject() {
        return object;
    }

}
