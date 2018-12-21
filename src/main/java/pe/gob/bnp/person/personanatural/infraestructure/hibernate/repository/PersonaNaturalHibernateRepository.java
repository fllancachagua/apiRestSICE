package pe.gob.bnp.person.personanatural.infraestructure.hibernate.repository;

import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.gob.bnp.person.common.infraestructure.repository.BaseHibernateRepository;
import pe.gob.bnp.person.persona.domain.entity.Persona;
import pe.gob.bnp.person.personanatural.domain.entity.PersonaNatural;
import pe.gob.bnp.person.personanatural.domain.repository.PersonaNaturalRepository;


@Repository
public class PersonaNaturalHibernateRepository extends BaseHibernateRepository<PersonaNatural> implements PersonaNaturalRepository {

	@Override
	public long countByDocument(String tipoDocumento, String numeroDocumento) throws Exception {
		Long resultado = (Long)this.getSession().createCriteria(Persona.class).createAlias("documentoIdentidad", "d").setProjection(Projections.rowCount()).add(Restrictions.eq("d.tipoDocumento", tipoDocumento)).add(Restrictions.eq("d.numeroDocumento", numeroDocumento)).uniqueResult();
		//Long resultado = (Long)this.getSession().createCriteria(PersonaNatural.class).setProjection(Projections.rowCount()).add(Restrictions.eq("correo", "torrejon01@gmail.com")).uniqueResult();
		//Criteria criteria = this.getSession().createCriteria(PersonaNatural.class);
		//CriteriaBuilder criteriaBuilder = ge
		//String sql ="SELECT COUNT(1) FROM TBL_PERSONAS WHERE TIPO_DOCUMENTO_ID = "+tipoDocumento+" AND NRO_DOCUMENTO ='"+numeroDocumento+"'";;
		
//		TypedQuery<Long> consulta = getSession().crea
//		long resultado = consulta.getSingleResult();
		//TypedQuery<Long> query = countWithFilter(criteriaBuilder);
		return resultado;
	}

//	private TypedQuery<Long> countWithFilter(CriteriaBuilder criteriaBuilder, Predicate predicate) {
//		CriteriaQuery<Long> countQuery = criteriaBuilder.createQuery(Long.class);
//		//countQuery.select(criteriaBuilder.count(countQuery.from(Customer.class)));
//		TypedQuery<Long> query = getSession().createQuery(countQuery);
//		return query;
//	}	

}
