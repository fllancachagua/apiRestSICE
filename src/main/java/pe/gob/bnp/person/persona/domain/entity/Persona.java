package pe.gob.bnp.person.persona.domain.entity;

import pe.gob.bnp.person.common.domain.entity.EntidadBase;

public abstract class Persona {
	private long id;
	private EntidadBase auditoria;
	private DocumentoIdentidad documentoIdentidad;
	
	public Persona() {
		this.documentoIdentidad = new DocumentoIdentidad();
		this.auditoria = new EntidadBase();
	}

	public DocumentoIdentidad getDocumentoIdentidad() {
		return documentoIdentidad;
	}

	public void setDocumentoIdentidad(DocumentoIdentidad documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EntidadBase getAuditoria() {
		return auditoria;
	}

	public void setAuditoria(EntidadBase auditoria) {
		this.auditoria = auditoria;
	}
	
}
