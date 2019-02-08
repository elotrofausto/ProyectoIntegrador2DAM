package Models;
// Generated 04-feb-2019 19:46:51 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * XProvinciaModel generated by hbm2java
 */
public class XProvinciaModel  implements java.io.Serializable {


     private int id;
     private String name;
     private Set XCiudadModels = new HashSet(0);

    public XProvinciaModel() {
    }

	
    public XProvinciaModel(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public XProvinciaModel(int id, String name, Integer createUid, Date createDate, Integer writeUid, Date writeDate, Set XCiudadModels) {
       this.id = id;
       this.name = name;
       this.XCiudadModels = XCiudadModels;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getXCiudadModels() {
        return this.XCiudadModels;
    }
    
    public void setXCiudadModels(Set XCiudadModels) {
        this.XCiudadModels = XCiudadModels;
    }

    @Override
    public String toString() {
        return name;
    }




}

