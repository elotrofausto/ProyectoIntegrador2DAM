package Controller;

import Models.XAlarmaModel;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yop
 */
public class ResponseServer extends Thread {

    private final int LIMIT = 30000;
    private int unByte;
    private Gson gson;
    private BufferedReader br;
    private String jsonText, name;
    private Socket accept;
    private BLogic controller;
    private boolean status;

    public ResponseServer(Socket accept, BLogic controller, String name) {
        super(name);
        this.name=name;
        this.status = false;
        this.accept = accept;
        this.controller = controller;
        this.gson = new Gson();
    }

    @Override
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(accept.getInputStream(), Charset.forName("UTF-8")));
            jsonText = leer(br);
            XAlarmaModel alarm = gson.fromJson(jsonText, XAlarmaModel.class);
            controller.insertAlarm(alarm, this);
            try {
                sleep(LIMIT);
            } catch (InterruptedException ex) {
                positiveReply();
                status = true;
            }
            if (!status) {
                controller.removeAlarm(alarm, this);
                negativeReply();
            }
        } catch (IOException ex) {
            Logger.getLogger(ResponseServer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ResponseServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private String leer(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        while ((unByte = br.read()) != -1) {
            sb.append((char) unByte);
        }
        return sb.toString();
    }

    private void negativeReply() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write(0);
        bw.flush();
        bw.close();
    }

    private void positiveReply() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write(1);
        bw.flush();
        bw.close();
    }

    @Override
    public String toString() {
        return "ResponseServer: " + name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResponseServer other = (ResponseServer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
