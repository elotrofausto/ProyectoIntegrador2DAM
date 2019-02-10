/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.XAsistenteModel;
import View.AccessAsist;
import View.MainView;
import java.net.ServerSocket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        initView();
        serverSocket = initServerSocket();
        hibernate.logDesktopApp(serverSocket);
    }

    private void initView() {
        mainView = new MainView(this);
        mainView.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainView.setVisible(true);
    }

    private void initHibernate() {
        try {
            AccessAsist access = new AccessAsist(null, true);
            asistente = access.getAsistente();
            System.err.println(asistente.toString());
            //definir la vista del gif de espera
            hibernate = new HibernateController();
            //hacer join
            //cerrar vista, para que se visualice el panel cargado
        } catch (SQLException ex) {
            System.err.println("PROBLEMAS ACCEDIENDO A LA BD");
        }

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

    //Getters and Setters
    public HibernateController getHibernate() {
        return hibernate;
    }

    public TableModel cargarResultSet(String query) {
        return hibernate.getRs(query);
    }
}
