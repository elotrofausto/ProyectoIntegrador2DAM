/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author vesprada
 */
public class XIpModel implements java.io.Serializable {

    private int id;
    private String ip;

    public XIpModel() {
       
    }

    public XIpModel(int id, String Ip) {
        this.id = id;
        this.ip = Ip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String Ip) {
        this.ip = Ip;
    }

    @Override
    public String toString() {
        return "XIpModel{" + "id=" + id + ", ip=" + ip + '}';
    }

    
    
}
