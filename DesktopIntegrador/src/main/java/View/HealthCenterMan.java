package View;

import Controller.BLogic;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class HealthCenterMan extends javax.swing.JDialog {

    public HealthCenterMan(java.awt.Frame parent, boolean modal, BLogic controller) {
        super(parent, modal);
        initComponents();
        initUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMedico1 = new javax.swing.JPanel();
        tfTelf1 = new javax.swing.JTextField();
        tfNombre1 = new javax.swing.JTextField();
        tfDisponibilidad1 = new javax.swing.JTextField();
        btnAceptar1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfApe5 = new javax.swing.JTextField();
        tfApe6 = new javax.swing.JTextField();
        tfTelf2 = new javax.swing.JTextField();
        tfDisponibilidad2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        tfTelf3 = new javax.swing.JTextField();
        tfTelf4 = new javax.swing.JTextField();
        jbtnAddDepen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelMedico1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CENTRO MEDICO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfTelf1.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf1.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf1.setToolTipText("");
        tfTelf1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf1.setPreferredSize(new java.awt.Dimension(150, 40));

        tfNombre1.setBackground(new java.awt.Color(255, 255, 255));
        tfNombre1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNombre1.setForeground(new java.awt.Color(0, 0, 0));
        tfNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombre1.setToolTipText("");
        tfNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNombre1.setPreferredSize(new java.awt.Dimension(200, 40));

        tfDisponibilidad1.setBackground(new java.awt.Color(255, 255, 255));
        tfDisponibilidad1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDisponibilidad1.setForeground(new java.awt.Color(0, 0, 0));
        tfDisponibilidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDisponibilidad1.setToolTipText("");
        tfDisponibilidad1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE DE VÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDisponibilidad1.setPreferredSize(new java.awt.Dimension(300, 40));

        btnAceptar1.setForeground(new java.awt.Color(0, 102, 102));
        btnAceptar1.setText("ACEPTAR");
        btnAceptar1.setPreferredSize(new java.awt.Dimension(150, 40));

        btnCancelar.setForeground(new java.awt.Color(0, 102, 102));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe5.setBackground(new java.awt.Color(255, 255, 255));
        tfApe5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe5.setForeground(new java.awt.Color(0, 0, 0));
        tfApe5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe5.setToolTipText("");
        tfApe5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUMERO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe5.setPreferredSize(new java.awt.Dimension(80, 40));

        tfApe6.setBackground(new java.awt.Color(255, 255, 255));
        tfApe6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe6.setForeground(new java.awt.Color(0, 0, 0));
        tfApe6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe6.setToolTipText("");
        tfApe6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESCALERA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe6.setPreferredSize(new java.awt.Dimension(80, 40));

        tfTelf2.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf2.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf2.setToolTipText("");
        tfTelf2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LETRA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf2.setPreferredSize(new java.awt.Dimension(80, 40));

        tfDisponibilidad2.setBackground(new java.awt.Color(255, 255, 255));
        tfDisponibilidad2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDisponibilidad2.setForeground(new java.awt.Color(0, 0, 0));
        tfDisponibilidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDisponibilidad2.setToolTipText("");
        tfDisponibilidad2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PISO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDisponibilidad2.setPreferredSize(new java.awt.Dimension(80, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "TIPO VÍA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboBox1.setPreferredSize(new java.awt.Dimension(100, 40));

        tfTelf3.setEditable(false);
        tfTelf3.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf3.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf3.setToolTipText("");
        tfTelf3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIUDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf3.setPreferredSize(new java.awt.Dimension(150, 40));

        tfTelf4.setEditable(false);
        tfTelf4.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf4.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf4.setToolTipText("");
        tfTelf4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROVINCIA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf4.setPreferredSize(new java.awt.Dimension(150, 40));

        jbtnAddDepen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jbtnAddDepen.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnAddDepen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddDepenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMedico1Layout = new javax.swing.GroupLayout(jPanelMedico1);
        jPanelMedico1.setLayout(jPanelMedico1Layout);
        jPanelMedico1Layout.setHorizontalGroup(
            jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedico1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMedico1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMedico1Layout.createSequentialGroup()
                            .addComponent(jbtnAddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tfTelf3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfTelf4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfApe5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfDisponibilidad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfApe6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMedico1Layout.createSequentialGroup()
                            .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tfTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tfDisponibilidad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelMedico1Layout.setVerticalGroup(
            jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedico1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDisponibilidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfApe5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDisponibilidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTelf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfApe6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTelf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTelf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMedico1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddDepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddDepenActionPerformed
 
    }//GEN-LAST:event_jbtnAddDepenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanelMedico1;
    private javax.swing.JButton jbtnAddDepen;
    private javax.swing.JTextField tfApe5;
    private javax.swing.JTextField tfApe6;
    private javax.swing.JTextField tfDisponibilidad1;
    private javax.swing.JTextField tfDisponibilidad2;
    private javax.swing.JTextField tfNombre1;
    private javax.swing.JTextField tfTelf1;
    private javax.swing.JTextField tfTelf2;
    private javax.swing.JTextField tfTelf3;
    private javax.swing.JTextField tfTelf4;
    // End of variables declaration//GEN-END:variables

    private void initUI() {
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
