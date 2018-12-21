package pe.gob.bnp.person.personanatural.domain.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import pe.gob.bnp.person.persona.domain.entity.Domicilio;
import pe.gob.bnp.person.persona.domain.entity.Persona;

@Component
public class PersonaNatural extends Persona {
	private String 				nombres;
	private String 				primerApellido;
	private String 				segundoApellido;
	private String				correo;
	private String 				sexo;
	private String				estadoCivil;
	private Date				fechaNacimiento;
	private String 				telefonoMovil;
	private String 				telefonoFijo;
	private String 				validadoxReniec;
	private Domicilio			domicilio;

	public PersonaNatural() {
		this.domicilio = new Domicilio(); 
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getValidadoxReniec() {
		return validadoxReniec;
	}

	public void setValidadoxReniec(String validadoxReniec) {
		this.validadoxReniec = validadoxReniec;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	

}
