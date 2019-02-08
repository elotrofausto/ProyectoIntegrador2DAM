package Models;
// Generated 04-feb-2019 19:46:51 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * XDireccionModel generated by hbm2java
 */
public class XDireccionModel  implements java.io.Serializable {


     private int id;
     private XCiudadModel XCiudadModel;
     private String tipovia;
     private String direccion;
     private Integer num;
     private Integer piso;
     private String letra;
     private String escalera;
     private Set XFamiliarModels = new HashSet(0);
     private Set XViviendaModels = new HashSet(0);
     private Set XCsModels = new HashSet(0);

    public XDireccionModel() {
    }

	
    public XDireccionModel(int id, XCiudadModel XCiudadModel) {
        this.id = id;
        this.XCiudadModel = XCiudadModel;
    }
    public XDireccionModel(int id, XCiudadModel XCiudadModel, String tipovia, String direccion, Integer num, Integer piso, String letra, String escalera, Integer createUid, Date createDate, Integer writeUid, Date writeDate, Set XFamiliarModels, Set XViviendaModels, Set XCsModels) {
       this.id = id;
       this.XCiudadModel = XCiudadModel;
       this.tipovia = tipovia;
       this.direccion = direccion;
       this.num = num;
       this.piso = piso;
       this.letra = letra;
       this.escalera = escalera;
       this.XFamiliarModels = XFamiliarModels;
       this.XViviendaModels = XViviendaModels;
       this.XCsModels = XCsModels;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public XCiudadModel getXCiudadModel() {
        return this.XCiudadModel;
    }
    
    public void setXCiudadModel(XCiudadModel XCiudadModel) {
        this.XCiudadModel = XCiudadModel;
    }
    public String getTipovia() {
        return this.tipovia;
    }
    
    public void setTipovia(String tipovia) {
        this.tipovia = tipovia;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getNum() {
        return this.num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
    public Integer getPiso() {
        return this.piso;
    }
    
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
    public String getLetra() {
        return this.letra;
    }
    
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public String getEscalera() {
        return this.escalera;
    }
    
    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public Set getXFamiliarModels() {
        return this.XFamiliarModels;
    }
    
    public void setXFamiliarModels(Set XFamiliarModels) {
        this.XFamiliarModels = XFamiliarModels;
    }
    public Set getXViviendaModels() {
        return this.XViviendaModels;
    }
    
    public void setXViviendaModels(Set XViviendaModels) {
        this.XViviendaModels = XViviendaModels;
    }
    public Set getXCsModels() {
        return this.XCsModels;
    }
    
    public void setXCsModels(Set XCsModels) {
        this.XCsModels = XCsModels;
    }

    @Override
    public String toString() {
        return "XDireccionModel{" + "id=" + id + ", XCiudadModel=" + XCiudadModel + ", tipovia=" + tipovia + ", direccion=" + direccion + ", num=" + num + ", piso=" + piso + ", letra=" + letra + ", escalera=" + escalera + ", XFamiliarModels=" + XFamiliarModels + ", XViviendaModels=" + XViviendaModels + ", XCsModels=" + XCsModels + '}';
    }




}

