#-*- coding: utf-8 -*-
from openerp import models, fields

class Provincia(models.Model):
	_name = 'x_provincia.model'
	name = fields.Char('Nombre', required=True)

class Ciudad(models.Model):
	_name = 'x_ciudad.model'
	name = fields.Char('Nombre', required=True)
	cp = fields.Char('código Postal', size=5)
	id_provincia = fields.Many2one('x_provincia.model', required=True)

class Direccion(models.Model):
	_name = 'x_direccion.model'
	tipovia = fields.Char('Tipo de vía')
	direccion = fields.Char('Dirección')
	num = fields.Integer('Numero')						
	piso = fields.Integer('Planta') 
	letra = fields.Char('Letra')
	escalera = fields.Char('Escalera') 
	id_ciudad = fields.Many2one('x_ciudad.model', required=True)
	
class Persona(models.Model):
	_name = 'x_persona.model'
	name = fields.Char('Nombre', required=True)
	apellido1 = fields.Char('Apellido1', required=True)
	apellido2 = fields.Char('Apellido2', required=True)
	dni = fields.Char('DNI', size=9, required=True)
	telefono = fields.Char('Teléfono', required=True)
	email = fields.Char('Email', required=True)

class Cs(models.Model):
	_name = 'x_cs.model'
	name = fields.Char('Nombre')
	id_direccion = fields.Many2one('x_direccion.model', required=True)
	telefono = fields.Char('Teléfono')

class Medico(models.Model):
	_name = 'x_medico.model'
	name = fields.Char('Nombre')
	apellido1 = fields.Char('Apellido1')
	apellido2 = fields.Char('Apellido2')
	disponibilidad = fields.Char('Disponibilidad')
	telefono = fields.Char('Teléfono')

class RecursoComunitario(models.Model):
	_name = 'x_recursocom.model'
	name = fields.Char('Nombre')
	descripcion = fields.Char('Observaciones')
	
class OfrecerRc(models.Model):
	_name = 'x_ofrecerrc.model'
	id_ciudad = fields.Many2one('x_ciudad.model')
	id_rc = fields.Many2one('x_recursocom.model')
	telefono = fields.Char('Teléfono')
	email = fields.Char('email')
	_sql_constraints = [
        ('recursos_constraint',
         'UNIQUE (id_ciudad, id_rc)',
         'Los campos no se pueden duplicar!')]
	
class Asistente(models.Model):
	_name = 'x_asistente.model'
	_inherits = {'x_persona.model':'persona_id'}
	persona_id = fields.Many2one('x_persona.model', required=True)
	password = fields.Char('Password', required=True)
	_sql_constraints = [
        ('asistente_constraint',
         'UNIQUE (persona_id)',
         'Los campos no se pueden duplicar!')]
	
class Dependiente(models.Model):
	_name = 'x_dependiente.model'
	_inherits = {'x_persona.model':'persona_id'}
	persona_id = fields.Many2one('x_persona.model', required=True)
	password = fields.Char('Password', required=True) 
	genero = fields.Char('Genero')
	fec_nacim = fields.Date('Fecha_Nacimiento')
	nss = fields.Char('Seguridad_Social')
	fec_alta = fields.Date('Fecha_Alta')
	id_medico = fields.Many2one('x_medico.model')
	id_cs = fields.Many2one('x_cs.model')
	_sql_constraints = [
        ('dependiente_constraint',
         'UNIQUE (persona_id)',
         'Los campos no se pueden duplicar!')]
	
class Vivienda(models.Model):
	_name = 'x_vivienda.model'
	name = fields.Char('Tipo_Vivienda')
	habitual= fields.Boolean('Habitual')
	id_direccion = fields.Many2one('x_direccion.model')
	id_dependiente = fields.Many2one('x_dependiente.model')
	modo_acceso = fields.Char('Modo_Acceso') 	
	
class Allegados(models.Model):
	_name = 'x_familiar.model'
	_inherits = {'x_persona.model':'persona_id'}
	persona_id = fields.Many2one('x_persona.model')
	direccion = fields.Many2one('x_direccion.model')
	llaves = fields.Boolean('Llaves')
	relacion = fields.Char('Relacion') 
	observaciones = fields.Char('Observaciones')
	dependiente = fields.Many2many('x_dependiente.model')
	_sql_constraints = [
        ('allegados_constraint',
         'UNIQUE (persona_id)',
         'Los campos no se pueden duplicar!')]
	
class Historial(models.Model):
	_name = 'x_histmedico.model'
	id_dependiente = fields.Many2one('x_dependiente.model')
	name = fields.Char('Nombre')
	descripcion = fields.Char('Observaciones')
	
class Contacto_Familiar(models.Model):
	_name= 'x_contactofamiliar.model'
	familiar_id = fields.Many2one('x_familiar.model', required=True)
	dependiente_id = fields.Many2one('x_dependiente.model', required=True)
	disponibilidad = fields.Char('Disponibilidad')
	prioridad = fields.Char('Prioridad')
	_sql_constraints = [
        ('contactos_constraint',
         'UNIQUE (familia_id, dependiente_id)',
         'Los campos no se pueden duplicar!')]
	
	
class Aviso(models.Model):
	_name = 'x_aviso.model'
	id_dependiente = fields.Many2one('x_dependiente.model')
	tipo = fields.Char('Tipo')
	name = fields.Char('Nombre') 
	fec_desde = fields.Date('Fecha_Desde')
	fec_hasta = fields.Date('Fecha_Hasta')
	periodicidad = fields.Char('Observaciones')
	recibido= fields.Boolean('Recibido')
	tomas= fields.Integer('Num_Tomas')
	
class Estado(models.Model):
	_name = 'x_estado.model'
	id_dependiente = fields.Many2one('x_dependiente.model')
	fecha_hora = fields.Datetime('Fecha_Hora')
	fecha_hora_inicio = fields.Datetime('Fecha_Hora_Inicio')
	descripcion = fields.Char('Observaciones')

class Alarma(models.Model):
	_name = 'x_alarma.model'
	id_dependiente = fields.Many2one('x_dependiente.model')
	fecha_hora = fields.Datetime('Fecha_Hora')
	id_asistente_atiende = fields.Many2one('x_asistente.model')
	descripcion = fields.Char('Observaciones')
	tipo = fields.Char('Tipo')

class Llamada(models.Model):
	_name = 'x_llamada.model'
	fecha_hora = fields.Datetime('Fecha_Hora')
	id_asistente = fields.Many2one('x_asistente.model')
	id_aviso = fields.Many2one('x_aviso.model')
	id_dependiente = fields.Many2one('x_dependiente.model')
	
class Geolocaliz(models.Model):
	_name = 'x_geolocaliz.model'
	id_dependiente = fields.Many2one('x_dependiente.model')
	latitud = fields.Float('Latitud') 
	longitud = fields.Float('Longitud')
	fecha_hora = fields.Datetime('Fecha_Hora')