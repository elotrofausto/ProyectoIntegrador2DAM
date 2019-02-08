package Models;
// Generated 04-feb-2019 19:46:51 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * XContactofamiliarModel generated by hbm2java
 */
public class XContactofamiliarModel  implements java.io.Serializable {


     private int id;
     private XDependienteModel XDependienteModel;
     private XFamiliarModel XFamiliarModel;
     private String disponibilidad;
     private String prioridad;

    public XContactofamiliarModel() {
    }

	
    public XContactofamiliarModel(int id, XDependienteModel XDependienteModel, XFamiliarModel XFamiliarModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.XFamiliarModel = XFamiliarModel;
    }
    public XContactofamiliarModel(int id, XDependienteModel XDependienteModel, XFamiliarModel XFamiliarModel, String disponibilidad, String prioridad, Integer createUid, Date createDate, Integer writeUid, Date writeDate) {
       this.id = id;
       this.XDependienteModel = XDependienteModel;
       this.XFamiliarModel = XFamiliarModel;
       this.disponibilidad = disponibilidad;
       this.prioridad = prioridad;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public XDependienteModel getXDependienteModel() {
        return this.XDependienteModel;
    }
    
    public void setXDependienteModel(XDependienteModel XDependienteModel) {
        this.XDependienteModel = XDependienteModel;
    }
    public XFamiliarModel getXFamiliarModel() {
        return this.XFamiliarModel;
    }
    
    public void setXFamiliarModel(XFamiliarModel XFamiliarModel) {
        this.XFamiliarModel = XFamiliarModel;
    }
    public String getDisponibilidad() {
        return this.disponibilidad;
    }
    
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getPrioridad() {
        return this.prioridad;
    }
    
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "XContactofamiliarModel{" + "id=" + id + ", XDependienteModel=" + XDependienteModel + ", XFamiliarModel=" + XFamiliarModel + ", disponibilidad=" + disponibilidad + ", prioridad=" + prioridad + '}';
    }




}


