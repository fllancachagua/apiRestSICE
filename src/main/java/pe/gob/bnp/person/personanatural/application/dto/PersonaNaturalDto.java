package pe.gob.bnp.person.personanatural.application.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import pe.gob.bnp.person.common.application.dto.RequestBaseDto;
import pe.gob.bnp.person.common.application.dto.deserializer.PersonaNaturalDtoDeserializer;
import pe.gob.bnp.person.common.application.enumeration.RequestBodyType;

@JsonDeserialize(using = PersonaNaturalDtoDeserializer.class)
public class PersonaNaturalDto extends RequestBaseDto {
	private long id;
	private String numeroDocumento;
	private String tipoDocumento;
	private String nombres;
	private String primerApellido;
	private String segundoApellido;
	private String sexo;
	private String correo;
	private String estadoCivil;
	private String fechaNacimiento;
	private String telefonoFijo;
	private String telefonoMovil;
	private String codDepartamento;
	private String codProvincia;
	private String codDistrito;
	private String departamento;
	private String provincia;
	private String distrito;
	private String direccion;
	private String ubigeo;
	private String validadoxReniec;
	
	public PersonaNaturalDto(long id, String numeroDocumento, String tipoDocumento, String nombres,
			String primerApellido, String segundoApellido, String sexo, String correo,
			String estadoCivil, String fechaNacimiento, String telefonoFijo, String telefonoMovil,
			String codDepartamento, String codDistrito, String codProvincia, String departamento, String direccion,
			String distrito, String provincia, String ubigeo, String validadoxReniec,RequestBodyType requestBodyType) {
		super();
		this.id = id;
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.nombres = nombres;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.sexo = sexo;
		this.correo = correo;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.telefonoFijo = telefonoFijo;
		this.telefonoMovil = telefonoMovil;
		this.codDepartamento = codDepartamento;
		this.codDistrito = codDistrito;
		this.codProvincia = codProvincia;
		this.departamento = departamento;
		this.direccion = direccion;
		this.distrito = distrito;
		this.provincia = provincia;
		this.ubigeo = ubigeo;
		this.validadoxReniec = validadoxReniec;
		this.requestBodyType = requestBodyType;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	public String getCodDepartamento() {
		return codDepartamento;
	}
	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}
	public String getCodDistrito() {
		return codDistrito;
	}
	public void setCodDistrito(String codDistrito) {
		this.codDistrito = codDistrito;
	}
	public String getCodProvincia() {
		return codProvincia;
	}
	public void setCodProvincia(String codProvincia) {
		this.codProvincia = codProvincia;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	public String getValidadoxReniec() {
		return validadoxReniec;
	}
	public void setValidadoxReniec(String validadoxReniec) {
		this.validadoxReniec = validadoxReniec;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
