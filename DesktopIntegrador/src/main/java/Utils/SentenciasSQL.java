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

    public static final String alarmasTM = " SELECT alarma.fecha_hora AS fecha,\n"
            + " (SELECT CONCAT(persona.name,' ', persona.apellido1,' ', persona.apellido2) AS dependiente\n"
            + " FROM x_dependiente_model AS dependientes, x_persona_model AS persona\n"
            + " WHERE alarma.id_dependiente = dependientes.id AND\n"
            + " dependientes.persona_id = persona.id),\n"
            + " (SELECT CONCAT(persona.name,' ', persona.apellido1,' ', persona.apellido2) AS asistente\n"
            + " FROM x_asistente_model AS asistente, x_persona_model AS persona\n"
            + " WHERE alarma.id_asistente_atiende = asistente.id AND\n"
            + " asistente.persona_id = persona.id)\n"
            + " FROM x_alarma_model AS alarma";

    public static final String avisosTM = "SELECT tipo AS aviso, name AS elemento, fec_desde as inicio,fec_hasta as fin, "
            + "periodicidad as descripcion, CASE WHEN recibido isnull THEN 'no'\n"
            + " WHEN recibido= false THEN 'no' ELSE 'si' END as recibido FROM public.x_aviso_model";

    public static final String viviendasTM = "SELECT "
            + "CONCAT(dir.tipovia,' ',dir.direccion,' ',dir.num,', ',ciu.name,' (',pro.name,')') AS direccion,\n"
            + "	viv.tipo AS vivienda,CASE WHEN viv.habitual = false THEN 'no' ELSE 'si' END as \"vivienda actual\",\n"
            + "	viv.modo_acceso AS acceso\n"
            + "	FROM x_vivienda_model AS viv, x_direccion_model AS dir, x_ciudad_model AS ciu, x_provincia_model AS pro\n"
            + "	where viv.id_direccion = dir.id and\n"
            + "	dir.id_ciudad = ciu.id AND\n"
            + "	ciu.id_provincia = pro.id\n"
            + "	order by viv.habitual desc";

    public static final String allegadosTM = "SELECT con.disponibilidad, \n"
            + "	   CONCAT(per.name,' ', per.apellido1,' ', per.apellido2) AS allegado, relacion,\n"
            + "	   CONCAT(dir.tipovia,' ',dir.direccion,' ',dir.num,', ',ciu.name,' (',pro.name,')') AS direccion,\n"
            + "	   CASE WHEN fam.llaves = false THEN 'no' ELSE 'si' END as \"tiene llaves\", fam.observaciones\n"
            + "FROM x_familiar_model AS fam, x_direccion_model AS dir,\n"
            + "	 x_ciudad_model AS ciu, x_provincia_model AS pro,\n"
            + "	 x_persona_model AS per, x_contactofamiliar_model AS con\n"
            + "WHERE fam.direccion = dir.id AND dir.id_ciudad = ciu.id AND\n"
            + "	  ciu.id_provincia = pro.id AND fam.persona_id = per.id AND\n"
            + "	  fam.id = con.familiar_id\n"
            + "Order by con.prioridad desc, fam.llaves desc";
}
