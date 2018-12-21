package pe.gob.bnp.person.personajuridica.domain.entity;

import java.util.Date;

import pe.gob.bnp.person.persona.domain.entity.Domicilio;
import pe.gob.bnp.person.persona.domain.entity.Persona;

public class PersonaJuridica extends Persona{
	private String 			razonSocial;
	private String 			nombreComercial;
	private Domicilio 		domicioLegal;
	private String 			partidaRegistral;
	private Date 			fechaConstitucion;
	private String		 	telefono;
	private String 			correoInstitucional;
	private Representante 	representante;
	
	private String 			validadoxSunat;
	private String 			validadoxSunarp;
	
	

	public PersonaJuridica() {
		super();
		representante = new Representante();
		domicioLegal = new  Domicilio();
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public Domicilio getDomicioLegal() {
		return domicioLegal;
	}

	public void setDomicioLegal(Domicilio domicioLegal) {
		this.domicioLegal = domicioLegal;
	}

	public String getPartidaRegistral() {
		return partidaRegistral;
	}

	public void setPartidaRegistral(String partidaRegistral) {
		this.partidaRegistral = partidaRegistral;
	}

	public Date getFechaConstitucion() {
		return fechaConstitucion;
	}

	public void setFechaConstitucion(Date fechaConstitucion) {
		this.fechaConstitucion = fechaConstitucion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}

	public String getValidadoxSunat() {
		return validadoxSunat;
	}

	public void setValidadoxSunat(String validadoxSunat) {
		this.validadoxSunat = validadoxSunat;
	}

	public String getValidadoxSunarp() {
		return validadoxSunarp;
	}

	public void setValidadoxSunarp(String validadoxSunarp) {
		this.validadoxSunarp = validadoxSunarp;
	}

	public Representante getRepresentante() {
		return representante;
	}

	public void setRepresentante(Representante representante) {
		this.representante = representante;
	}

	
}
