package pe.gob.bnp.person.personanatural.api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.bnp.person.common.api.controller.ResponseHandler;
import pe.gob.bnp.person.personanatural.application.PersonaNaturalApplicationService;
import pe.gob.bnp.person.personanatural.application.dto.PersonaNaturalDto;


@RestController
@RequestMapping("api/personasnaturales/")
public class PersonaNaturalController {
	@Autowired 
	PersonaNaturalApplicationService personaNaturalApplicationService;
	
	@Autowired
	ResponseHandler responseHandler;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> realizarRegistro(@RequestBody PersonaNaturalDto personaNaturalDto) throws Exception {
		try {
			personaNaturalApplicationService.realizarRegistro(personaNaturalDto);
			return this.responseHandler.getOkCommandResponse("Natural Person save done!");
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse(ex);
		}
	}
}
