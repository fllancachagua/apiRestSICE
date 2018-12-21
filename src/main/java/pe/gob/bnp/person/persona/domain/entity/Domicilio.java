package pe.gob.bnp.person.persona.domain.entity;

public class Domicilio {
	private String direccion;
	private String distrito;
	private String provincia;
	private String departamento;
	private String codDistrito;
	private String codProvincia;
	private String codDepartamento;
	private String ubigeo;
	
	
	public Domicilio() {
	}
	
	public Domicilio(String direccion, String distrito, String provincia, String departamento, String codDistrito,
			String codProvincia, String codDepartamento, String ubigeo) {
		super();
		this.direccion = direccion;
		this.distrito = distrito;
		this.provincia = provincia;
		this.departamento = departamento;
		this.codDistrito = codDistrito;
		this.codProvincia = codProvincia;
		this.codDepartamento = codDepartamento;
		this.ubigeo = ubigeo;
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
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
	public String getCodDepartamento() {
		return codDepartamento;
	}
	public void setCodDepartamento(String codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	
	
}
