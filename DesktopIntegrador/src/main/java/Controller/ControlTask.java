package Controller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yop
 */
public class ControlTask extends Thread {

    private final int LIMIT = 30000;
    private boolean status;
    private Socket accept;
    private String name;

    ControlTask(BLogic controller, Socket accept, String name) {
        this.status = false;
        this.name = name;
        this.accept = accept;
    }

    @Override
    public void run() {
      /*  try {
            sleep(LIMIT);
        } catch (InterruptedException ex) {
        }*/
        try {
            if (status) {
                positiveReply();
            } else {
                negativeReply();
            }
        } catch (IOException ex) {
            Logger.getLogger(ControlTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void negativeReply() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("0");
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private void positiveReply() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("1");
        bw.newLine();
        bw.flush();
        bw.close();
    }

    @Override
    public String toString() {
        return "ResponseServer: " + name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final ControlTask other = (ControlTask) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
