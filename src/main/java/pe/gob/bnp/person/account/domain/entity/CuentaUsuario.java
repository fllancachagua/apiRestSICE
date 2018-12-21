package pe.gob.bnp.person.account.domain.entity;

import java.util.Date;

import pe.gob.bnp.person.common.domain.entity.EntidadBase;
import pe.gob.bnp.person.persona.domain.entity.Persona;

public class CuentaUsuario  extends EntidadBase {
	private String usuario;
	private String password;
	private String correo;
	
	private String estado;
	private Date fechaActivacion; 
	private Date fechaCreacion;
	private Date fechaUltimoAcceso;
	private String tipoPersona;//PN: Persona natural, PJ: Persona juridica 
	private Persona persona;
	
	
	public CuentaUsuario() {
		
	}
	
	public CuentaUsuario(Persona persona) {
		super();
		this.persona = persona;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getFechaActivacion() {
		return fechaActivacion;
	}
	public void setFechaActivacion(Date fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}
	public String getTipoPersona() {
		return tipoPersona;
	}
	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Date getFechaUltimoAcceso() {
		return fechaUltimoAcceso;
	}

	public void setFechaUltimoAcceso(Date fechaUltimoAcceso) {
		this.fechaUltimoAcceso = fechaUltimoAcceso;
	}
	
	
}
