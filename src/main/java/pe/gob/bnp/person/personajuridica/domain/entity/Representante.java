package pe.gob.bnp.person.personajuridica.domain.entity;

import pe.gob.bnp.person.personanatural.domain.entity.PersonaNatural;

public class Representante {
	private PersonaNatural persona;
	private String cargo;
	
	public Representante() {
		super();
		this.persona = new PersonaNatural();
	}

	public PersonaNatural getPersona() {
		return persona;
	}
	
	public void setPersona(PersonaNatural persona) {
		this.persona = persona;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
