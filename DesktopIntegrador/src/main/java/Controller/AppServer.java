/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vesprada
 */
public class AppServer extends Thread {

    private static final int PORT = 4444;
    private ServerSocket server;

    public AppServer() {
        try {
            server = new ServerSocket(PORT);
        } catch (IOException ex) {
            Logger.getLogger(AppServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run(){
        while (true){
            try {
                server.accept();
            } catch (IOException ex) {
                Logger.getLogger(AppServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static int getPORT() {
        return PORT;
    }

    public ServerSocket getServer() {
        return server;
    }
    
    
}
