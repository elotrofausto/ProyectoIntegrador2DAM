package Models;
// Generated 04-feb-2019 19:46:51 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * XAvisoModel generated by hbm2java
 */
public class XAvisoModel  implements java.io.Serializable {


     private int id;
     private XDependienteModel XDependienteModel;
     private String tipo;
     private String name;
     private Date fecDesde;
     private Date fecHasta;
     private String periodicidad;
     private int tomas;
     private Set XLlamadaModels = new HashSet(0);

    public XAvisoModel() {
    }

	
    public XAvisoModel(int id, XDependienteModel XDependienteModel, String tipo, String name, Date fecDesde, Date fecHasta, String periodicidad) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.tipo = tipo;
        this.name = name;
        this.fecDesde = fecDesde;
        this.fecHasta = fecHasta;
        this.periodicidad = periodicidad;
    }
    public XAvisoModel(int id, XDependienteModel XDependienteModel, String tipo, String name, Date fecDesde, Date fecHasta, String periodicidad, Integer createUid, Date createDate, Integer writeUid, Date writeDate, Set XLlamadaModels) {
       this.id = id;
       this.XDependienteModel = XDependienteModel;
       this.tipo = tipo;
       this.name = name;
       this.fecDesde = fecDesde;
       this.fecHasta = fecHasta;
       this.periodicidad = periodicidad;
       this.XLlamadaModels = XLlamadaModels;
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
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getFecDesde() {
        return this.fecDesde;
    }
    
    public void setFecDesde(Date fecDesde) {
        this.fecDesde = fecDesde;
    }
    public Date getFecHasta() {
        return this.fecHasta;
    }
    
    public void setFecHasta(Date fecHasta) {
        this.fecHasta = fecHasta;
    }
    public String getPeriodicidad() {
        return this.periodicidad;
    }
    
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
  
    public Set getXLlamadaModels() {
        return this.XLlamadaModels;
    }
    
    public void setXLlamadaModels(Set XLlamadaModels) {
        this.XLlamadaModels = XLlamadaModels;
    }

    public int getTomas() {
        return tomas;
    }

    public void setTomas(int tomas) {
        this.tomas = tomas;
    }

    @Override
    public String toString() {
        return "XAvisoModel{" + "id=" + id + ", XDependienteModel=" + XDependienteModel + ", tipo=" + tipo + ", name=" + name + ", fecDesde=" + fecDesde + ", fecHasta=" + fecHasta + ", periodicidad=" + periodicidad + ", tomas=" + tomas + ", XLlamadaModels=" + XLlamadaModels + '}';
    }



}


