package pe.gob.bnp.person.personanatural.application;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.bnp.person.common.application.Notification;
import pe.gob.bnp.person.personanatural.application.dto.PersonaNaturalDto;
import pe.gob.bnp.person.personanatural.application.dto.mapper.PersonaNaturalMapper;
import pe.gob.bnp.person.personanatural.domain.entity.PersonaNatural;
import pe.gob.bnp.person.personanatural.domain.repository.PersonaNaturalRepository;
import pe.gob.bnp.person.personanatural.domain.service.PersonaNaturalDomainService;

@Service
public class PersonaNaturalApplicationService {
	@Autowired
	PersonaNaturalDomainService personaNaturalDomainService;
	
	@Autowired
	PersonaNaturalRepository personaNaturalRepository;
	
	@Autowired
	PersonaNaturalMapper personaNaturalMapper;

	@Transactional
	public void realizarRegistro(PersonaNaturalDto dto) throws Exception{
		
		Notification notification = this.validation(dto);
		if (notification.hasErrors()) {
			throw new IllegalArgumentException(notification.errorMessage());
		}
		PersonaNatural persona = personaNaturalMapper.reverseMapper(dto);
		persona.getAuditoria().setEstado("S");
		persona.getAuditoria().setIdUsuarioRegistro(999);
		persona.getAuditoria().setFechaRegistro(new Date());
		//validar que el registro no exista en base de datos.
		long userCount = personaNaturalRepository.countByDocument(dto.getTipoDocumento(), dto.getNumeroDocumento());
		//en caso no exista registrar en bd
		if (userCount==0) {
			personaNaturalRepository.save(persona);
		}else {
			throw new IllegalArgumentException("Usuario ya se encuentra registrado");
		}
		//en caso ya existe infomar que ya existe
		//llamar la notificacion
	}
	
	//@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)  
	private Notification validation(PersonaNaturalDto dto) {
		Notification notification = new Notification();
		if (dto.getTipoDocumento().equals("")) {
			notification.addError("Tipo de documento no válido.");
		}
		if (dto.getNumeroDocumento().equals("")) {
			notification.addError("Número de documento no válido.");
		}
		if (dto.getNombres().equals("")) {
			notification.addError("Nombre de persona no válida.");
		}
		if (dto.getPrimerApellido().equals("")) {
			notification.addError("Primer apellido no válido.");
		}
		if (dto.getCorreo().equals("")) {
			notification.addError("Primer apellido no válido.");
		}
		if (dto.getTelefonoMovil().equals("")) {
			notification.addError("Teléfono móvil no válido.");
		}
		return notification;
	}	
}
