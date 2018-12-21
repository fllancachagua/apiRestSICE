package pe.gob.bnp.person.personanatural.application.dto.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import pe.gob.bnp.person.persona.domain.entity.DocumentoIdentidad;
import pe.gob.bnp.person.persona.domain.entity.Domicilio;
import pe.gob.bnp.person.personanatural.application.dto.PersonaNaturalDto;
import pe.gob.bnp.person.personanatural.domain.entity.PersonaNatural;

@Component
public class PersonaNaturalMapper {

	public PersonaNatural reverseMapper(PersonaNaturalDto personaDto) {
		PersonaNatural persona = new PersonaNatural();
		try {
			persona.setId(personaDto.getId());
			persona.setCorreo(personaDto.getCorreo());
			persona.setDocumentoIdentidad(new DocumentoIdentidad(personaDto.getTipoDocumento(),personaDto.getNumeroDocumento()));
			persona.setDomicilio(new Domicilio(personaDto.getDireccion(), personaDto.getDistrito(), personaDto.getProvincia(), personaDto.getDepartamento(),personaDto.getCodDistrito(),personaDto.getCodProvincia(),personaDto.getCodDepartamento(),personaDto.getUbigeo()));
			persona.setEstadoCivil(personaDto.getEstadoCivil());
			if (!personaDto.getFechaNacimiento().equals("")) {
				persona.setFechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").parse(personaDto.getFechaNacimiento()));
			}
			persona.setNombres(personaDto.getNombres());
			persona.setPrimerApellido(personaDto.getPrimerApellido());
			persona.setSegundoApellido(personaDto.getSegundoApellido());
			persona.setSexo(personaDto.getSexo());
			persona.setTelefonoFijo(personaDto.getTelefonoFijo());
			persona.setTelefonoMovil(personaDto.getTelefonoMovil());
			persona.setValidadoxReniec(personaDto.getValidadoxReniec());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return persona;
	}
}
