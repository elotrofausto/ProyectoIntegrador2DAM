/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.BLogic;
import Models.XAsistenteModel;
import Models.XCiudadModel;
import Models.XCsModel;
import Models.XDependienteModel;
import Models.XEstadoModel;
import Models.XFamiliarModel;
import Models.XHistmedicoModel;
import Models.XMedicoModel;
import Models.XViviendaModel;
import Utils.JasperClient;
import Utils.SentenciasSQL;
import Utils.Utils;
import java.awt.BorderLayout;
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
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author vesprada
 */
public class MainView extends javax.swing.JFrame {

    private final static String MAPS_KEY = "%20AIzaSyBXkyYwknSg-vZ446hxBHmVEMshcbujIyo";
    private final String HEALTH = "CENTRO MEDICO", HOME = "VIVIENDA", DEPENDENT = "DEPENDIENTES", SOC = "social", MED = "medico";
    private final static int MAX_MAPS_ZOOM = 21;
    private final static int MIN_MAPS_ZOOM = 5;
    private double currentLat;
    private double currentLng;
    private int currentZoom;
    private BLogic controller;
    private XAsistenteModel asistente;
    private XDependienteModel dep;
    private List<Object> listaDependientes;
    private List<Object> listaCiudades;

    private DefaultComboBoxModel medico;
    private DefaultComboBoxModel cSalud;
    private DefaultComboBoxModel vivienda;
    private DefaultComboBoxModel genero;
    private JasperClient jClient;

    public MainView(BLogic controller, XAsistenteModel asistente) {
        this.controller = controller;
        this.asistente = asistente;

        initCombos();
        initComponents();
        initTabs();
        initData();
        initMaps();
        initJasper();
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
        jbtnModViv = new javax.swing.JButton();
        jPanelProfesionales = new javax.swing.JPanel();
        jComboBoxMedico = new javax.swing.JComboBox<>();
        jLabelMedico = new javax.swing.JLabel();
        jComboBoxCS = new javax.swing.JComboBox<>();
        jLabelCS = new javax.swing.JLabel();
        jbtnAddCenSal = new javax.swing.JButton();
        jbtnAddMedico = new javax.swing.JButton();
        jbtnModMed = new javax.swing.JButton();
        jbtnModCen = new javax.swing.JButton();
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
        jbtnAddVivienda = new javax.swing.JButton();
        jbtnModVivienda = new javax.swing.JButton();
        jbtnRemovVivienda = new javax.swing.JButton();
        jbtnAddHisMed = new javax.swing.JButton();
        jbtnModHisMed = new javax.swing.JButton();
        jbtnRemovHisMed = new javax.swing.JButton();
        jbtnAddHisSoc = new javax.swing.JButton();
        jbtnModHisSoc = new javax.swing.JButton();
        jbtnRemovHisSoc = new javax.swing.JButton();
        jbtnAddAlle = new javax.swing.JButton();
        jbtnModAlle = new javax.swing.JButton();
        jbtnRemovAlle = new javax.swing.JButton();
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
        jPanelAnalisis = new javax.swing.JPanel();
        jBtnCancel = new javax.swing.JButton();
        jBtnSave = new javax.swing.JButton();
        jBtnEditAsi = new javax.swing.JButton();
        jTabbedPaneDcha = new javax.swing.JTabbedPane();
        jPanelAlertas = new javax.swing.JPanel();
        jPanelRecursos = new javax.swing.JPanel();
        jScrollPaneRecursos = new javax.swing.JScrollPane();
        jTableRecursos = new javax.swing.JTable();
        jbtnAddRecurso = new javax.swing.JButton();
        jbtnModRecurso = new javax.swing.JButton();
        jbtnRemovRecurso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelAlarmas = new javax.swing.JPanel();
        jScrollPaneAlarm = new javax.swing.JScrollPane();
        jTableAlarmas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPaneAlarm1 = new javax.swing.JScrollPane();
        jTableAlarmas1 = new javax.swing.JTable();
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
        jLabelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/title background.png"))); // NOI18N

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

        jPaneldependiente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PRINCIPALES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

        jComboBoxDependienteVivienda.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxDependienteVivienda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxDependienteVivienda.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDependienteVivienda.setModel(vivienda);
        jComboBoxDependienteVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VIVIENDA ACTUAL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboBoxDependienteVivienda.setPreferredSize(new java.awt.Dimension(270, 55));

        tfDependienteId.setEditable(false);
        tfDependienteId.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteId.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteId.setToolTipText("");
        tfDependienteId.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ID DEPENDIENTE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteId.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependientePass.setBackground(new java.awt.Color(255, 255, 255));
        tfDependientePass.setForeground(new java.awt.Color(0, 0, 0));
        tfDependientePass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependientePass.setText("jPasswordField1");
        tfDependientePass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "PASSWORD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependientePass.setPreferredSize(new java.awt.Dimension(150, 50));

        jComboBoxDependienteGenero.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxDependienteGenero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBoxDependienteGenero.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDependienteGenero.setModel(genero);
        jComboBoxDependienteGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GÉNERO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        jComboBoxDependienteGenero.setPreferredSize(new java.awt.Dimension(150, 55));

        tfDependienteNSS.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteNSS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNSS.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteNSS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteNSS.setToolTipText("");
        tfDependienteNSS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nº SEGURIDAD SOCIAL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteNSS.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteTelf.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteTelf.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteTelf.setToolTipText("");
        tfDependienteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TELÉFONO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteTelf.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteNombre.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteNombre.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteNombre.setToolTipText("");
        tfDependienteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "NOMBRE", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteNombre.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteApe1.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteApe1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe1.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteApe1.setToolTipText("");
        tfDependienteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "PRIMER APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteApe1.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteApe2.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteApe2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteApe2.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteApe2.setToolTipText("");
        tfDependienteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "SEGUNDO APELLIDO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteApe2.setPreferredSize(new java.awt.Dimension(150, 50));

        tfDependienteEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfDependienteEmail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfDependienteEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfDependienteEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDependienteEmail.setToolTipText("");
        tfDependienteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "EMAIL", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        tfDependienteEmail.setPreferredSize(new java.awt.Dimension(250, 50));

        dateChooserDependienteAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA ALTA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
        dateChooserDependienteAlta.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
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
    dateChooserDependienteNac.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA NACIMIENTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    dateChooserDependienteNac.setCalendarPreferredSize(new java.awt.Dimension(350, 250));
    dateChooserDependienteNac.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 14));

    tfDependienteDNI.setBackground(new java.awt.Color(255, 255, 255));
    tfDependienteDNI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    tfDependienteDNI.setForeground(new java.awt.Color(0, 0, 0));
    tfDependienteDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfDependienteDNI.setToolTipText("");
    tfDependienteDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "D.N.I", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    tfDependienteDNI.setPreferredSize(new java.awt.Dimension(150, 50));
    tfDependienteDNI.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            tfDependienteDNIFocusGained(evt);
        }
    });
    tfDependienteDNI.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            tfDependienteDNIKeyTyped(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tfDependienteDNIKeyReleased(evt);
        }
    });

    jbtnAddCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddCasa.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddCasa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddCasaActionPerformed(evt);
        }
    });

    jbtnModViv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModViv.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModViv.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModVivActionPerformed(evt);
        }
    });

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
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbtnAddCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnModViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(16, 16, 16)
            .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPaneldependienteLayout.createSequentialGroup()
                    .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPaneldependienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateChooserDependienteNac, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserDependienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBoxDependienteVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPaneldependienteLayout.createSequentialGroup()
                            .addComponent(jbtnAddCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jbtnModViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(8, 8, 8))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldependienteLayout.createSequentialGroup()
                    .addComponent(jComboBoxDependienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())))
    );

    jComboBoxDependienteGenero.getAccessibleContext().setAccessibleName("Genero");

    jPanelProfesionales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CENTRO SALUD  /  PROFESIONALES ASOCIADOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

    jComboBoxMedico.setBackground(new java.awt.Color(255, 255, 255));
    jComboBoxMedico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jComboBoxMedico.setForeground(new java.awt.Color(0, 0, 0));
    jComboBoxMedico.setModel(medico);
    jComboBoxMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MÉDICO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    jComboBoxMedico.setPreferredSize(new java.awt.Dimension(240, 60));
    jComboBoxMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxMedicoActionPerformed(evt);
        }
    });

    jLabelMedico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/doctor.png"))); // NOI18N
    jLabelMedico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jLabelMedico.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    jLabelMedico.setMaximumSize(new java.awt.Dimension(0, 0));
    jLabelMedico.setMinimumSize(new java.awt.Dimension(0, 0));
    jLabelMedico.setOpaque(true);
    jLabelMedico.setPreferredSize(new java.awt.Dimension(280, 110));
    jLabelMedico.setRequestFocusEnabled(false);

    jComboBoxCS.setBackground(new java.awt.Color(255, 255, 255));
    jComboBoxCS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    jComboBoxCS.setForeground(new java.awt.Color(0, 0, 0));
    jComboBoxCS.setModel(cSalud);
    jComboBoxCS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CENTRO SALUD", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10), new java.awt.Color(0, 102, 102))); // NOI18N
    jComboBoxCS.setPreferredSize(new java.awt.Dimension(240, 60));

    jLabelCS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabelCS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/centrosalud.png"))); // NOI18N
    jLabelCS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jLabelCS.setMaximumSize(new java.awt.Dimension(0, 0));
    jLabelCS.setMinimumSize(new java.awt.Dimension(0, 0));
    jLabelCS.setPreferredSize(new java.awt.Dimension(280, 110));
    jLabelCS.setRequestFocusEnabled(false);

    jbtnAddCenSal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddCenSal.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddCenSal.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddCenSalActionPerformed(evt);
        }
    });

    jbtnAddMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddMedico.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddMedicoActionPerformed(evt);
        }
    });

    jbtnModMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModMedActionPerformed(evt);
        }
    });

    jbtnModCen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModCen.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModCen.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModCenActionPerformed(evt);
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
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnAddCenSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnModCen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(264, 264, 264)))
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnAddMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnModMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelProfesionalesLayout.setVerticalGroup(
        jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                            .addComponent(jbtnAddCenSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jbtnModCen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                    .addGroup(jPanelProfesionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBoxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelProfesionalesLayout.createSequentialGroup()
                            .addComponent(jbtnAddMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jbtnModMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(6, 6, 6)
                    .addComponent(jLabelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoBuscar25x25.png"))); // NOI18N
    jButtonSearch.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSearchActionPerformed(evt);
        }
    });

    jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoGuardar25x25.png"))); // NOI18N
    jButtonSave.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonSaveActionPerformed(evt);
        }
    });

    jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IconoCancelar25x25.png"))); // NOI18N
    jButtonCancel.setPreferredSize(new java.awt.Dimension(50, 40));
    jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCancelActionPerformed(evt);
        }
    });

    jPanelEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTADO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
    jPanelEstado.setPreferredSize(new java.awt.Dimension(658, 120));

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

    jbtnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnMod.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnMod.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModActionPerformed(evt);
        }
    });

    jbtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAdd.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddActionPerformed(evt);
        }
    });

    jbtnRemov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
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

    jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnEditar.setText("Editar");
    jbtnEditar.setPreferredSize(new java.awt.Dimension(95, 40));
    jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnEditarActionPerformed(evt);
        }
    });

    jbtnAddDepen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
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
                .addComponent(jPanelEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
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
            .addComponent(jPanelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
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

    jbtnAddVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddVivienda.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddVivienda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddViviendaActionPerformed(evt);
        }
    });

    jbtnModVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModVivienda.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModVivienda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModViviendaActionPerformed(evt);
        }
    });

    jbtnRemovVivienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovVivienda.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovVivienda.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovViviendaActionPerformed(evt);
        }
    });

    jbtnAddHisMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddHisMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddHisMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddHisMedActionPerformed(evt);
        }
    });

    jbtnModHisMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModHisMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModHisMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModHisMedActionPerformed(evt);
        }
    });

    jbtnRemovHisMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovHisMed.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovHisMed.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovHisMedActionPerformed(evt);
        }
    });

    jbtnAddHisSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddHisSoc.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddHisSoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddHisSocActionPerformed(evt);
        }
    });

    jbtnModHisSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModHisSoc.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModHisSoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModHisSocActionPerformed(evt);
        }
    });

    jbtnRemovHisSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovHisSoc.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovHisSoc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovHisSocActionPerformed(evt);
        }
    });

    jbtnAddAlle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddAlle.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddAlle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddAlleActionPerformed(evt);
        }
    });

    jbtnModAlle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModAlle.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModAlle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModAlleActionPerformed(evt);
        }
    });

    jbtnRemovAlle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovAlle.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovAlle.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovAlleActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelViviendasLayout = new javax.swing.GroupLayout(jPanelViviendas);
    jPanelViviendas.setLayout(jPanelViviendasLayout);
    jPanelViviendasLayout.setHorizontalGroup(
        jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelViviendasLayout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnModAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRemovAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(6, 6, 6)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPaneAlleg, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addComponent(jScrollPaneHsoc, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPaneViv)
                .addComponent(jScrollPaneHmed))
            .addGap(0, 0, 0))
    );
    jPanelViviendasLayout.setVerticalGroup(
        jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViviendasLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                    .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelViviendasLayout.createSequentialGroup()
                            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPaneViv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                                    .addComponent(jbtnAddVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnModVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtnRemovVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPaneHmed, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelViviendasLayout.createSequentialGroup()
                            .addComponent(jbtnAddHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnModHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnRemovHisMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPaneHsoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                    .addComponent(jbtnAddHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnModHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemovHisSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(20, 20, 20)
            .addGroup(jPanelViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPaneAlleg, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelViviendasLayout.createSequentialGroup()
                    .addComponent(jbtnAddAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnModAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemovAlle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, 0))
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

    tfAsistenteNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteNombre.setToolTipText("");
    tfAsistenteNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
    tfAsistenteNombre.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteApe1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteApe1.setToolTipText("");
    tfAsistenteApe1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer Apellido"));
    tfAsistenteApe1.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteApe2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteApe2.setToolTipText("");
    tfAsistenteApe2.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Apellido"));
    tfAsistenteApe2.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteEmail.setToolTipText("");
    tfAsistenteEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("email"));
    tfAsistenteEmail.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteId.setEditable(false);
    tfAsistenteId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteId.setToolTipText("");
    tfAsistenteId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Dependiente"));
    tfAsistenteId.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistentePass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistentePass.setText("jPasswordField1");
    tfAsistentePass.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
    tfAsistentePass.setPreferredSize(new java.awt.Dimension(150, 50));

    tfAsistenteDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteDni.setToolTipText("");
    tfAsistenteDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
    tfAsistenteDni.setPreferredSize(new java.awt.Dimension(150, 50));
    tfAsistenteDni.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            tfAsistenteDniFocusGained(evt);
        }
    });
    tfAsistenteDni.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tfAsistenteDniKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            tfAsistenteDniKeyTyped(evt);
        }
    });

    tfAsistenteTelf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    tfAsistenteTelf.setToolTipText("");
    tfAsistenteTelf.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono"));
    tfAsistenteTelf.setPreferredSize(new java.awt.Dimension(150, 50));

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

    jPanelAnalisis.setBorder(javax.swing.BorderFactory.createTitledBorder("ANALISIS"));
    jPanelAnalisis.setPreferredSize(new java.awt.Dimension(840, 440));

    javax.swing.GroupLayout jPanelAnalisisLayout = new javax.swing.GroupLayout(jPanelAnalisis);
    jPanelAnalisis.setLayout(jPanelAnalisisLayout);
    jPanelAnalisisLayout.setHorizontalGroup(
        jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 830, Short.MAX_VALUE)
    );
    jPanelAnalisisLayout.setVerticalGroup(
        jPanelAnalisisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 380, Short.MAX_VALUE)
    );

    jBtnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/IconoCancelar25x25.png"))); // NOI18N
    jBtnCancel.setPreferredSize(new java.awt.Dimension(50, 40));
    jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnCancelActionPerformed(evt);
        }
    });

    jBtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoGuardar25x25.png"))); // NOI18N
    jBtnSave.setPreferredSize(new java.awt.Dimension(50, 40));
    jBtnSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBtnSaveActionPerformed(evt);
        }
    });

    jBtnEditAsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
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
                .addComponent(jPanelAnalisis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelAnalisis, 402, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jTabbedPaneIzq.addTab("Asistente", null, jPanelAsistente, "");

    jPanelAlertas.setBackground(new java.awt.Color(204, 204, 204));

    jPanelRecursos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMERGENCIA Y OTROS RECURSOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
    jPanelRecursos.setPreferredSize(new java.awt.Dimension(655, 140));

    jScrollPaneRecursos.setPreferredSize(new java.awt.Dimension(540, 100));

    jTableRecursos.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPaneRecursos.setViewportView(jTableRecursos);

    jbtnAddRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
    jbtnAddRecurso.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnAddRecurso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnAddRecursoActionPerformed(evt);
        }
    });

    jbtnModRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoEditar25x25.png"))); // NOI18N
    jbtnModRecurso.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnModRecurso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnModRecursoActionPerformed(evt);
        }
    });

    jbtnRemovRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/remove.png"))); // NOI18N
    jbtnRemovRecurso.setPreferredSize(new java.awt.Dimension(30, 30));
    jbtnRemovRecurso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnRemovRecursoActionPerformed(evt);
        }
    });

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/call.png"))); // NOI18N
    jButton1.setPreferredSize(new java.awt.Dimension(50, 100));

    javax.swing.GroupLayout jPanelRecursosLayout = new javax.swing.GroupLayout(jPanelRecursos);
    jPanelRecursos.setLayout(jPanelRecursosLayout);
    jPanelRecursosLayout.setHorizontalGroup(
        jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelRecursosLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jbtnAddRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnRemovRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnModRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPaneRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanelRecursosLayout.setVerticalGroup(
        jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecursosLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPaneRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelRecursosLayout.createSequentialGroup()
                    .addComponent(jbtnAddRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jbtnModRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jbtnRemovRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    jPanelAlarmas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALARMAS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N

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

    jTableAlarmas1.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPaneAlarm1.setViewportView(jTableAlarmas1);

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
        .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlarmasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneAlarm1)
                .addContainerGap()))
    );
    jPanelAlarmasLayout.setVerticalGroup(
        jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelAlarmasLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPaneAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
            .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(jButton3))
            .addContainerGap())
        .addGroup(jPanelAlarmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlarmasLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jScrollPaneAlarm1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)))
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

    jButton4.setText("CREAR AVISO");

    jButton5.setText("REFRESCO");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

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
            .addComponent(jScrollPaneAvis, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanelRecursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    jButtonCenterMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/center.png"))); // NOI18N
    jButtonCenterMap.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonCenterMapActionPerformed(evt);
        }
    });

    jButtonZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/zoomout.png"))); // NOI18N
    jButtonZoomOut.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonZoomOutActionPerformed(evt);
        }
    });

    jButtonZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/zoomin.png"))); // NOI18N
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

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        guardardependiente();
        controller.actualizarObjeto(dep);
        listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
        cargadependiente(dep);
        lockEnabled(false);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jbtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModActionPerformed
        if (this.jTableEstado.getSelectedRow() >= 0) {
            DepenStat estado = new DepenStat(this, true, controller, this.jTableEstado.getModel().getValueAt(this.jTableEstado.getSelectedRow(), 0));
            if (estado.getEstado() != null) {
                controller.actualizarObjeto(estado.getEstado());
                manipulateEstadoTable(dep, 0);
            }
        }
    }//GEN-LAST:event_jbtnModActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        DepenStat estado = new DepenStat(this, true, controller);
        if (estado.getEstado() != null) {
            estado.getEstado().setXDependienteModel(dep);
            controller.guardarObjeto(estado.getEstado());
            manipulateEstadoTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovActionPerformed
        if (this.jTableEstado.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XEstadoModel.class, SentenciasSQL.objectDatosId, this.jTableEstado.getModel().getValueAt(this.jTableEstado.getSelectedRow(), 0)));
            manipulateEstadoTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnRemovActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        Search search = new Search(null, true, listaDependientes, DEPENDENT);
        if (search.getObject() != null) {
            dep = (XDependienteModel) search.getObject();
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

    private void jbtnAddDepenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddDepenActionPerformed
        lockEnabled(true);
    }//GEN-LAST:event_jbtnAddDepenActionPerformed

    private void jbtnAddCenSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddCenSalActionPerformed
        DirectionMan center = new DirectionMan(this, true, controller, HEALTH, listaCiudades);
        if (center.getObject() != null) {
            controller.guardarObjeto(center.getObject());
            manipulateCS(null, 0);
        }

    }//GEN-LAST:event_jbtnAddCenSalActionPerformed

    private void jbtnAddMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddMedicoActionPerformed
        DoctorMan doctorMan = new DoctorMan(this, true);
        if (doctorMan.getMedico() != null) {
            controller.guardarObjeto(doctorMan.getMedico());
            manipulateMed(null, 0);
        }
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
            asistente = access.getAsistente();
            this.setVisible(true);
        }
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void jbtnAddCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddCasaActionPerformed
        DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades);
        if (center.getObject() != null) {
            if (((XViviendaModel) center.getObject()).getHabitual()) {
                controller.reasignarHabitual(dep);
            }
            ((XViviendaModel) center.getObject()).setXDependienteModel(dep);
            controller.guardarObjeto(center.getObject());
            manipulateViviTable(dep, 0);
            manipulateHome(null, 0);
        }
    }//GEN-LAST:event_jbtnAddCasaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbtnModMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModMedActionPerformed
        if (this.jComboBoxMedico.getModel().getSelectedItem() != null) {
            DoctorMan doctorMan = new DoctorMan(this, true, (XMedicoModel) this.jComboBoxMedico.getModel().getSelectedItem());
            if (doctorMan.getMedico() != null) {
                controller.guardarObjeto(doctorMan.getMedico());
                manipulateMed(null, 0);
            }
        }
    }//GEN-LAST:event_jbtnModMedActionPerformed

    private void jbtnModCenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModCenActionPerformed
        if (this.jComboBoxCS.getModel().getSelectedItem() != null) {
            DirectionMan center = new DirectionMan(this, true, controller, HEALTH, listaCiudades, (XCsModel) this.jComboBoxCS.getModel().getSelectedItem());
            if (center.getObject() != null) {
                controller.actualizarObjeto(center.getObject());
                manipulateCS(null, 0);
            }
        }
    }//GEN-LAST:event_jbtnModCenActionPerformed

    private void jbtnModVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModVivActionPerformed
        if (this.jComboBoxDependienteVivienda.getModel().getSelectedItem() != null) {
            DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades, (XViviendaModel) this.jComboBoxDependienteVivienda.getModel().getSelectedItem());
            if (center.getObject() != null) {
                if (((XViviendaModel) center.getObject()).getHabitual()) {
                    controller.reasignarHabitual(dep);
                }
                controller.actualizarObjeto(center.getObject());
                manipulateViviTable(dep, 0);
                manipulateHome(null, 0);
            }
        }
    }//GEN-LAST:event_jbtnModVivActionPerformed

    private void tfDependienteDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDependienteDNIKeyReleased
        if (this.tfDependienteDNI.getText().length() == 8) {
            this.tfDependienteDNI.setText(Utils.laLetra(this.tfDependienteDNI.getText()));
            this.tfDependienteDNI.selectAll();
        }
    }//GEN-LAST:event_tfDependienteDNIKeyReleased

    private void tfDependienteDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDependienteDNIKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tfDependienteDNI.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfDependienteDNIKeyTyped

    private void tfDependienteDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDependienteDNIFocusGained
        this.tfDependienteDNI.selectAll();
    }//GEN-LAST:event_tfDependienteDNIFocusGained

    private void jbtnAddViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddViviendaActionPerformed
        DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades);
        if (center.getObject() != null) {
            if (((XViviendaModel) center.getObject()).getHabitual()) {
                controller.reasignarHabitual(dep);
            }
            ((XViviendaModel) center.getObject()).setXDependienteModel(dep);
            controller.guardarObjeto(center.getObject());
            manipulateViviTable(dep, 0);
            manipulateHome(null, 0);
        }
    }//GEN-LAST:event_jbtnAddViviendaActionPerformed

    private void jbtnModViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModViviendaActionPerformed
        if (this.jTableViviendas.getSelectedRow() >= 0) {
            DirectionMan center = new DirectionMan(this, true, controller, HOME, listaCiudades,
                    controller.cargarDatos(XViviendaModel.class, SentenciasSQL.objectDatosId,
                            this.jTableViviendas.getModel().getValueAt(this.jTableViviendas.getSelectedRow(), 0)));
            if (center.getObject() != null) {
                if (((XViviendaModel) center.getObject()).getHabitual()) {
                    controller.reasignarHabitual(dep);
                }
                controller.actualizarObjeto(center.getObject());
                manipulateViviTable(dep, 0);
                manipulateHome(null, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModViviendaActionPerformed

    private void jbtnRemovViviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovViviendaActionPerformed
        if (this.jTableViviendas.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XViviendaModel.class, SentenciasSQL.objectDatosId, this.jTableViviendas.getModel().getValueAt(this.jTableViviendas.getSelectedRow(), 0)));
            manipulateViviTable(dep, 0);
            manipulateHome(null, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovViviendaActionPerformed

    private void jbtnAddHisMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddHisMedActionPerformed
        HistoricalMan his = new HistoricalMan(this, true, MED);
        if (his.getHistory() != null) {
            his.getHistory().setXDependienteModel(dep);
            controller.guardarObjeto(his.getHistory());
            manipulateHisMedTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddHisMedActionPerformed

    private void jbtnModHisMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModHisMedActionPerformed
        if (this.jTableHistorialMed.getSelectedRow() >= 0) {
            HistoricalMan his = new HistoricalMan(this, true, MED,
                    controller.cargarDatos(XHistmedicoModel.class, SentenciasSQL.objectDatosId,
                            this.jTableHistorialMed.getModel().getValueAt(this.jTableHistorialMed.getSelectedRow(), 0)));
            if (his.getHistory() != null) {
                controller.actualizarObjeto(his.getHistory());
                manipulateHisMedTable(dep, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModHisMedActionPerformed

    private void jbtnRemovHisMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovHisMedActionPerformed
        if (this.jTableHistorialMed.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XHistmedicoModel.class,
                    SentenciasSQL.objectDatosId, this.jTableHistorialMed.getModel().getValueAt(this.jTableHistorialMed.getSelectedRow(), 0)));
            manipulateHisMedTable(dep, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovHisMedActionPerformed

    private void jbtnAddHisSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddHisSocActionPerformed
        HistoricalMan his = new HistoricalMan(this, true, SOC);
        if (his.getHistory() != null) {
            his.getHistory().setXDependienteModel(dep);
            controller.guardarObjeto(his.getHistory());
            manipulateHisSocTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddHisSocActionPerformed

    private void jbtnModHisSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModHisSocActionPerformed
        if (this.jTableHistorialSoc.getSelectedRow() >= 0) {
            HistoricalMan his = new HistoricalMan(this, true, SOC,
                    controller.cargarDatos(XHistmedicoModel.class, SentenciasSQL.objectDatosId,
                            this.jTableHistorialSoc.getModel().getValueAt(this.jTableHistorialSoc.getSelectedRow(), 0)));
            if (his.getHistory() != null) {
                controller.actualizarObjeto(his.getHistory());
                manipulateHisSocTable(dep, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModHisSocActionPerformed

    private void jbtnRemovHisSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovHisSocActionPerformed
        if (this.jTableHistorialSoc.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XHistmedicoModel.class,
                    SentenciasSQL.objectDatosId, this.jTableHistorialSoc.getModel().getValueAt(this.jTableHistorialSoc.getSelectedRow(), 0)));
            manipulateHisSocTable(dep, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovHisSocActionPerformed

    private void jbtnAddAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddAlleActionPerformed
        FamilyMan fam = new FamilyMan(this, true, listaCiudades, controller);
        if (fam.getFamily() != null) {

            controller.guardarObjeto(fam.getFamily());
            manipulateAllegadosTable(dep, 0);
        }
    }//GEN-LAST:event_jbtnAddAlleActionPerformed

    private void jbtnModAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModAlleActionPerformed
        if (this.jTableAllegados.getSelectedRow() >= 0) {
            FamilyMan fam = new FamilyMan(this, true, listaCiudades, controller, controller.cargarDatos(XFamiliarModel.class, SentenciasSQL.objectDatosId,
                    this.jTableAllegados.getModel().getValueAt(this.jTableAllegados.getSelectedRow(), 0)));
            if (fam.getFamily() != null) {

                controller.actualizarObjeto(fam.getFamily());
                manipulateAllegadosTable(dep, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnModAlleActionPerformed

    private void jbtnRemovAlleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovAlleActionPerformed
        if (this.jTableAllegados.getSelectedRow() >= 0) {
            controller.borrarObjeto(controller.cargarDatos(XFamiliarModel.class,
                    SentenciasSQL.objectDatosId, this.jTableAllegados.getModel().getValueAt(this.jTableAllegados.getSelectedRow(), 0)));
            manipulateAllegadosTable(dep, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, elija antes un registro de la tabla");
        }
    }//GEN-LAST:event_jbtnRemovAlleActionPerformed

    private void tfAsistenteDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAsistenteDniFocusGained
        this.tfAsistenteDni.selectAll();
    }//GEN-LAST:event_tfAsistenteDniFocusGained

    private void tfAsistenteDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAsistenteDniKeyTyped
        char caracter = evt.getKeyChar();
        if (this.tfDependienteDNI.getText().length() <= 8) {
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                evt.consume();
            }
        } else {
            if (caracter != '\b') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfAsistenteDniKeyTyped

    private void tfAsistenteDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAsistenteDniKeyReleased
        if (this.tfAsistenteDni.getText().length() == 8) {
            this.tfAsistenteDni.setText(Utils.laLetra(this.tfAsistenteDni.getText()));
            this.tfAsistenteDni.selectAll();
        }
    }//GEN-LAST:event_tfAsistenteDniKeyReleased

    private void jbtnAddRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddRecursoActionPerformed

    private void jbtnModRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModRecursoActionPerformed

    private void jbtnRemovRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemovRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRemovRecursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserDependienteAlta;
    private datechooser.beans.DateChooserCombo dateChooserDependienteNac;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemInfo;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnEditAsi;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCenterMap;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonZoomIn;
    private javax.swing.JButton jButtonZoomOut;
    private javax.swing.JComboBox<XCsModel> jComboBoxCS;
    private javax.swing.JComboBox<String> jComboBoxDependienteGenero;
    private javax.swing.JComboBox<XViviendaModel> jComboBoxDependienteVivienda;
    private javax.swing.JComboBox<XMedicoModel> jComboBoxMedico;
    private javax.swing.JLabel jLabelCS;
    private javax.swing.JLabel jLabelMapcaption;
    private javax.swing.JLabel jLabelMaps;
    private javax.swing.JLabel jLabelMedico;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelAlarmas;
    private javax.swing.JPanel jPanelAlertas;
    private javax.swing.JPanel jPanelAnalisis;
    private javax.swing.JPanel jPanelAsistente;
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
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane jScrollPaneAlarm;
    private javax.swing.JScrollPane jScrollPaneAlarm1;
    private javax.swing.JScrollPane jScrollPaneAlleg;
    private javax.swing.JScrollPane jScrollPaneAvis;
    private javax.swing.JScrollPane jScrollPaneCoord;
    private javax.swing.JScrollPane jScrollPaneHmed;
    private javax.swing.JScrollPane jScrollPaneHsoc;
    private javax.swing.JScrollPane jScrollPaneMaps;
    private javax.swing.JScrollPane jScrollPaneRecursos;
    private javax.swing.JScrollPane jScrollPaneViv;
    private javax.swing.JScrollPane jScrollPaneestado;
    private javax.swing.JTabbedPane jTabbedPaneDcha;
    private javax.swing.JTabbedPane jTabbedPaneIzq;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableAlarmas;
    private javax.swing.JTable jTableAlarmas1;
    private javax.swing.JTable jTableAllegados;
    private javax.swing.JTable jTableAvisos;
    private javax.swing.JTable jTableCoordenadas;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTable jTableHistorialMed;
    private javax.swing.JTable jTableHistorialSoc;
    private javax.swing.JTable jTableRecursos;
    private javax.swing.JTable jTableViviendas;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnAddAlle;
    private javax.swing.JButton jbtnAddCasa;
    private javax.swing.JButton jbtnAddCenSal;
    private javax.swing.JButton jbtnAddDepen;
    private javax.swing.JButton jbtnAddHisMed;
    private javax.swing.JButton jbtnAddHisSoc;
    private javax.swing.JButton jbtnAddMedico;
    private javax.swing.JButton jbtnAddRecurso;
    private javax.swing.JButton jbtnAddVivienda;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnMod;
    private javax.swing.JButton jbtnModAlle;
    private javax.swing.JButton jbtnModCen;
    private javax.swing.JButton jbtnModHisMed;
    private javax.swing.JButton jbtnModHisSoc;
    private javax.swing.JButton jbtnModMed;
    private javax.swing.JButton jbtnModRecurso;
    private javax.swing.JButton jbtnModViv;
    private javax.swing.JButton jbtnModVivienda;
    private javax.swing.JButton jbtnRemov;
    private javax.swing.JButton jbtnRemovAlle;
    private javax.swing.JButton jbtnRemovHisMed;
    private javax.swing.JButton jbtnRemovHisSoc;
    private javax.swing.JButton jbtnRemovRecurso;
    private javax.swing.JButton jbtnRemovVivienda;
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

        //Llenar Listas
        manipulateDepenList(null, 0);
        dep = (XDependienteModel) listaDependientes.get(0);
        manipulateCityList(null, 0);

        //Llenar combos
        manipulateMed(null, 0);
        manipulateCS(null, 0);

        //Llenamos datos del asistente
        cargarAsistente();

        //Llenamos datos del dependiente (primer id por defecto)
        cargadependiente(dep);

        //Llenar tablas. 
        this.jTableAlarmas.setModel(controller.cargarResultSet(SentenciasSQL.alarmasTM, null));
        Utils.resizeColumnWidth(this.jTableAlarmas);
    }

    private void initCombos() {
        medico = new DefaultComboBoxModel();
        cSalud = new DefaultComboBoxModel();
        vivienda = new DefaultComboBoxModel();
        String[] sex = {"Hobre", "Mujer", "Indefinido"};
        genero = new DefaultComboBoxModel(sex);
    }

    //Asignamos los datos del dependiente seleccionado en los respectivos campos del panel
    private void cargadependiente(Object dependiente) {
        dep = (XDependienteModel) dependiente;
        manipulateHome(null, 0);
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
        alta.setTime(dep.getFecAlta()!=null?dep.getFecAlta():new Date());
        this.dateChooserDependienteAlta.setSelectedDate(alta);

        Calendar nac = Calendar.getInstance();
        nac.setTime(dep.getFecNacim()!=null?dep.getFecNacim():new Date());
        this.dateChooserDependienteNac.setSelectedDate(nac);

        //Se muestran los elementos asociados al dependiente en los comboBox
        manipulateMed(dep.getXMedicoModel() != null ? dep.getXMedicoModel() : null, 3);
        manipulateCS(dep.getXCsModel() != null ? dep.getXCsModel() : null, 3);
        manipulateHome(viviendaActual(), 3);
        genero.setSelectedItem(dep.getGenero());

        //Se muestran los datos asociados al dependiente en los jTable
        manipulateAllegadosTable(dep, 0);
        manipulateAvisosTable(dep, 0);
        manipulateCoordenadasTable(dep, 0);
        manipulateEstadoTable(dep, 0);
        manipulateHisMedTable(dep, 0);
        manipulateHisSocTable(dep, 0);
        manipulateViviTable(dep, 0);
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
        this.tfDependienteDNI.setEditable(enabled);
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
        this.jbtnModCen.setVisible(enabled);
        this.jbtnModMed.setVisible(enabled);
        this.jbtnModViv.setVisible(enabled);
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
        dep.setXCsModel((XCsModel) this.jComboBoxCS.getSelectedItem());
        dep.setXMedicoModel((XMedicoModel) this.jComboBoxMedico.getSelectedItem());
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            if (next.getId() == ((XViviendaModel) this.jComboBoxDependienteVivienda.getSelectedItem()).getId()) {
                next.setHabitual(true);
            } else {
                next.setHabitual(false);
            }
        }

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
        controller.actualizarObjeto(asistente);
    }

    private void initJasper() {
        try {
            jClient = new JasperClient();
            JRViewer jrv = jClient.insertReport();
            jrv.setSize(840, 440);
            this.jPanelAnalisis.add(jrv, BorderLayout.CENTER);
            jrv.setVisible(true);
            jrv.setZoomRatio(0.5F);
            jrv.setEnabled(true);
            this.jPanelAnalisis.repaint();
            this.jPanelAnalisis.update(this.jPanelAnalisis.getGraphics());
            this.jPanelAnalisis.validate();
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void manipulateViviTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableViviendas.setModel(controller.cargarResultSet(SentenciasSQL.viviendasTM, obj));
                Utils.resizeColumnWidth(this.jTableViviendas);
                break;
        }
    }

    private void manipulateHisMedTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableHistorialMed.setModel(controller.cargarResultSet(SentenciasSQL.historialMedicoTM, obj));
                Utils.resizeColumnWidth(this.jTableHistorialMed);
                break;
        }
    }

    private void manipulateHisSocTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableHistorialSoc.setModel(controller.cargarResultSet(SentenciasSQL.historialSocialTM, obj));
                Utils.resizeColumnWidth(this.jTableHistorialSoc);
                break;
        }
    }

    private void manipulateAllegadosTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableAllegados.setModel(controller.cargarResultSet(SentenciasSQL.allegadosTM, obj));
                Utils.resizeColumnWidth(this.jTableAllegados);
                break;
        }
    }

    private void manipulateCoordenadasTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableCoordenadas.setModel(controller.cargarResultSet(SentenciasSQL.coordenadasTM, obj));
                Utils.resizeColumnWidth(this.jTableCoordenadas);
                break;
        }
    }

    private void manipulateAvisosTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableAvisos.setModel(controller.cargarResultSet(SentenciasSQL.avisosTM, obj));
                Utils.resizeColumnWidth(this.jTableAvisos);
                break;
        }
    }

    private void manipulateEstadoTable(Object obj, int opc) {
        switch (opc) {
            case 0:
                this.jTableEstado.setModel(controller.cargarResultSet(SentenciasSQL.estadoTM, obj));
                Utils.resizeColumnWidth(this.jTableEstado);
                break;
        }
    }

    private void manipulateDepenList(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en la lista
                listaDependientes = this.controller.cargarDatos(XDependienteModel.class);
                break;
            case 1://añadir elemento al modelo
                listaDependientes.add(obj);
                break;
            case 2://eliminar elemento al modelo
                listaDependientes.remove(obj);
                break;
        }
    }

    private void manipulateCityList(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en la lista
                listaCiudades = this.controller.cargarDatos(XCiudadModel.class);
                break;
            case 1://añadir elemento al modelo
                listaCiudades.add(obj);
                break;
            case 2://eliminar elemento al modelo
                listaCiudades.remove(obj);
                break;
        }
    }

    private void manipulateMed(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en el modelo del combo
                Vector<Object> lista = new Vector<>(this.controller.cargarDatos(XMedicoModel.class));
                this.jComboBoxMedico.setModel(new DefaultComboBoxModel(lista));
                break;
            case 1://añadir elemento al modelo
                this.jComboBoxMedico.addItem((XMedicoModel) obj);
                break;
            case 2://eliminar elemento al modelo
                this.jComboBoxMedico.removeItem(obj);
                break;
            case 3://elegir elemento del modelo
                this.jComboBoxMedico.setSelectedItem(obj);
                break;
        }
    }

    private void manipulateCS(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en el modelo del combo
                Vector<Object> lista = new Vector<>(this.controller.cargarDatos(XCsModel.class));
                this.jComboBoxCS.setModel(new DefaultComboBoxModel(lista));
                break;
            case 1://añadir elemento al modelo
                this.jComboBoxCS.addItem((XCsModel) obj);
                break;
            case 2://eliminar elemento al modelo
                this.jComboBoxCS.removeItem(obj);
                break;
            case 3://elegir elemento del modelo
                this.jComboBoxCS.setSelectedItem(obj);
                break;
        }
    }

    private void manipulateHome(Object obj, int opc) {
        switch (opc) {
            case 0://cargar los datos en el modelo del combo
                Vector<Object> lista = new Vector<>(this.controller.cargarDatos("FROM XViviendaModel WHERE id_dependiente=" + dep.getId() + " ORDER BY habitual DESC"));
                this.jComboBoxDependienteVivienda.setModel(new DefaultComboBoxModel(lista));
                break;
            case 1://añadir elemento al modelo
                this.jComboBoxDependienteVivienda.addItem((XViviendaModel) obj);
                break;
            case 2://eliminar elemento al modelo
                this.jComboBoxDependienteVivienda.removeItem(obj);
                break;
            case 3://elegir elemento del modelo
                this.jComboBoxDependienteVivienda.setSelectedItem(obj);
                break;
        }
    }

    private Object viviendaActual() {
        for (Iterator<XViviendaModel> iterator = dep.getXViviendaModels().iterator(); iterator.hasNext();) {
            XViviendaModel next = iterator.next();
            if (next.getHabitual()) {
                return next;
            }
        }
        return null;
    }
}
