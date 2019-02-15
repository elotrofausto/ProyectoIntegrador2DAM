/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.XAsistenteModel;
import Models.XDependienteModel;
import Models.XViviendaModel;
import View.AccessAsist;
import View.MainView;
import java.net.ServerSocket;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.TableModel;

/**
 *
 * @author vesprada
 */
public class BLogic {
    
    private MainView mainView;
    private AppServer appServer;
    private HibernateController hibernate;
    private ServerSocket serverSocket;
    private XAsistenteModel asistente;
    
    public BLogic() {
        initHibernate();
        asistente = getAssistant();
        initView();
        serverSocket = initServerSocket();
        hibernate.logDesktopApp(serverSocket);
    }
    
    private void initView() {
        mainView = new MainView(this, asistente);
        mainView.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainView.setVisible(true);
    }
    
    private void initHibernate() {
        hibernate = new HibernateController();
        hibernate.start();
    }
    
    private XAsistenteModel getAssistant() {
        AccessAsist access = null;
        try {
            access = new AccessAsist(null, true, this);
        } catch (SQLException ex) {
            System.err.println("PROBLEMAS ACCEDIENDO A LA BD");
        }
        return access.getAsistente();
    }
    
    private ServerSocket initServerSocket() {
        appServer = new AppServer();
        return appServer.getServer();
    }

    //Gestión de la BD
    //--------------------------------------------------------------------------
    //Consultas recurrentes
    public List<Object> cargarDatos(Class c) {
        return hibernate.read(c);
    }

    //Consultas personalizadas
    public List<Object> cargarDatos(String query) {
        return hibernate.readWithQuery(query);
    }
    
    public Object cargarDatos(Class c, String critery, Object opc) {
        return hibernate.read(c, critery, opc);
    }
    
    public TableModel cargarResultSet(String query, Object dependiente) {
        return hibernate.getRs(query, dependiente);
    }
    
    //Guardar un nuevo objeto en la base de datos
    public void guardarObjeto(Object object) {
        hibernate.save(object);
    }
    
    //Actualizar registro
    public void actualizarObjeto(Object object){
        hibernate.update(object);
    }
    
    //Getters and Setters
    public HibernateController getHibernate() {
        return hibernate;
    }

    public void asignarHabitual(XViviendaModel viv, XDependienteModel dep) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
