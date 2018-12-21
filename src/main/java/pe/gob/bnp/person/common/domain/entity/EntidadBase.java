package pe.gob.bnp.person.common.domain.entity;

import java.util.Date;

public class EntidadBase {
	//state
	protected String estado;
	//audit
	protected Date fechaRegistro;
	protected int	idUsuarioRegistro;
	protected Date fechaActualizacion;
	protected int  idUsuarioActualizacion;
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getIdUsuarioRegistro() {
		return idUsuarioRegistro;
	}
	public void setIdUsuarioRegistro(int idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public int getIdUsuarioActualizacion() {
		return idUsuarioActualizacion;
	}
	public void setIdUsuarioActualizacion(int idUsuarioActualizacion) {
		this.idUsuarioActualizacion = idUsuarioActualizacion;
	}	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
