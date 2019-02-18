package View;

import Controller.BLogic;
import Models.XCiudadModel;
import Models.XFamiliarModel;
import Models.XProvinciaModel;
import Utils.SentenciasSQL;
import Utils.Utils;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Yop
 */
public class FamilyMan extends javax.swing.JDialog {

    private final String CITY = "CIUDADES";
    private XFamiliarModel family;
    private List<Object> listaCiudades;
    private BLogic controller;
    private XCiudadModel ciudad;

    public FamilyMan(java.awt.Frame parent, boolean modal, List<Object> listaCiudades, BLogic controller) {
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.family = new XFamiliarModel();
        this.listaCiudades = listaCiudades;
        setUI();
    }

    public FamilyMan(java.awt.Frame parent, boolean modal, List<Object> listaCiudades, BLogic controller, Object datos) {
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.family = (XFamiliarModel) datos;
        this.listaCiudades = listaCiudades;
        fillUI();
        setUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDireccion = new javax.swing.JPanel();
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
        jbtnAyuda3 = new javax.swing.JButton();
        jPanelAllegado = new javax.swing.JPanel();
        tfTelf = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApe1 = new javax.swing.JTextField();
        tfApe2 = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfRelacion = new javax.swing.JTextField();
        tfDisponibilidad = new javax.swing.JTextField();
        tfObserv = new javax.swing.JTextField();
        tfDNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DIRECCIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

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

        jComboTipo.setBackground(new java.awt.Color(255, 255, 255));
        jComboTipo.setForeground(new java.awt.Color(0, 0, 0));
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

        jbtnSearchCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
        jbtnSearchCity.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnSearchCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchCityActionPerformed(evt);
            }
        });

        jCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox.setText("Tiene llaves");
        jCheckBox.setPreferredSize(new java.awt.Dimension(150, 40));

        jbtnAyuda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        jbtnAyuda3.setPreferredSize(new java.awt.Dimension(40, 40));
        jbtnAyuda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAyuda3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDireccionLayout = new javax.swing.GroupLayout(jPanelDireccion);
        jPanelDireccion.setLayout(jPanelDireccionLayout);
        jPanelDireccionLayout.setHorizontalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDireccionLayout.createSequentialGroup()
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfNomVia, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelDireccionLayout.createSequentialGroup()
                            .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(jbtnAyuda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDireccionLayout.createSequentialGroup()
                            .addComponent(jbtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(tfNomCity, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addComponent(tfPiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16)
                            .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
        );
        jPanelDireccionLayout.setVerticalGroup(
            jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDireccionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnSearchCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAyuda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanelAllegado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DATOS DEL ALLEGADO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        tfTelf.setBackground(new java.awt.Color(255, 255, 255));
        tfTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfTelf.setForeground(new java.awt.Color(0, 0, 0));
        tfTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelf.setToolTipText("");
        tfTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "TELËFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfTelf.setPreferredSize(new java.awt.Dimension(150, 40));

        tfNombre.setBackground(new java.awt.Color(255, 255, 255));
        tfNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(0, 0, 0));
        tfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombre.setToolTipText("");
        tfNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfNombre.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe1.setBackground(new java.awt.Color(255, 255, 255));
        tfApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe1.setForeground(new java.awt.Color(0, 0, 0));
        tfApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe1.setToolTipText("");
        tfApe1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "PRIMER APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe1.setPreferredSize(new java.awt.Dimension(150, 40));

        tfApe2.setBackground(new java.awt.Color(255, 255, 255));
        tfApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfApe2.setForeground(new java.awt.Color(0, 0, 0));
        tfApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfApe2.setToolTipText("");
        tfApe2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEGUNDO APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfApe2.setPreferredSize(new java.awt.Dimension(150, 40));

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.setToolTipText("");
        tfEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfEmail.setPreferredSize(new java.awt.Dimension(150, 40));

        tfRelacion.setEditable(false);
        tfRelacion.setBackground(new java.awt.Color(255, 255, 255));
        tfRelacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfRelacion.setForeground(new java.awt.Color(0, 0, 0));
        tfRelacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRelacion.setToolTipText("");
        tfRelacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "RELACIÓN", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfRelacion.setPreferredSize(new java.awt.Dimension(150, 40));

        tfDisponibilidad.setEditable(false);
        tfDisponibilidad.setBackground(new java.awt.Color(255, 255, 255));
        tfDisponibilidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDisponibilidad.setForeground(new java.awt.Color(0, 0, 0));
        tfDisponibilidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDisponibilidad.setToolTipText("");
        tfDisponibilidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "DISPONIBILIDAD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDisponibilidad.setPreferredSize(new java.awt.Dimension(150, 40));

        tfObserv.setEditable(false);
        tfObserv.setBackground(new java.awt.Color(255, 255, 255));
        tfObserv.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfObserv.setForeground(new java.awt.Color(0, 0, 0));
        tfObserv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfObserv.setToolTipText("");
        tfObserv.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "OBSERVACIONES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfObserv.setPreferredSize(new java.awt.Dimension(150, 40));

        tfDNI.setBackground(new java.awt.Color(255, 255, 255));
        tfDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDNI.setForeground(new java.awt.Color(0, 0, 0));
        tfDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDNI.setToolTipText("");
        tfDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "D.N.I", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDNI.setPreferredSize(new java.awt.Dimension(150, 40));
        tfDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDNIFocusGained(evt);
            }
        });
        tfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDNIKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfDNIKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelAllegadoLayout = new javax.swing.GroupLayout(jPanelAllegado);
        jPanelAllegado.setLayout(jPanelAllegadoLayout);
        jPanelAllegadoLayout.setHorizontalGroup(
            jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfDisponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAllegadoLayout.createSequentialGroup()
                        .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                        .addComponent(tfRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfObserv, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanelAllegadoLayout.setVerticalGroup(
            jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAllegadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelAllegadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfObserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAllegado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAllegado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSearchCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchCityActionPerformed
        Search search = new Search(null, true, listaCiudades, CITY);
        if (search.getObject() != null) {
            ciudad = (XCiudadModel) search.getObject();
            this.tfNomCity.setText(ciudad.getName());
            this.tfNomProv.setText(((XProvinciaModel) controller.cargarDatos(XProvinciaModel.class, SentenciasSQL.objectDatosId, ciudad.getXProvinciaModel().getId())).getName());
        }
    }//GEN-LAST:event_jbtnSearchCityActionPerformed

    private void tfDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDNIFocusGained
        this.tfDNI.selectAll();
    }//GEN-LAST:event_tfDNIFocusGained

    private void tfDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDNIKeyReleased
        if (this.tfDNI.getText().length() == 8) {
            this.tfDNI.setText(Utils.laLetra(this.tfDNI.getText()));
            this.tfDNI.selectAll();
        }
    }//GEN-LAST:event_tfDNIKeyReleased

    private void tfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDNIKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tfDNI.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfDNIKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        family = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
 
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jbtnAyuda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAyuda3ActionPerformed
        JOptionPane.showMessageDialog(this, "Los campos obligatorios son: La Ciudad, Nombre de Via y el Numero");
    }//GEN-LAST:event_jbtnAyuda3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JPanel jPanelAllegado;
    private javax.swing.JPanel jPanelDireccion;
    private javax.swing.JButton jbtnAyuda3;
    private javax.swing.JButton jbtnSearchCity;
    private javax.swing.JTextField tfApe1;
    private javax.swing.JTextField tfApe2;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDisponibilidad;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEsc;
    private javax.swing.JTextField tfLetra;
    private javax.swing.JTextField tfNomCity;
    private javax.swing.JTextField tfNomProv;
    private javax.swing.JTextField tfNomVia;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNum;
    private javax.swing.JTextField tfObserv;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfRelacion;
    private javax.swing.JTextField tfTelf;
    // End of variables declaration//GEN-END:variables

    private void setUI() {
        this.jComboTipo.setModel(Utils.listaTipo());
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void fillUI() {

    }

    public XFamiliarModel getFamily() {
        return family;
    }

}
