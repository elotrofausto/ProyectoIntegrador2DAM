package Models;
// Generated 04-feb-2019 19:46:51 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * XViviendaModel generated by hbm2java
 */
public class XViviendaModel implements java.io.Serializable {

    private int id;
    private XDependienteModel XDependienteModel;
    private XDireccionModel XDireccionModel;
    private String tipo;
    private Boolean habitual;
    private String modoAcceso;
    private Set XDependienteModels = new HashSet(0);

    public XViviendaModel() {
    }

    public XViviendaModel(int id, XDependienteModel XDependienteModel, XDireccionModel XDireccionModel) {
        this.id = id;
        this.XDependienteModel = XDependienteModel;
        this.XDireccionModel = XDireccionModel;
    }
    
    public XViviendaModel(XDireccionModel XDireccionModel, String tipo, Boolean habitual, String modoAcceso) {
        this.XDireccionModel = XDireccionModel;
        this.tipo = tipo;
        this.habitual = habitual;
        this.modoAcceso = modoAcceso;
    }
    
    public XViviendaModel(int id, XDireccionModel XDireccionModel, String tipo, Boolean habitual, String modoAcceso, Set XDependienteModels) {
        this.id = id;
        this.XDireccionModel = XDireccionModel;
        this.tipo = tipo;
        this.habitual = habitual;
        this.modoAcceso = modoAcceso;
        this.XDependienteModels = XDependienteModels;
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

    public XDireccionModel getXDireccionModel() {
        return this.XDireccionModel;
    }

    public void setXDireccionModel(XDireccionModel XDireccionModel) {
        this.XDireccionModel = XDireccionModel;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getHabitual() {
        return this.habitual;
    }

    public void setHabitual(Boolean habitual) {
        this.habitual = habitual;
    }

    public String getModoAcceso() {
        return this.modoAcceso;
    }

    public void setModoAcceso(String modoAcceso) {
        this.modoAcceso = modoAcceso;
    }

    public Set getXDependienteModels() {
        return this.XDependienteModels;
    }

    public void setXDependienteModels(Set XDependienteModels) {
        this.XDependienteModels = XDependienteModels;
    }

    @Override
    public String toString() {
        String respuesta = XDireccionModel.toString();
        if (tipo != null) {
            respuesta += ", tipo=" + tipo;
        }
        if (habitual) {
            respuesta += ", habitual= Si";
        }else{
            respuesta += ", habitual= No";
        }
        return respuesta;
    }

}
