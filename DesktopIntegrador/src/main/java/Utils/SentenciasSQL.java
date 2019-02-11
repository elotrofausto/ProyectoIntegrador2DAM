/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Yop
 */
public class SentenciasSQL {

    public static final String alarmasTM = "SELECT alarma.fecha_hora AS fecha,"
            + "(SELECT CONCAT(persona.name,' ', persona.apellido1,' ', persona.apellido2) AS dependiente"
            + " FROM x_dependiente_model AS dependientes, x_persona_model AS persona WHERE"
            + " alarma.id_dependiente = dependientes.id AND dependientes.persona_id = persona.id),"
            + " (SELECT CONCAT(persona.name,' ', persona.apellido1,' ', persona.apellido2) AS asistente"
            + " FROM x_asistente_model AS asistente, x_persona_model AS persona WHERE"
            + " alarma.id_asistente_atiende = asistente.id AND asistente.persona_id = persona.id)"
            + " FROM x_alarma_model AS alarma WHERE id_dependiente=4";

    public static final String avisosTM = " SELECT tipo AS aviso, name AS elemento,"
            + " fec_desde as inicio,fec_hasta as fin, periodicidad as descripcion,"
            + " CASE WHEN recibido isnull THEN 'no' WHEN recibido= false THEN 'no' ELSE 'si' END"
            + " as recibido FROM public.x_aviso_model WHERE id_dependiente=?";

    public static final String viviendasTM = "SELECT "
            + "CONCAT(dir.tipovia,' ',dir.direccion,' ',dir.num,', ',ciu.name,' (',pro.name,')') AS direccion,"
            + " viv.tipo AS vivienda,CASE WHEN viv.habitual = false THEN 'no' ELSE 'si' END"
            + " as \"vivienda actual\", viv.modo_acceso AS acceso FROM x_vivienda_model AS viv,"
            + " x_direccion_model AS dir, x_ciudad_model AS ciu, x_provincia_model AS pro WHERE"
            + " viv.id_direccion = dir.id and dir.id_ciudad = ciu.id AND ciu.id_provincia = pro.id"
            + " AND viv.id_dependiente=? order by viv.habitual desc";

    public static final String allegadosTM = "SELECT con.disponibilidad,"
            + " CONCAT(per.name,' ', per.apellido1,' ', per.apellido2) AS allegado,"
            + " relacion, CONCAT(dir.tipovia,' ',dir.direccion,' ',dir.num,', ',ciu.name,' (',pro.name,')') AS direccion,"
            + " CASE WHEN fam.llaves = false THEN 'no' ELSE 'si' END AS \"tiene llaves\","
            + " fam.observaciones FROM x_familiar_model AS fam, x_direccion_model AS dir,"
            + " x_ciudad_model AS ciu, x_provincia_model AS pro, x_persona_model AS per,"
            + " x_contactofamiliar_model AS con WHERE fam.direccion = dir.id AND"
            + " dir.id_ciudad = ciu.id AND ciu.id_provincia = pro.id AND fam.persona_id = per.id AND"
            + " fam.id = con.familiar_id AND con.dependiente_id=? Order by con.prioridad desc, fam.llaves desc";

    public static final String historialMedicoTM = "SELECT descripcion FROM public.x_histmedico_model WHERE name = 'medico' AND id_dependiente=?";

    public static final String historialSocialTM = "SELECT descripcion FROM public.x_histmedico_model WHERE name = 'social' AND id_dependiente=?";

    public static final String coordenadasTM = "SELECT fecha_hora, latitud, longitud FROM x_geolocaliz_model WHERE id_dependiente=?";
    
    public static final String asistenteDatos = "SELECT  asi.id, asi.password, per.id, per.name, per.apellido1, per.apellido2,"
            + " per.dni, per.telefono, per.email FROM x_asistente_model AS asi, x_persona_model AS per WHERE"
            + " asi.persona_id = per.id AND per.dni =? AND asi.password =?";
}
