package pe.gob.bnp.person.common.application.dto.deserializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import pe.gob.bnp.person.common.application.enumeration.RequestBodyType;
import pe.gob.bnp.person.common.application.util.VO;
import pe.gob.bnp.person.personanatural.application.dto.PersonaNaturalDto;

public class PersonaNaturalDtoDeserializer extends JsonDeserializer<PersonaNaturalDto>{

	@Override
	public PersonaNaturalDto deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		PersonaNaturalDto request = null;
		try {
			ObjectCodec object = jsonParser.getCodec();
			JsonNode node = object.readTree(jsonParser);
		//	long id 					= node.get("id").asLong();
			String numeroDocumento		= VO.getString(node.get("numeroDocumento").asText());
			String tipoDocumento		= VO.getString(node.get("tipoDocumento").asText());
			String nombres				= VO.getString(node.get("nombres").asText());
			String primerApellido		= VO.getString(node.get("primerApellido").asText());
			String segundoApellido		= VO.getString(node.get("segundoApellido").asText());
			String sexo					= VO.getString(node.get("sexo").asText());
			String correo				= VO.getString(node.get("correo").asText());
			String estadoCivil			= VO.getString(node.get("estadoCivil").asText());
			String fechaNacimiento		= VO.getString(node.get("fechaNacimiento").asText());
			String telefonoFijo			= VO.getString(node.get("telefonoFijo").asText());
			String telefonoMovil		= VO.getString(node.get("telefonoMovil").asText());
			String codDepartamento		= VO.getString(node.get("codDepartamento").asText());
			String codDistrito			= VO.getString(node.get("codDistrito").asText());
			String codProvincia			= VO.getString(node.get("codProvincia").asText());
			String departamento			= VO.getString(node.get("departamento").asText());
			String direccion			= VO.getString(node.get("direccion").asText());
			String distrito				= VO.getString(node.get("distrito").asText());
			String provincia			= VO.getString(node.get("provincia").asText());
			String ubigeo				= VO.getString(node.get("ubigeo").asText());
			String validadoxReniec		= VO.getString(node.get("validadoxReniec").asText());
			RequestBodyType requestBodyType = RequestBodyType.VALID;
			request = new PersonaNaturalDto(0L, numeroDocumento, tipoDocumento, nombres,
											primerApellido, segundoApellido, sexo, correo, 
											estadoCivil, fechaNacimiento, telefonoFijo, telefonoMovil,codDepartamento, 
											codDistrito, codProvincia, departamento, direccion, distrito, provincia, 
											ubigeo, validadoxReniec,requestBodyType);
		} catch (Exception e) {
			request = new PersonaNaturalDto(0L, "",  "","", "", "", "", "","", "", "", "","", 
											"", "", "", "", "", "", "", "",RequestBodyType.INVALID);
		}
		return request;
	}

}
