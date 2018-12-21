package pe.gob.bnp.person.personanatural.domain.repository;


import pe.gob.bnp.person.common.infraestructure.repository.BaseRepository;
import pe.gob.bnp.person.personanatural.domain.entity.PersonaNatural;

public interface PersonaNaturalRepository extends BaseRepository<PersonaNatural>{
	//PersonaNatural findByDocument(String tipoDocumento, String numeroDocumento) throws Exception;
	long countByDocument(String tipoDocumento, String numeroDocumento) throws Exception;
}
