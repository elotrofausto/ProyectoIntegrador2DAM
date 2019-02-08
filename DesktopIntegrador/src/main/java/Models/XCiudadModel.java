package Models;
// Generated 04-feb-2019 19:46:51 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * XCiudadModel generated by hbm2java
 */
public class XCiudadModel  implements java.io.Serializable {


     private int id;
     private XProvinciaModel XProvinciaModel;
     private String name;
     private String cp;
     private Set XDireccionModels = new HashSet(0);
     private Set XOfrecerrcModels = new HashSet(0);

    public XCiudadModel() {
    }

	
    public XCiudadModel(int id, XProvinciaModel XProvinciaModel, String name) {
        this.id = id;
        this.XProvinciaModel = XProvinciaModel;
        this.name = name;
    }
    public XCiudadModel(int id, XProvinciaModel XProvinciaModel, String name, String cp, Integer createUid, Date createDate, Integer writeUid, Date writeDate, Set XDireccionModels, Set XOfrecerrcModels) {
       this.id = id;
       this.XProvinciaModel = XProvinciaModel;
       this.name = name;
       this.cp = cp;
       this.XDireccionModels = XDireccionModels;
       this.XOfrecerrcModels = XOfrecerrcModels;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public XProvinciaModel getXProvinciaModel() {
        return this.XProvinciaModel;
    }
    
    public void setXProvinciaModel(XProvinciaModel XProvinciaModel) {
        this.XProvinciaModel = XProvinciaModel;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }

    public Set getXDireccionModels() {
        return this.XDireccionModels;
    }
    
    public void setXDireccionModels(Set XDireccionModels) {
        this.XDireccionModels = XDireccionModels;
    }
    public Set getXOfrecerrcModels() {
        return this.XOfrecerrcModels;
    }
    
    public void setXOfrecerrcModels(Set XOfrecerrcModels) {
        this.XOfrecerrcModels = XOfrecerrcModels;
    }

    @Override
    public String toString() {
        return "XCiudadModel{" + "id=" + id + ", XProvinciaModel=" + XProvinciaModel + ", name=" + name + ", cp=" + cp + ", XDireccionModels=" + XDireccionModels + ", XOfrecerrcModels=" + XOfrecerrcModels + '}';
    }




}


