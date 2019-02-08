/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MainView;
import java.net.ServerSocket;
import java.util.List;

/**
 *
 * @author vesprada
 */
public class BLogic {

    private MainView mainView;
    private AppServer appServer;
    private HibernateController hibernate;
    private ServerSocket serverSocket;

    public BLogic() {
        initHibernate();
        initView();
        serverSocket = initServerSocket();
        hibernate.logDesktopApp(serverSocket);
    }

    private void initView() {
        mainView = new MainView(this);
        mainView.setVisible(true);
    }

    private void initHibernate() {
        hibernate = new HibernateController();
    }

    private ServerSocket initServerSocket() {
        appServer = new AppServer();
        return appServer.getServer();
    }

    //Getters and Setters
    public HibernateController getHibernate() {
        return hibernate;
    }

    //Consultas recurrentes
    public List<Object> cargarDatos(Class c) {
        return hibernate.read(c);
    }

}
