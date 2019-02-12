/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BLogic;
import Models.XAsistenteModel;
import Models.XCsModel;
import Models.XDependienteModel;
import Models.XMedicoModel;
import Models.XViviendaModel;
import Utils.SentenciasSQL;
import Utils.Utils;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author vesprada
 */
public class MainView extends javax.swing.JFrame {

    private final static String MAPS_KEY = "%20AIzaSyBXkyYwknSg-vZ446hxBHmVEMshcbujIyo";
    private final static int MAX_MAPS_ZOOM = 21;
    private final static int MIN_MAPS_ZOOM = 5;
    private double currentLat;
    private double currentLng;
    private int currentZoom;
    private BLogic controller;
    private XAsistenteModel asistente;
    private List<Object> listaDependientes;

    private DefaultComboBoxModel medico;
    private DefaultComboBoxModel cSalud;
    private DefaultComboBoxModel vivienda;
    private DefaultComboBoxModel genero;

    /**
     * Creates new form View
     */
    public MainView() {
        initComponents();
        initTabs();
        initMaps();
    }

    public MainView(BLogic controller, XAsistenteModel asistente) {
        this.controller = controller;
        this.asistente = asistente;
        initCombos();
        initComponents();
        initTabs();
        initData();
        initMaps();
        lockEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jTabbedPaneIzq = new javax.swing.JTabbedPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jPaneldependiente = new javax.swing.JPanel();
        jComboBoxDependienteVivienda = new javax.swing.JComboBox<>();
        tfDependienteId = new javax.swing.JTextField();
        tfDependientePass = new javax.swing.JPasswordField();
        jComboBoxDependienteGenero = new javax.swing.JComboBox<>();
        tfDependienteNSS = new javax.swing.JTextField();
        tfDependienteTelf = new javax.swing.JTextField();
        tfDependienteNombre = new javax.swing.JTextField();
        tfDependienteApe1 = new javax.swing.JTextField();
        tfDependienteApe2 = new javax.swing.JTextField();
        tfDependienteEmail = new javax.swing.JTextField();
        dateChooserDependienteAlta = new datechooser.beans.DateChooserCombo();
        dateChooserDependienteNac = new datechooser.beans.DateChooserCombo();
        jPanelProfesionales = new javax.swing.JPanel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabelMedico = new javax.swing.JLabel();
        jComboBoxCS = new javax.swing.JComboBox<>();
        jLabelCS = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jToggleButtonEdit = new javax.swing.JToggleButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelEstado = new javax.swing.JPanel();
        jScrollPaneestado = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jPanelHistorial = new javax.swing.JPanel();
        jPanelViviendas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableViviendas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistorialMed = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableHistorialSoc = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableAllegados = new javax.swing.JTable();
        jButtonSearch1 = new javax.swing.JButton();
        jButtonCancel1 = new javax.swing.JButton();
        jButtonSave1 = new javax.swing.JButton();
        jToggleButtonEdit1 = new javax.swing.JToggleButton();
        jPanelAsistente = new javax.swing.JPanel();
        jPanelAsistenteMod = new javax.swing.JPanel();
        tfAsistenteNombre = new javax.swing.JTextField();
        tfAsistenteApe1 = new javax.swing.JTextField();
        tfAsistenteApe4 = new javax.swing.JTextField();
        tfAsistenteEmail = new javax.swing.JTextField();
        tfAsistenteId1 = new javax.swing.JTextField();
        tfAsistentePass1 = new javax.swing.JPasswordField();
        tfIdAsistenteNSS = new javax.swing.JTextField();
        tfIdAsistenteTelf1 = new javax.swing.JTextField();
        jPanelAsistenteDeps = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableAsistente = new javax.swing.JTable();
        jButtonSearch2 = new javax.swing.JButton();
        jButtonCancel2 = new javax.swing.JButton();
        jButtonSave2 = new javax.swing.JButton();
        jToggleButtonEdit2 = new javax.swing.JToggleButton();
        jTabbedPaneDcha = new javax.swing.JTabbedPane();
        jPanelAlertas = new javax.swing.JPanel();
        jPanelRecursos = new javax.swing.JPanel();
        jButtonLlamadaEmergencias = new javax.swing.JButton();
        jLabelLlamadaEmergencias = new javax.swing.JLabel();
        jButtonLlamadaPolicia = new javax.swing.JButton();
        jLabelLlamadaPolicia = new javax.swing.JLabel();
        jButtonLlamadaBomberos = new javax.swing.JButton();
        jLabelLlamadaBomberos = new javax.swing.JLabel();
        jPanelAlarmas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAlarmas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelLlamadas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableLlamadas = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelGeo = new javax.swing.JPanel();
        jLabelMapcaption = new javax.swing.JLabel();
        jScrollPaneMaps = new javax.swing.JScrollPane();
        jLabelMaps = new javax.swing.JLabel();
        jButtonCenterMap = new javax.swing.JButton();
        jButtonZoomOut = new javax.swing.JButton();
        jButtonZoomIn = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableCoordenadas = new javax.swing.JTable();
        menuBarAsist = new javax.swing.JMenuBar();
        menuAsist = new javax.swing.JMenu();
        itemCerrarSesion = new javax.swing.JMenuItem();
        itemInfo = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                CloseHandler(evt);
            }
        });

        jPanelTitle.setBackground(new java.awt.Color(204, 255, 255));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title background.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneIzq.setBackground(new java.awt.Color(204, 255, 255));

        jPanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        jPaneldependiente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos principales del dependiente"));

        jComboBoxDependienteVivienda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxDependienteVivienda.setModel(vivienda);
        jComboBoxDependienteVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Vivienda"));

        tfDependienteId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteId.setToolTipText("");
        tfDependienteId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Dependiente"));
        tfDependienteId.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteIdActionPerformed(evt);
            }
        });

        tfDependientePass.setText("jPasswordField1");
        tfDependientePass.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        tfDependientePass.setPreferredSize(new java.awt.Dimension(150, 55));

        jComboBoxDependienteGenero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxDependienteGenero.setModel(genero);
        jComboBoxDependienteGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Género"));
        jComboBoxDependienteGenero.setPreferredSize(new java.awt.Dimension(150, 55));

        tfDependienteNSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNSS.setToolTipText("");
        tfDependienteNSS.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº Seguridad Social"));
        tfDependienteNSS.setPreferredSize(new java.awt.Dimension(250, 55));
        tfDependienteNSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteNSSActionPerformed(evt);
            }
        });

        tfDependienteTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteTelf.setToolTipText("");
        tfDependienteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));
        tfDependienteTelf.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteTelfActionPerformed(evt);
            }
        });

        tfDependienteNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNombre.setToolTipText("");
        tfDependienteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        tfDependienteNombre.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteNombreActionPerformed(evt);
            }
        });

        tfDependienteApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe1.setToolTipText("");
        tfDependienteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Apellido"));
        tfDependienteApe1.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteApe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteApe1ActionPerformed(evt);
            }
        });

        tfDependienteApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe2.setToolTipText("");
        tfDependienteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Apellido"));
        tfDependienteApe2.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteApe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteApe2ActionPerformed(evt);
            }
        });

        tfDependienteEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteEmail.setToolTipText("");
        tfDependienteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("email"));
        tfDependienteEmail.setPreferredSize(new java.awt.Dimension(250, 55));
        tfDependienteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteEmailActionPerformed(evt);
            }
        });

        dateChooserDependienteAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Alta"));

        dateChooserDependienteNac.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Nacimiento"));

        javax.swing.GroupLayout jPaneldependienteLayout = new javax.swing.GroupLayout(jPaneldependiente);
        jPaneldependiente.setLayout(jPaneldependienteLayout);
        jPaneldependienteLayout.setHorizontalGroup(
            jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldependienteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneldependienteLayout.createSequentialGroup()
                        .addComponent(tfDependienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfDependienteApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfDependienteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfDependienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaneldependienteLayout.createSequentialGroup()
                        .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDependienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDependientePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDependienteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDependienteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPaneldependienteLayout.setVerticalGroup(
            jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldependienteLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDependienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDependienteApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDependienteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDependienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDependientePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDependienteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDependienteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDependienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jComboBoxDependienteGenero.getAccessibleContext().setAccessibleName("Genero");

        jPanelProfesionales.setBorder(javax.swing.BorderFactory.createTitledBorder("Centro de salud / Profesionales asociados"));

        jComboBoxMedico.setModel(medico);
        jComboBoxMedico.setBorder(javax.swing.BorderFactory.createTitledBorder("Médico"));
        jComboBoxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedicoActionPerformed(evt);
            }
        });

        jLabelMedico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor2.png"))); // NOI18N
        jLabelMedico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelMedico.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelMedico.setOpaque(true);
        jLabelMedico.setPreferredSize(new java.awt.Dimension(250, 122));
        jLabelMedico.setRequestFocusEnabled(false);

        jComboBoxCS.setModel(cSalud);
        jComboBoxCS.setBorder(javax.swing.BorderFactory.createTitledBorder("Centro de Salud"));

        jLabelCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/centrosalud.png"))); // NOI18N
        jLabelCS.setText("jLabel1");
        jLabelCS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelCS.setPreferredSize(new java.awt.Dimension(232, 122));
        jLabelCS.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanelProfesionalesLayout = new javax.swing.GroupLayout(jPanelProfesionales);
        jPanelProfesionales.setLayout(jPanelProfesionalesLayout);
        jPanelProfesionalesLayout.setHorizontalGroup(
            jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanelProfesionalesLayout.setVerticalGroup(
            jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoBuscar25x25.png"))); // NOI18N

        jToggleButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditar25x25.png"))); // NOI18N
        jToggleButtonEdit.setText("Editar");
        jToggleButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEditActionPerformed(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardar25x25.png"))); // NOI18N

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconoCancelar25x25.png"))); // NOI18N

        jPanelEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del dependiente"));

        jScrollPaneestado.setPreferredSize(new java.awt.Dimension(600, 403));

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableEstado.setPreferredSize(new java.awt.Dimension(500, 80));
        jScrollPaneestado.setViewportView(jTableEstado);

        javax.swing.GroupLayout jPanelEstadoLayout = new javax.swing.GroupLayout(jPanelEstado);
        jPanelEstado.setLayout(jPanelEstadoLayout);
        jPanelEstadoLayout.setHorizontalGroup(
            jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEstadoLayout.setVerticalGroup(
            jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneestado, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jToggleButtonEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSearch))
                    .addComponent(jPaneldependiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProfesionales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jToggleButtonEdit)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneldependiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneIzq.addTab("Dependiente (Datos principales)", null, jPanelPrincipal, "");

        jPanelViviendas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos adicionales del dependiente"));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder("Viviendas"));

        jTableViviendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTableViviendas);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial medico"));

        jTableHistorialMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableHistorialMed);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial social"));

        jTableHistorialSoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableHistorialSoc);

        jScrollPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Allegados"));

        jTableAllegados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTableAllegados);

        javax.swing.GroupLayout jPanelViviendasLayout = new javax.swing.GroupLayout(jPanelViviendas);
        jPanelViviendas.setLayout(jPanelViviendasLayout);
        jPanelViviendasLayout.setHorizontalGroup(
            jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViviendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanelViviendasLayout.setVerticalGroup(
            jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViviendasLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanelViviendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane3, jScrollPane4, jScrollPane6});

        jButtonSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoBuscar25x25.png"))); // NOI18N
        jButtonSearch1.setText("Buscar");

        jButtonCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconoCancelar25x25.png"))); // NOI18N
        jButtonCancel1.setText("Cancelar");

        jButtonSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardar25x25.png"))); // NOI18N
        jButtonSave1.setText("Guardar Cambios");

        jToggleButtonEdit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditar25x25.png"))); // NOI18N
        jToggleButtonEdit1.setText("Editar");
        jToggleButtonEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEdit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHistorialLayout = new javax.swing.GroupLayout(jPanelHistorial);
        jPanelHistorial.setLayout(jPanelHistorialLayout);
        jPanelHistorialLayout.setHorizontalGroup(
            jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHistorialLayout.createSequentialGroup()
                        .addComponent(jToggleButtonEdit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                        .addComponent(jButtonSearch1))
                    .addComponent(jPanelViviendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHistorialLayout.setVerticalGroup(
            jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistorialLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch1)
                    .addComponent(jToggleButtonEdit1)
                    .addComponent(jButtonSave1)
                    .addComponent(jButtonCancel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPaneIzq.addTab("Dependiente (Historial, vivienda y allegados)", jPanelHistorial);

        jPanelAsistenteMod.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del asistente"));

        tfAsistenteNombre.setToolTipText("");
        tfAsistenteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        tfAsistenteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsistenteNombreActionPerformed(evt);
            }
        });

        tfAsistenteApe1.setToolTipText("");
        tfAsistenteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Apellido"));
        tfAsistenteApe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsistenteApe1ActionPerformed(evt);
            }
        });

        tfAsistenteApe4.setToolTipText("");
        tfAsistenteApe4.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Apellido"));
        tfAsistenteApe4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsistenteApe4ActionPerformed(evt);
            }
        });

        tfAsistenteEmail.setToolTipText("");
        tfAsistenteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("email"));
        tfAsistenteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsistenteEmailActionPerformed(evt);
            }
        });

        tfAsistenteId1.setToolTipText("");
        tfAsistenteId1.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Dependiente"));
        tfAsistenteId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsistenteId1ActionPerformed(evt);
            }
        });

        tfAsistentePass1.setText("jPasswordField1");
        tfAsistentePass1.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));

        tfIdAsistenteNSS.setToolTipText("");
        tfIdAsistenteNSS.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        tfIdAsistenteNSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdAsistenteNSSActionPerformed(evt);
            }
        });

        tfIdAsistenteTelf1.setToolTipText("");
        tfIdAsistenteTelf1.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));
        tfIdAsistenteTelf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdAsistenteTelf1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsistenteModLayout = new javax.swing.GroupLayout(jPanelAsistenteMod);
        jPanelAsistenteMod.setLayout(jPanelAsistenteModLayout);
        jPanelAsistenteModLayout.setHorizontalGroup(
            jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                        .addComponent(tfAsistenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAsistenteApe1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAsistenteApe4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAsistenteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                        .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                                .addComponent(tfAsistenteId1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAsistentePass1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                                .addComponent(tfIdAsistenteTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfIdAsistenteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAsistenteModLayout.setVerticalGroup(
            jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAsistenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAsistenteApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAsistenteApe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAsistenteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAsistenteId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAsistentePass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIdAsistenteTelf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdAsistenteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAsistenteDeps.setBorder(javax.swing.BorderFactory.createTitledBorder("Dependientes asociados"));

        jTableAsistente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTableAsistente);

        javax.swing.GroupLayout jPanelAsistenteDepsLayout = new javax.swing.GroupLayout(jPanelAsistenteDeps);
        jPanelAsistenteDeps.setLayout(jPanelAsistenteDepsLayout);
        jPanelAsistenteDepsLayout.setHorizontalGroup(
            jPanelAsistenteDepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistenteDepsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanelAsistenteDepsLayout.setVerticalGroup(
            jPanelAsistenteDepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistenteDepsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoBuscar25x25.png"))); // NOI18N

        jButtonCancel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconoCancelar25x25.png"))); // NOI18N

        jButtonSave2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardar25x25.png"))); // NOI18N

        jToggleButtonEdit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditar25x25.png"))); // NOI18N
        jToggleButtonEdit2.setText("Editar");
        jToggleButtonEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEdit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAsistenteLayout = new javax.swing.GroupLayout(jPanelAsistente);
        jPanelAsistente.setLayout(jPanelAsistenteLayout);
        jPanelAsistenteLayout.setHorizontalGroup(
            jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAsistenteMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAsistenteDeps, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAsistenteLayout.createSequentialGroup()
                        .addComponent(jToggleButtonEdit2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 575, Short.MAX_VALUE)
                        .addComponent(jButtonSearch2)))
                .addContainerGap())
        );
        jPanelAsistenteLayout.setVerticalGroup(
            jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAsistenteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch2)
                    .addComponent(jToggleButtonEdit2)
                    .addComponent(jButtonSave2)
                    .addComponent(jButtonCancel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsistenteMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAsistenteDeps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(344, Short.MAX_VALUE))
        );

        jTabbedPaneIzq.addTab("Asistente", null, jPanelAsistente, "");

        jPanelAlertas.setBackground(new java.awt.Color(204, 204, 204));

        jPanelRecursos.setBorder(javax.swing.BorderFactory.createTitledBorder("Emergencias y otros recursos"));

        jButtonLlamadaEmergencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_hospital100x100.png"))); // NOI18N
        jButtonLlamadaEmergencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLlamadaEmergenciasActionPerformed(evt);
            }
        });

        jLabelLlamadaEmergencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLlamadaEmergencias.setText("Emergencias");

        jButtonLlamadaPolicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_policia100x100px.png"))); // NOI18N
        jButtonLlamadaPolicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLlamadaPoliciaActionPerformed(evt);
            }
        });

        jLabelLlamadaPolicia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLlamadaPolicia.setText("Policia");

        jButtonLlamadaBomberos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btn_bomberos100x100px.png"))); // NOI18N
        jButtonLlamadaBomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLlamadaBomberosActionPerformed(evt);
            }
        });

        jLabelLlamadaBomberos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLlamadaBomberos.setText("Bomberos");

        javax.swing.GroupLayout jPanelRecursosLayout = new javax.swing.GroupLayout(jPanelRecursos);
        jPanelRecursos.setLayout(jPanelRecursosLayout);
        jPanelRecursosLayout.setHorizontalGroup(
            jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecursosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLlamadaEmergencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLlamadaEmergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLlamadaPolicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLlamadaPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLlamadaBomberos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLlamadaBomberos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanelRecursosLayout.setVerticalGroup(
            jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecursosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLlamadaBomberos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLlamadaPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLlamadaEmergencias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLlamadaBomberos)
                    .addComponent(jLabelLlamadaPolicia)
                    .addComponent(jLabelLlamadaEmergencias))
                .addGap(0, 0, 0))
        );

        jPanelAlarmas.setBorder(javax.swing.BorderFactory.createTitledBorder("Alarmas"));

        jTableAlarmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableAlarmas);

        jButton2.setText("Desactivar alarma");

        jButton3.setText("Limpiar alarma desactivadas");

        javax.swing.GroupLayout jPanelAlarmasLayout = new javax.swing.GroupLayout(jPanelAlarmas);
        jPanelAlarmas.setLayout(jPanelAlarmasLayout);
        jPanelAlarmasLayout.setHorizontalGroup(
            jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlarmasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlarmasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanelAlarmasLayout.setVerticalGroup(
            jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlarmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanelLlamadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Avisos"));

        jTableLlamadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTableLlamadas);

        jButton4.setText("Desactivar alarma");

        jButton5.setText("Limpiar alarma desactivadas");

        javax.swing.GroupLayout jPanelLlamadasLayout = new javax.swing.GroupLayout(jPanelLlamadas);
        jPanelLlamadas.setLayout(jPanelLlamadasLayout);
        jPanelLlamadasLayout.setHorizontalGroup(
            jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLlamadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLlamadasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanelLlamadasLayout.setVerticalGroup(
            jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLlamadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelAlertasLayout = new javax.swing.GroupLayout(jPanelAlertas);
        jPanelAlertas.setLayout(jPanelAlertasLayout);
        jPanelAlertasLayout.setHorizontalGroup(
            jPanelAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlertasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAlarmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRecursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLlamadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAlertasLayout.setVerticalGroup(
            jPanelAlertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlertasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAlarmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLlamadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneDcha.addTab("Alertas y llamadas", jPanelAlertas);

        jLabelMapcaption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMapcaption.setText("Ubicación del dependiente en tiempo real");

        jScrollPaneMaps.setViewportView(jLabelMaps);

        jButtonCenterMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/center.png"))); // NOI18N
        jButtonCenterMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenterMapActionPerformed(evt);
            }
        });

        jButtonZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoomout.png"))); // NOI18N
        jButtonZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZoomOutActionPerformed(evt);
            }
        });

        jButtonZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoomin.png"))); // NOI18N
        jButtonZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZoomInActionPerformed(evt);
            }
        });

        jTableCoordenadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jTableCoordenadas);

        javax.swing.GroupLayout jPanelGeoLayout = new javax.swing.GroupLayout(jPanelGeo);
        jPanelGeo.setLayout(jPanelGeoLayout);
        jPanelGeoLayout.setHorizontalGroup(
            jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMapcaption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addGroup(jPanelGeoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGeoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane10)
                                .addGap(16, 16, 16)
                                .addComponent(jButtonZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCenterMap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPaneMaps))))
                .addContainerGap())
        );
        jPanelGeoLayout.setVerticalGroup(
            jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGeoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMapcaption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGeoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonZoomIn)
                    .addComponent(jButtonZoomOut)
                    .addComponent(jButtonCenterMap)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPaneDcha.addTab("Geolocalización", jPanelGeo);

        menuAsist.setText("Inicio");

        itemCerrarSesion.setText("Cerrar Sesion");
        menuAsist.add(itemCerrarSesion);

        itemInfo.setText("Información");
        menuAsist.add(itemInfo);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuAsist.add(itemSalir);

        menuBarAsist.add(menuAsist);

        setJMenuBar(menuBarAsist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPaneIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPaneDcha)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneIzq)
                    .addComponent(jTabbedPaneDcha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneIzq.getAccessibleContext().setAccessibleName("Dependientes");
        jTabbedPaneIzq.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDependienteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteEmailActionPerformed

    private void tfDependienteApe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteApe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteApe2ActionPerformed

    private void tfDependienteApe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteApe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteApe1ActionPerformed

    private void tfDependienteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteNombreActionPerformed

    private void tfDependienteTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteTelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteTelfActionPerformed

    private void tfDependienteNSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteNSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteNSSActionPerformed

    private void tfDependienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteIdActionPerformed

    private void tfAsistenteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteNombreActionPerformed

    private void tfAsistenteApe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteApe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteApe1ActionPerformed

    private void tfAsistenteApe4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteApe4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteApe4ActionPerformed

    private void tfAsistenteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteEmailActionPerformed

    private void tfAsistenteId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteId1ActionPerformed

    private void tfIdAsistenteNSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdAsistenteNSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdAsistenteNSSActionPerformed

    private void tfIdAsistenteTelf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdAsistenteTelf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdAsistenteTelf1ActionPerformed

    private void jButtonCenterMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenterMapActionPerformed
        this.centerScroll();
    }//GEN-LAST:event_jButtonCenterMapActionPerformed

    private void jButtonZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZoomOutActionPerformed
        if (currentZoom > MIN_MAPS_ZOOM) {
            currentZoom--;
            initMaps(currentLat, currentLng, currentZoom);
        }
        mapButtonsAvailable();
    }//GEN-LAST:event_jButtonZoomOutActionPerformed

    private void jButtonZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZoomInActionPerformed
        if (currentZoom < MAX_MAPS_ZOOM) {
            currentZoom++;
            initMaps(currentLat, currentLng, currentZoom);
        }
        mapButtonsAvailable();
    }//GEN-LAST:event_jButtonZoomInActionPerformed

    private void CloseHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_CloseHandler
        this.controller.getHibernate().logOffAndClose();
    }//GEN-LAST:event_CloseHandler

    private void jComboBoxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMedicoActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void jButtonLlamadaEmergenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLlamadaEmergenciasActionPerformed
        JOptionPane.showMessageDialog(null, "Se esta llamando al servicio emergencias");
        //Necesita ser probado
    }//GEN-LAST:event_jButtonLlamadaEmergenciasActionPerformed

    private void jButtonLlamadaPoliciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLlamadaPoliciaActionPerformed
        JOptionPane.showMessageDialog(null, "Se esta llamando al servicio de policía");
        //Necesita ser probado
    }//GEN-LAST:event_jButtonLlamadaPoliciaActionPerformed

    private void jButtonLlamadaBomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLlamadaBomberosActionPerformed
        JOptionPane.showMessageDialog(null, "Se esta llamando al servicio de Bomberos");
        //Necesita ser probado
    }//GEN-LAST:event_jButtonLlamadaBomberosActionPerformed

    private void jToggleButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEditActionPerformed
        lockEnabled(jToggleButtonEdit.isSelected());
    }//GEN-LAST:event_jToggleButtonEditActionPerformed

    private void jToggleButtonEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEdit1ActionPerformed
        lockEnabled(jToggleButtonEdit1.isSelected());
    }//GEN-LAST:event_jToggleButtonEdit1ActionPerformed

    private void jToggleButtonEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEdit2ActionPerformed
        lockEnabled(jToggleButtonEdit2.isSelected());
    }//GEN-LAST:event_jToggleButtonEdit2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserDependienteAlta;
    private datechooser.beans.DateChooserCombo dateChooserDependienteNac;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemInfo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCancel1;
    private javax.swing.JButton jButtonCancel2;
    private javax.swing.JButton jButtonCenterMap;
    private javax.swing.JButton jButtonLlamadaBomberos;
    private javax.swing.JButton jButtonLlamadaEmergencias;
    private javax.swing.JButton jButtonLlamadaPolicia;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSave1;
    private javax.swing.JButton jButtonSave2;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JButton jButtonSearch2;
    private javax.swing.JButton jButtonZoomIn;
    private javax.swing.JButton jButtonZoomOut;
    private javax.swing.JComboBox<XCsModel> jComboBoxCS;
    private javax.swing.JComboBox<String> jComboBoxDependienteGenero;
    private javax.swing.JComboBox<XViviendaModel> jComboBoxDependienteVivienda;
    private javax.swing.JComboBox<XMedicoModel> jComboBoxMedico;
    private javax.swing.JLabel jLabelCS;
    private javax.swing.JLabel jLabelLlamadaBomberos;
    private javax.swing.JLabel jLabelLlamadaEmergencias;
    private javax.swing.JLabel jLabelLlamadaPolicia;
    private javax.swing.JLabel jLabelMapcaption;
    private javax.swing.JLabel jLabelMaps;
    private javax.swing.JLabel jLabelMedico;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelAlarmas;
    private javax.swing.JPanel jPanelAlertas;
    private javax.swing.JPanel jPanelAsistente;
    private javax.swing.JPanel jPanelAsistenteDeps;
    private javax.swing.JPanel jPanelAsistenteMod;
    private javax.swing.JPanel jPanelEstado;
    private javax.swing.JPanel jPanelGeo;
    private javax.swing.JPanel jPanelHistorial;
    private javax.swing.JPanel jPanelLlamadas;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProfesionales;
    private javax.swing.JPanel jPanelRecursos;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelViviendas;
    private javax.swing.JPanel jPaneldependiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneMaps;
    private javax.swing.JScrollPane jScrollPaneestado;
    private javax.swing.JTabbedPane jTabbedPaneDcha;
    private javax.swing.JTabbedPane jTabbedPaneIzq;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAlarmas;
    private javax.swing.JTable jTableAllegados;
    private javax.swing.JTable jTableAsistente;
    private javax.swing.JTable jTableCoordenadas;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTable jTableHistorialMed;
    private javax.swing.JTable jTableHistorialSoc;
    private javax.swing.JTable jTableLlamadas;
    private javax.swing.JTable jTableViviendas;
    private javax.swing.JToggleButton jToggleButtonEdit;
    private javax.swing.JToggleButton jToggleButtonEdit1;
    private javax.swing.JToggleButton jToggleButtonEdit2;
    private javax.swing.JMenu menuAsist;
    private javax.swing.JMenuBar menuBarAsist;
    private javax.swing.JTextField tfAsistenteApe1;
    private javax.swing.JTextField tfAsistenteApe4;
    private javax.swing.JTextField tfAsistenteEmail;
    private javax.swing.JTextField tfAsistenteId1;
    private javax.swing.JTextField tfAsistenteNombre;
    private javax.swing.JPasswordField tfAsistentePass1;
    private javax.swing.JTextField tfDependienteApe1;
    private javax.swing.JTextField tfDependienteApe2;
    private javax.swing.JTextField tfDependienteEmail;
    private javax.swing.JTextField tfDependienteId;
    private javax.swing.JTextField tfDependienteNSS;
    private javax.swing.JTextField tfDependienteNombre;
    private javax.swing.JPasswordField tfDependientePass;
    private javax.swing.JTextField tfDependienteTelf;
    private javax.swing.JTextField tfIdAsistenteNSS;
    private javax.swing.JTextField tfIdAsistenteTelf1;
    // End of variables declaration//GEN-END:variables

    //Métodos de la vista
    private void initMaps() {
        try {
            //iniciamos el mapa en una ubicación preestablecida
            currentZoom = 18;
            currentLat = 38.346041;
            currentLng = -0.484756;

            String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?"
                    + "markers=icon:https://img.icons8.com/windows/32/000000/mental-state.png|" + currentLat + "," + currentLng
                    //+ "markers=|38.346041,-0.484756"
                    + "&zoom=" + currentZoom
                    + "&size=1612x1612"
                    + "&scale=2"
                    + "&maptype=roadmap"
                    + "&key=%20AIzaSyBXkyYwknSg-vZ446hxBHmVEMshcbujIyo&format=jpg";
            String destinationFile = "img/image.jpg";
            String str = destinationFile;
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        this.jLabelMaps.setIcon(new ImageIcon((new ImageIcon("img/image.jpg")).getImage().getScaledInstance(1280, 1280,
                java.awt.Image.SCALE_SMOOTH)));
        jPanelGeo.repaint();

    }

    private void initMaps(double lat, double lng, int zoom) {
        try {
            String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?"
                    + "markers=icon:https://img.icons8.com/windows/32/000000/mental-state.png|" + lat + "," + lng
                    //+ "markers=|38.346041,-0.484756"
                    + "&zoom=" + zoom
                    + "&size=1612x1612"
                    + "&scale=2"
                    + "&maptype=roadmap"
                    + "&key=" + MAPS_KEY
                    + "&format=jpg";
            String destinationFile = "img/image.jpg";
            String str = destinationFile;
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        this.jLabelMaps.setIcon(new ImageIcon((new ImageIcon("img/image.jpg")).getImage().getScaledInstance(1280, 1280,
                java.awt.Image.SCALE_SMOOTH)));
        jPanelGeo.repaint();

    }

    public void centerScroll() {
        //Set the scrollPane to the middle
        Rectangle bounds = this.jScrollPaneMaps.getViewport().getViewRect();
        Dimension size = this.jScrollPaneMaps.getViewport().getViewSize();

        int x = (size.width - bounds.width) / 2;
        int y = (size.height - bounds.height) / 2;

        this.jScrollPaneMaps.getViewport().setViewPosition(new Point(x, y));
    }

    private void initTabs() {
        this.jTabbedPaneDcha.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (jTabbedPaneDcha.getSelectedIndex() == 1) {
                    centerScroll();
                }
            }
        });
    }

    //Crontolamos los botones del zoom del maps, en base a la valor de la variable currentZoom
    private void mapButtonsAvailable() {
        if (currentZoom > MIN_MAPS_ZOOM && currentZoom < MAX_MAPS_ZOOM) {
            this.jButtonZoomOut.setEnabled(true);
            this.jButtonZoomIn.setEnabled(true);
        }
        if (currentZoom == MIN_MAPS_ZOOM) {
            this.jButtonZoomOut.setEnabled(false);
        }
        if (currentZoom == MAX_MAPS_ZOOM) {
            this.jButtonZoomIn.setEnabled(false);
        }
    }

    //Llenamos las tablas y los combos de la aplicacion
    private void initData() {
        
        //Llenamos datos del asistente
        cargarAsistente();
        
        //Llenamos datos del dependiente (primer id por defecto)
        List<Object> listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
        cargadependiente(listaDependientes.get(0));

        //Llenar combos
        List<Object> listaMed = this.controller.cargarDatos(XMedicoModel.class);
        for (Object o : listaMed) {
            medico.addElement((XMedicoModel) o);
        }
        List<Object> listaCs = this.controller.cargarDatos(XCsModel.class);
        for (Object o : listaCs) {
            cSalud.addElement((XCsModel) o);
        }
        List<Object> listaViviendas = this.controller.cargarDatos("from XViviendaModel order by habitual desc");
        for (Object o : listaViviendas) {
            vivienda.addElement((XViviendaModel) o);
        }
        genero.addElement("Hombre");
        genero.addElement("Mujer");
        genero.addElement("Indefinido");

        //Llenar tablas. 
        this.jTableAlarmas.setModel(controller.cargarResultSet(SentenciasSQL.alarmasTM, null));
        Utils.resizeColumnWidth(this.jTableAlarmas);
    }

    private void initCombos() {
        medico = new DefaultComboBoxModel();
        cSalud = new DefaultComboBoxModel();
        vivienda = new DefaultComboBoxModel();
        genero = new DefaultComboBoxModel();
    }

    //Asignamos los datos del dependiente seleccionado en los respectivos campos del panel
    private void cargadependiente(Object dependiente) {
        XDependienteModel dep = (XDependienteModel) dependiente;
        this.tfDependienteNombre.setText(dep.getXPersonaModel().getName());
        this.tfDependienteApe1.setText(dep.getXPersonaModel().getApellido1());
        this.tfDependienteApe2.setText(dep.getXPersonaModel().getApellido2());
        this.tfDependienteEmail.setText(dep.getXPersonaModel().getEmail());
        this.tfDependienteId.setText(String.valueOf(dep.getId()));
        this.tfDependientePass.setText(dep.getPassword());
        this.tfDependienteTelf.setText(dep.getXPersonaModel().getTelefono());
        this.tfDependienteNSS.setText(dep.getNss());

        //Fechas
        Calendar alta = Calendar.getInstance();
        alta.setTime(dep.getFecAlta());
        this.dateChooserDependienteAlta.setSelectedDate(alta);

        Calendar nac = Calendar.getInstance();
        nac.setTime(dep.getFecNacim());
        this.dateChooserDependienteNac.setSelectedDate(nac);

        setCombos(dep);
        setTables(dep);
    }

    private void setCombos(XDependienteModel dep) {
        medico.setSelectedItem(dep.getXMedicoModel());
        cSalud.setSelectedItem(dep.getXCsModel());
        genero.setSelectedItem(dep.getGenero());
        // Las viviendas ya están ordenadas de modo que la primera es la actual. no es necesario seleccionarlas aquí
    }

    private void setTables(XDependienteModel dep) {
        this.jTableViviendas.setModel(controller.cargarResultSet(SentenciasSQL.viviendasTM, dep));
        Utils.resizeColumnWidth(this.jTableViviendas);
        this.jTableHistorialMed.setModel(controller.cargarResultSet(SentenciasSQL.historialMedicoTM, dep));
        Utils.resizeColumnWidth(this.jTableHistorialMed);
        this.jTableHistorialSoc.setModel(controller.cargarResultSet(SentenciasSQL.historialSocialTM, dep));
        Utils.resizeColumnWidth(this.jTableHistorialSoc);
        this.jTableAllegados.setModel(controller.cargarResultSet(SentenciasSQL.allegadosTM, dep));
        Utils.resizeColumnWidth(this.jTableAllegados);
        this.jTableCoordenadas.setModel(controller.cargarResultSet(SentenciasSQL.coordenadasTM, dep));
        Utils.resizeColumnWidth(this.jTableCoordenadas);
        this.jTableLlamadas.setModel(controller.cargarResultSet(SentenciasSQL.avisosTM, dep));
        Utils.resizeColumnWidth(this.jTableLlamadas);
        this.jTableEstado.setModel(controller.cargarResultSet(SentenciasSQL.estadoTM, dep));
        Utils.resizeColumnWidth(this.jTableEstado);
    }

    private void lockEnabled(boolean enabled) {
        //Panel dependiente
        this.tfDependienteNombre.setEnabled(enabled);
        this.tfDependienteApe1.setEnabled(enabled);
        this.tfDependienteApe2.setEnabled(enabled);
        this.tfDependienteEmail.setEnabled(enabled);
        this.tfDependienteId.setEnabled(enabled);
        this.tfDependientePass.setEnabled(enabled);
        this.tfDependienteTelf.setEnabled(enabled);
        this.tfDependienteNSS.setEnabled(enabled);
        this.dateChooserDependienteAlta.setEnabled(enabled);
        this.dateChooserDependienteNac.setEnabled(enabled);
        this.jComboBoxDependienteVivienda.setEnabled(enabled);
        this.jComboBoxDependienteGenero.setEnabled(enabled);
        this.jComboBoxMedico.setEnabled(enabled);
        this.jComboBoxCS.setEnabled(enabled);
    }

    private void cargarAsistente() {
        this.tfAsistenteNombre.setText(asistente.getXPersonaModel().getName());
        this.tfAsistenteApe1.setText(asistente.getXPersonaModel().getApellido1());
        this.tfAsistenteApe4.setText(asistente.getXPersonaModel().getApellido2());
        this.tfAsistenteEmail.setText(asistente.getXPersonaModel().getEmail());
        this.tfAsistenteId1.setText(String.valueOf(asistente.getId()));
        this.tfAsistentePass1.setText(asistente.getPassword());
        this.tfIdAsistenteNSS.setText(asistente.getXPersonaModel().getDni());
        this.tfIdAsistenteTelf1.setText(asistente.getXPersonaModel().getTelefono());
    }

}
