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
import Utils.JasperClient;
import Utils.PdfFromXmlFile;
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
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private XDependienteModel dep;
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
        tfDependienteDNI = new javax.swing.JTextField();
        jbtnAddCasa = new javax.swing.JButton();
        jPanelProfesionales = new javax.swing.JPanel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabelMedico = new javax.swing.JLabel();
        jComboBoxCS = new javax.swing.JComboBox<>();
        jLabelCS = new javax.swing.JLabel();
        jbtnAddCenSal = new javax.swing.JButton();
        jbtnAddMedico = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelEstado = new javax.swing.JPanel();
        jScrollPaneestado = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jbtnMod = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtnRemov = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnAddDepen = new javax.swing.JButton();
        jPanelHistorial = new javax.swing.JPanel();
        jPanelViviendas = new javax.swing.JPanel();
        jScrollPaneViv = new javax.swing.JScrollPane();
        jTableViviendas = new javax.swing.JTable();
        jScrollPaneHmed = new javax.swing.JScrollPane();
        jTableHistorialMed = new javax.swing.JTable();
        jScrollPaneHsoc = new javax.swing.JScrollPane();
        jTableHistorialSoc = new javax.swing.JTable();
        jScrollPaneAlleg = new javax.swing.JScrollPane();
        jTableAllegados = new javax.swing.JTable();
        jPanelAsistente = new javax.swing.JPanel();
        jPanelAsistenteMod = new javax.swing.JPanel();
        tfAsistenteNombre = new javax.swing.JTextField();
        tfAsistenteApe1 = new javax.swing.JTextField();
        tfAsistenteApe2 = new javax.swing.JTextField();
        tfAsistenteEmail = new javax.swing.JTextField();
        tfAsistenteId = new javax.swing.JTextField();
        tfAsistentePass = new javax.swing.JPasswordField();
        tfAsistenteDni = new javax.swing.JTextField();
        tfAsistenteTelf = new javax.swing.JTextField();
        jPanelAsistenteDeps = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableAsistente = new javax.swing.JTable();
        jBtnCancel = new javax.swing.JButton();
        jBtnSave = new javax.swing.JButton();
        jBtnEditAsi = new javax.swing.JButton();
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
        jScrollPaneAlarm = new javax.swing.JScrollPane();
        jTableAlarmas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelLlamadas = new javax.swing.JPanel();
        jScrollPaneAvis = new javax.swing.JScrollPane();
        jTableAvisos = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelGeo = new javax.swing.JPanel();
        jLabelMapcaption = new javax.swing.JLabel();
        jScrollPaneMaps = new javax.swing.JScrollPane();
        jLabelMaps = new javax.swing.JLabel();
        jButtonCenterMap = new javax.swing.JButton();
        jButtonZoomOut = new javax.swing.JButton();
        jButtonZoomIn = new javax.swing.JButton();
        jScrollPaneCoord = new javax.swing.JScrollPane();
        jTableCoordenadas = new javax.swing.JTable();
        menuBarAsist = new javax.swing.JMenuBar();
        menuAsist = new javax.swing.JMenu();
        itemCerrarSesion = new javax.swing.JMenuItem();
        itemGenerarInfo = new javax.swing.JMenuItem();
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

        jComboBoxDependienteVivienda.setBackground(new java.awt.Color(224, 224, 224));
        jComboBoxDependienteVivienda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxDependienteVivienda.setModel(vivienda);
        jComboBoxDependienteVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Vivienda Actual"));
        jComboBoxDependienteVivienda.setPreferredSize(new java.awt.Dimension(34, 55));

        tfDependienteId.setEditable(false);
        tfDependienteId.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteId.setToolTipText("");
        tfDependienteId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Dependiente"));
        tfDependienteId.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteIdActionPerformed(evt);
            }
        });

        tfDependientePass.setBackground(new java.awt.Color(224, 224, 224));
        tfDependientePass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependientePass.setText("jPasswordField1");
        tfDependientePass.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        tfDependientePass.setPreferredSize(new java.awt.Dimension(150, 55));

        jComboBoxDependienteGenero.setBackground(new java.awt.Color(224, 224, 224));
        jComboBoxDependienteGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxDependienteGenero.setModel(genero);
        jComboBoxDependienteGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Género"));
        jComboBoxDependienteGenero.setPreferredSize(new java.awt.Dimension(150, 55));

        tfDependienteNSS.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteNSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNSS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteNSS.setToolTipText("");
        tfDependienteNSS.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº Seg. Social"));
        tfDependienteNSS.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteNSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteNSSActionPerformed(evt);
            }
        });

        tfDependienteTelf.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteTelf.setToolTipText("");
        tfDependienteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));
        tfDependienteTelf.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteTelfActionPerformed(evt);
            }
        });

        tfDependienteNombre.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteNombre.setToolTipText("");
        tfDependienteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        tfDependienteNombre.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteNombreActionPerformed(evt);
            }
        });

        tfDependienteApe1.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteApe1.setToolTipText("");
        tfDependienteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Apellido"));
        tfDependienteApe1.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteApe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteApe1ActionPerformed(evt);
            }
        });

        tfDependienteApe2.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteApe2.setToolTipText("");
        tfDependienteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Apellido"));
        tfDependienteApe2.setPreferredSize(new java.awt.Dimension(150, 55));
        tfDependienteApe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteApe2ActionPerformed(evt);
            }
        });

        tfDependienteEmail.setBackground(new java.awt.Color(224, 224, 224));
        tfDependienteEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteEmail.setToolTipText("");
        tfDependienteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("email"));
        tfDependienteEmail.setPreferredSize(new java.awt.Dimension(250, 55));
        tfDependienteEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDependienteEmailActionPerformed(evt);
            }
        });

        dateChooserDependienteAlta.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Alta"));
        dateChooserDependienteAlta.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));

        dateChooserDependienteNac.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(187, 187, 187),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserDependienteNac.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Nacimiento"));
    dateChooserDependienteNac.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));

    tfDependienteDNI.setBackground(new java.awt.Color(224, 224, 224));
    tfDependienteDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    tfDependienteDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfDependienteDNI.setToolTipText("");
    tfDependienteDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("D.N.I"));
    tfDependienteDNI.setPreferredSize(new java.awt.Dimension(150, 55));
    tfDependienteDNI.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfDependienteDNIActionPerformed(evt);
        }
    });

    jbtnAddCasa.setBackground(new java.awt.Color(204, 204, 204));
    jbtnAddCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
    jbtnAddCasa.setPreferredSize(new java.awt.Dimension(30, 30));

    javax.swing.GroupLayout jPaneldependienteLayout = new javax.swing.GroupLayout(jPaneldependiente);
    jPaneldependiente.setLayout(jPaneldependienteLayout);
    jPaneldependienteLayout.setHorizontalGroup(
        jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPaneldependienteLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfDependienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDependientePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfDependienteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addComponent(jbtnAddCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addComponent(tfDependienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(tfDependienteApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(tfDependienteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaneldependienteLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(tfDependienteNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfDependienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfDependienteEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
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
                .addComponent(tfDependienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfDependienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPaneldependienteLayout.createSequentialGroup()
                            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldependienteLayout.createSequentialGroup()
                            .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldependienteLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnAddCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))))
    );

    jComboBoxDependienteGenero.getAccessibleContext().setAccessibleName("Genero");

    jPanelProfesionales.setBorder(javax.swing.BorderFactory.createTitledBorder("Centro de salud / Profesionales asociados"));

    jComboBoxMedico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jComboBoxMedico.setModel(medico);
    jComboBoxMedico.setBorder(javax.swing.BorderFactory.createTitledBorder("Médico"));
    jComboBoxMedico.setPreferredSize(new java.awt.Dimension(240, 50));
    jComboBoxMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxMedicoActionPerformed(evt);
        }
    });

    jLabelMedico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor2.png"))); // NOI18N
    jLabelMedico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jLabelMedico.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    jLabelMedico.setMaximumSize(new java.awt.Dimension(0, 0));
    jLabelMedico.setMinimumSize(new java.awt.Dimension(0, 0));
    jLabelMedico.setOpaque(true);
    jLabelMedico.setPreferredSize(new java.awt.Dimension(280, 130));
    jLabelMedico.setRequestFocusEnabled(false);

    jComboBoxCS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jComboBoxCS.setModel(cSalud);
    jComboBoxCS.setBorder(javax.swing.BorderFactory.createTitledBorder("Centro de Salud"));
    jComboBoxCS.setPreferredSize(new java.awt.Dimension(240, 50));

    jLabelCS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/centrosalud.png"))); // NOI18N
    jLabelCS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jLabelCS.setMaximumSize(new java.awt.Dimension(0, 0));
    jLabelCS.setMinimumSize(new java.awt.Dimension(0, 0));
    jLabelCS.setPreferredSize(new java.awt.Dimension(280, 130));
    jLabelCS.setRequestFocusEnabled(false);

    jbtnAddCenSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
    jbtnAddCenSal.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddCenSal.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddCenSalActionPerformed(evt);
        }
    });

    jbtnAddMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
    jbtnAddMedico.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddMedicoActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelProfesionalesLayout = new javax.swing.GroupLayout(jPanelProfesionales);
    jPanelProfesionales.setLayout(jPanelProfesionalesLayout);
    jPanelProfesionalesLayout.setHorizontalGroup(
        jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesionalesLayout.createSequentialGroup()
                    .addComponent(jLabelCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(260, 260, 260))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesionalesLayout.createSequentialGroup()
                    .addComponent(jComboBoxCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnAddMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(264, 264, 264)))
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnAddCenSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelProfesionalesLayout.setVerticalGroup(
        jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBoxCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnAddMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnAddCenSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoBuscar25x25.png"))); // NOI18N
    jButtonSearch.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSearchActionPerformed(evt);
        }
    });

    jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardar25x25.png"))); // NOI18N
    jButtonSave.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSaveActionPerformed(evt);
        }
    });

    jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconoCancelar25x25.png"))); // NOI18N
    jButtonCancel.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCancelActionPerformed(evt);
        }
    });

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

    jbtnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditar25x25.png"))); // NOI18N
    jbtnMod.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnMod.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModActionPerformed(evt);
        }
    });

    jbtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
    jbtnAdd.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddActionPerformed(evt);
        }
    });

    jbtnRemov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove.png"))); // NOI18N
    jbtnRemov.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemov.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelEstadoLayout = new javax.swing.GroupLayout(jPanelEstado);
    jPanelEstado.setLayout(jPanelEstadoLayout);
    jPanelEstadoLayout.setHorizontalGroup(
        jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelEstadoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnRemov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanelEstadoLayout.setVerticalGroup(
        jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelEstadoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneestado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(jPanelEstadoLayout.createSequentialGroup()
                    .addComponent(jbtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, 0))
    );

    jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditar25x25.png"))); // NOI18N
    jbtnEditar.setText("Editar");
    jbtnEditar.setPreferredSize(new java.awt.Dimension(95, 40));
    jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnEditarActionPerformed(evt);
        }
    });

    jbtnAddDepen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
    jbtnAddDepen.setPreferredSize(new java.awt.Dimension(50, 40));
    jbtnAddDepen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddDepenActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
    jPanelPrincipal.setLayout(jPanelPrincipalLayout);
    jPanelPrincipalLayout.setHorizontalGroup(
        jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanelProfesionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34))
                .addComponent(jPaneldependiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(8, 8, 8))
    );
    jPanelPrincipalLayout.setVerticalGroup(
        jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnAddDepen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPaneldependiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelProfesionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jTabbedPaneIzq.addTab("Dependiente (Datos principales)", null, jPanelPrincipal, "");

    jPanelViviendas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos adicionales del dependiente"));

    jScrollPaneViv.setBorder(javax.swing.BorderFactory.createTitledBorder("Viviendas"));

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
    jScrollPaneViv.setViewportView(jTableViviendas);

    jScrollPaneHmed.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial medico"));

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
    jScrollPaneHmed.setViewportView(jTableHistorialMed);

    jScrollPaneHsoc.setBorder(javax.swing.BorderFactory.createTitledBorder("Historial social"));

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
    jScrollPaneHsoc.setViewportView(jTableHistorialSoc);

    jScrollPaneAlleg.setBorder(javax.swing.BorderFactory.createTitledBorder("Allegados"));

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
    jScrollPaneAlleg.setViewportView(jTableAllegados);

    javax.swing.GroupLayout jPanelViviendasLayout = new javax.swing.GroupLayout(jPanelViviendas);
    jPanelViviendas.setLayout(jPanelViviendasLayout);
    jPanelViviendasLayout.setHorizontalGroup(
        jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViviendasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPaneAlleg, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                .addComponent(jScrollPaneViv, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneHmed, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneHsoc, javax.swing.GroupLayout.Alignment.LEADING))
            .addContainerGap())
    );
    jPanelViviendasLayout.setVerticalGroup(
        jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViviendasLayout.createSequentialGroup()
            .addContainerGap(26, Short.MAX_VALUE)
            .addComponent(jScrollPaneViv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneHmed, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneHsoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneAlleg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16))
    );

    jPanelViviendasLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPaneAlleg, jScrollPaneHmed, jScrollPaneHsoc, jScrollPaneViv});

    javax.swing.GroupLayout jPanelHistorialLayout = new javax.swing.GroupLayout(jPanelHistorial);
    jPanelHistorial.setLayout(jPanelHistorialLayout);
    jPanelHistorialLayout.setHorizontalGroup(
        jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelHistorialLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanelViviendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanelHistorialLayout.setVerticalGroup(
        jPanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelHistorialLayout.createSequentialGroup()
            .addGap(52, 52, 52)
            .addComponent(jPanelViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPaneIzq.addTab("Dependiente (Historial, vivienda y allegados)", jPanelHistorial);

    jPanelAsistenteMod.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del asistente"));

    tfAsistenteNombre.setToolTipText("");
    tfAsistenteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
    tfAsistenteNombre.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteNombre.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteNombreActionPerformed(evt);
        }
    });

    tfAsistenteApe1.setToolTipText("");
    tfAsistenteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Apellido"));
    tfAsistenteApe1.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteApe1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteApe1ActionPerformed(evt);
        }
    });

    tfAsistenteApe2.setToolTipText("");
    tfAsistenteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Apellido"));
    tfAsistenteApe2.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteApe2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteApe2ActionPerformed(evt);
        }
    });

    tfAsistenteEmail.setToolTipText("");
    tfAsistenteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("email"));
    tfAsistenteEmail.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteEmail.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteEmailActionPerformed(evt);
        }
    });

    tfAsistenteId.setEditable(false);
    tfAsistenteId.setToolTipText("");
    tfAsistenteId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Dependiente"));
    tfAsistenteId.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteIdActionPerformed(evt);
        }
    });

    tfAsistentePass.setText("jPasswordField1");
    tfAsistentePass.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
    tfAsistentePass.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteDni.setToolTipText("");
    tfAsistenteDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
    tfAsistenteDni.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteDni.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteDniActionPerformed(evt);
        }
    });

    tfAsistenteTelf.setToolTipText("");
    tfAsistenteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));
    tfAsistenteTelf.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteTelf.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tfAsistenteTelfActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelAsistenteModLayout = new javax.swing.GroupLayout(jPanelAsistenteMod);
    jPanelAsistenteMod.setLayout(jPanelAsistenteModLayout);
    jPanelAsistenteModLayout.setHorizontalGroup(
        jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                    .addComponent(tfAsistenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteApe1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tfAsistenteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteApe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(tfAsistenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(tfAsistenteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAsistentePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanelAsistenteModLayout.setVerticalGroup(
        jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteModLayout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfAsistenteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteApe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteApe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(jPanelAsistenteModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tfAsistenteTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistenteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfAsistentePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(19, 19, 19))
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
            .addContainerGap(229, Short.MAX_VALUE))
    );
    jPanelAsistenteDepsLayout.setVerticalGroup(
        jPanelAsistenteDepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteDepsLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jBtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconoCancelar25x25.png"))); // NOI18N
    jBtnCancel.setPreferredSize(new java.awt.Dimension(50, 40));
    jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnCancelActionPerformed(evt);
        }
    });

    jBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardar25x25.png"))); // NOI18N
    jBtnSave.setPreferredSize(new java.awt.Dimension(50, 40));
    jBtnSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnSaveActionPerformed(evt);
        }
    });

    jBtnEditAsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditar25x25.png"))); // NOI18N
    jBtnEditAsi.setText("Editar");
    jBtnEditAsi.setPreferredSize(new java.awt.Dimension(95, 40));
    jBtnEditAsi.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnEditAsiActionPerformed(evt);
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
                    .addComponent(jBtnEditAsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanelAsistenteLayout.setVerticalGroup(
        jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAsistenteLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelAsistenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jBtnEditAsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelAsistenteMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addComponent(jPanelAsistenteDeps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(276, Short.MAX_VALUE))
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
    jScrollPaneAlarm.setViewportView(jTableAlarmas);

    jButton2.setText("Desactivar alarma");

    jButton3.setText("Limpiar alarma desactivadas");

    javax.swing.GroupLayout jPanelAlarmasLayout = new javax.swing.GroupLayout(jPanelAlarmas);
    jPanelAlarmas.setLayout(jPanelAlarmasLayout);
    jPanelAlarmasLayout.setHorizontalGroup(
        jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAlarmasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneAlarm)
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
            .addComponent(jScrollPaneAlarm, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(jButton3))
            .addContainerGap())
    );

    jPanelLlamadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Avisos"));

    jTableAvisos.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPaneAvis.setViewportView(jTableAvisos);

    jButton4.setText("Desactivar alarma");

    jButton5.setText("Limpiar alarma desactivadas");

    javax.swing.GroupLayout jPanelLlamadasLayout = new javax.swing.GroupLayout(jPanelLlamadas);
    jPanelLlamadas.setLayout(jPanelLlamadasLayout);
    jPanelLlamadasLayout.setHorizontalGroup(
        jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelLlamadasLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneAvis)
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
            .addComponent(jScrollPaneAvis, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
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
    jScrollPaneCoord.setViewportView(jTableCoordenadas);

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
                            .addComponent(jScrollPaneCoord)
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
                .addComponent(jScrollPaneCoord, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jTabbedPaneDcha.addTab("Geolocalización", jPanelGeo);

    menuAsist.setText("Inicio");

    itemCerrarSesion.setText("Cerrar Sesion");
    itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            itemCerrarSesionActionPerformed(evt);
        }
    });
    menuAsist.add(itemCerrarSesion);

    itemGenerarInfo.setText("Generar Informe");
    itemGenerarInfo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            itemGenerarInfoActionPerformed(evt);
        }
    });
    menuAsist.add(itemGenerarInfo);

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

    private void tfAsistenteApe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteApe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteApe2ActionPerformed

    private void tfAsistenteEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteEmailActionPerformed

    private void tfAsistenteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteIdActionPerformed

    private void tfAsistenteDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteDniActionPerformed

    private void tfAsistenteTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsistenteTelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsistenteTelfActionPerformed

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

    private void itemGenerarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGenerarInfoActionPerformed
        try {
            new JasperClient();
            new PdfFromXmlFile("InformeMedicamentoList");
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemGenerarInfoActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        guardardependiente();
        listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
        cargadependiente(dep);
        lockEnabled(false);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRemovActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        Search search = new Search(null, true, listaDependientes);
        if (search.getDependiente() != null) {
            dep = search.getDependiente();
            lockEnabled(true);
            cargadependiente(dep);
            lockEnabled(false);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cargadependiente(dep);
        lockEnabled(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        lockEnabled(true);
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void tfDependienteDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDependienteDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDependienteDNIActionPerformed

    private void jbtnAddDepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddDepenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddDepenActionPerformed

    private void jbtnAddCenSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddCenSalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddCenSalActionPerformed

    private void jbtnAddMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddMedicoActionPerformed

    private void jBtnEditAsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditAsiActionPerformed
        lockEnabledAsist(true);
    }//GEN-LAST:event_jBtnEditAsiActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        cargarAsistente();
        lockEnabledAsist(false);
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        guardarAsistente();
        cargarAsistente();
        lockEnabledAsist(false);
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, "¿Desea cambiar de usuario?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            this.setVisible(false);
            AccessAsist access = null;
            try {
                access = new AccessAsist(null, true, controller);
            } catch (SQLException ex) {
                System.err.println("PROBLEMAS ACCEDIENDO A LA BD");
            }
            asistente=access.getAsistente();
            this.setVisible(true);
        }
    }//GEN-LAST:event_itemCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserDependienteAlta;
    private datechooser.beans.DateChooserCombo dateChooserDependienteNac;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemGenerarInfo;
    private javax.swing.JMenuItem itemInfo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnEditAsi;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCenterMap;
    private javax.swing.JButton jButtonLlamadaBomberos;
    private javax.swing.JButton jButtonLlamadaEmergencias;
    private javax.swing.JButton jButtonLlamadaPolicia;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneAlarm;
    private javax.swing.JScrollPane jScrollPaneAlleg;
    private javax.swing.JScrollPane jScrollPaneAvis;
    private javax.swing.JScrollPane jScrollPaneCoord;
    private javax.swing.JScrollPane jScrollPaneHmed;
    private javax.swing.JScrollPane jScrollPaneHsoc;
    private javax.swing.JScrollPane jScrollPaneMaps;
    private javax.swing.JScrollPane jScrollPaneViv;
    private javax.swing.JScrollPane jScrollPaneestado;
    private javax.swing.JTabbedPane jTabbedPaneDcha;
    private javax.swing.JTabbedPane jTabbedPaneIzq;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAlarmas;
    private javax.swing.JTable jTableAllegados;
    private javax.swing.JTable jTableAsistente;
    private javax.swing.JTable jTableAvisos;
    private javax.swing.JTable jTableCoordenadas;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTable jTableHistorialMed;
    private javax.swing.JTable jTableHistorialSoc;
    private javax.swing.JTable jTableViviendas;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnAddCasa;
    private javax.swing.JButton jbtnAddCenSal;
    private javax.swing.JButton jbtnAddDepen;
    private javax.swing.JButton jbtnAddMedico;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnRemov;
    private javax.swing.JMenu menuAsist;
    private javax.swing.JMenuBar menuBarAsist;
    private javax.swing.JTextField tfAsistenteApe1;
    private javax.swing.JTextField tfAsistenteApe2;
    private javax.swing.JTextField tfAsistenteDni;
    private javax.swing.JTextField tfAsistenteEmail;
    private javax.swing.JTextField tfAsistenteId;
    private javax.swing.JTextField tfAsistenteNombre;
    private javax.swing.JPasswordField tfAsistentePass;
    private javax.swing.JTextField tfAsistenteTelf;
    private javax.swing.JTextField tfDependienteApe1;
    private javax.swing.JTextField tfDependienteApe2;
    private javax.swing.JTextField tfDependienteDNI;
    private javax.swing.JTextField tfDependienteEmail;
    private javax.swing.JTextField tfDependienteId;
    private javax.swing.JTextField tfDependienteNSS;
    private javax.swing.JTextField tfDependienteNombre;
    private javax.swing.JPasswordField tfDependientePass;
    private javax.swing.JTextField tfDependienteTelf;
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
        listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
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
        dep = (XDependienteModel) dependiente;
        this.tfDependienteNombre.setText(dep.getXPersonaModel().getName());
        this.tfDependienteApe1.setText(dep.getXPersonaModel().getApellido1());
        this.tfDependienteApe2.setText(dep.getXPersonaModel().getApellido2());
        this.tfDependienteEmail.setText(dep.getXPersonaModel().getEmail());
        this.tfDependienteId.setText(String.valueOf(dep.getId()));
        this.tfDependientePass.setText(dep.getPassword());
        this.tfDependienteTelf.setText(dep.getXPersonaModel().getTelefono());
        this.tfDependienteNSS.setText(dep.getNss());
        this.tfDependienteDNI.setText(dep.getXPersonaModel().getDni());

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
        vivienda.setSelectedItem(vivienda.getElementAt(0));
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
        this.jTableAvisos.setModel(controller.cargarResultSet(SentenciasSQL.avisosTM, dep));
        Utils.resizeColumnWidth(this.jTableAvisos);
        this.jTableEstado.setModel(controller.cargarResultSet(SentenciasSQL.estadoTM, dep));
        Utils.resizeColumnWidth(this.jTableEstado);
    }

    private void lockEnabled(boolean enabled) {
        //Panel dependiente
        this.tfDependienteNombre.setEditable(enabled);
        this.tfDependienteApe1.setEditable(enabled);
        this.tfDependienteApe2.setEditable(enabled);
        this.tfDependienteEmail.setEditable(enabled);
        this.tfDependientePass.setEditable(enabled);
        this.tfDependienteTelf.setEditable(enabled);
        this.tfDependienteNSS.setEditable(enabled);
        this.tfDependienteDNI.setEnabled(enabled);
        this.dateChooserDependienteAlta.setLocked(!enabled);
        this.dateChooserDependienteNac.setLocked(!enabled);
        this.jComboBoxDependienteVivienda.setEnabled(enabled);
        this.jComboBoxDependienteGenero.setEnabled(enabled);
        this.jComboBoxMedico.setEnabled(enabled);
        this.jComboBoxCS.setEnabled(enabled);
        this.jButtonSave.setVisible(enabled);
        this.jButtonCancel.setVisible(enabled);
        this.jbtnEditar.setVisible(!enabled);
        this.jButtonSearch.setVisible(!enabled);
        this.jbtnAddCasa.setVisible(enabled);
        this.jbtnAddCenSal.setVisible(enabled);
        this.jbtnAddMedico.setVisible(enabled);
        this.jbtnAddDepen.setVisible(!enabled);
        this.jbtnAdd.setVisible(!enabled);
        this.jbtnMod.setVisible(!enabled);
        this.jbtnRemov.setVisible(!enabled);
    }

    private void cargarAsistente() {
        this.tfAsistenteNombre.setText(asistente.getXPersonaModel().getName());
        this.tfAsistenteApe1.setText(asistente.getXPersonaModel().getApellido1());
        this.tfAsistenteApe2.setText(asistente.getXPersonaModel().getApellido2());
        this.tfAsistenteEmail.setText(asistente.getXPersonaModel().getEmail());
        this.tfAsistenteId.setText(String.valueOf(asistente.getId()));
        this.tfAsistentePass.setText(asistente.getPassword());
        this.tfAsistenteDni.setText(asistente.getXPersonaModel().getDni());
        this.tfAsistenteTelf.setText(asistente.getXPersonaModel().getTelefono());
    }

    private void guardardependiente() {
        dep.setFecAlta(this.dateChooserDependienteAlta.getCurrent().getTime());
        dep.setFecNacim(this.dateChooserDependienteNac.getCurrent().getTime());
        dep.setGenero(this.jComboBoxDependienteGenero.getSelectedItem().toString());
        dep.setNss(this.tfDependienteNSS.getText());
        dep.setPassword(String.valueOf(this.tfDependientePass.getPassword()));
        dep.setXCsModel((XCsModel) this.jComboBoxCS.getSelectedItem());
        dep.setXMedicoModel((XMedicoModel) this.jComboBoxMedico.getSelectedItem());
        dep.getXPersonaModel().setName(this.tfDependienteNombre.getText());
        dep.getXPersonaModel().setApellido1(this.tfDependienteApe1.getText());
        dep.getXPersonaModel().setApellido2(this.tfDependienteApe2.getText());
        dep.getXPersonaModel().setEmail(this.tfDependienteEmail.getText());
        dep.getXPersonaModel().setTelefono(this.tfDependienteTelf.getText());
        dep.getXPersonaModel().setDni(this.tfDependienteDNI.getText());
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            if (next.getId() == ((XViviendaModel) this.jComboBoxDependienteVivienda.getSelectedItem()).getId()) {
                next.setHabitual(true);
            } else {
                next.setHabitual(false);
            }
        }
        controller.getHibernate().update(dep);
    }

    private void lockEnabledAsist(boolean enable) {
        this.tfAsistenteApe1.setEditable(enable);
        this.tfAsistenteApe2.setEditable(enable);
        this.tfAsistenteEmail.setEditable(enable);
        this.tfAsistenteNombre.setEditable(enable);
        this.tfAsistentePass.setEditable(enable);
        this.tfAsistenteDni.setEditable(enable);
        this.tfAsistenteTelf.setEditable(enable);
        this.jBtnCancel.setVisible(enable);
        this.jBtnSave.setVisible(enable);
        this.jBtnEditAsi.setVisible(!enable);
    }

    private void guardarAsistente() {
        asistente.setPassword(String.valueOf(this.tfAsistentePass.getPassword()));
        asistente.getXPersonaModel().setName(this.tfAsistenteNombre.getText());
        asistente.getXPersonaModel().setApellido1(this.tfAsistenteApe1.getText());
        asistente.getXPersonaModel().setApellido2(this.tfAsistenteApe2.getText());
        asistente.getXPersonaModel().setDni(this.tfAsistenteDni.getText());
        asistente.getXPersonaModel().setEmail(this.tfAsistenteEmail.getText());
        asistente.getXPersonaModel().setTelefono(this.tfAsistenteTelf.getText());
        controller.getHibernate().update(asistente);
    }

}
