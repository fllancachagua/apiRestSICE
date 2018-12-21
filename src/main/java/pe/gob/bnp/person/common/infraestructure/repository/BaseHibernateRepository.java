package pe.gob.bnp.person.common.infraestructure.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseHibernateRepository<T> implements BaseRepository<T>{
//    @PersistenceContext
//    private EntityManager entityManager;
    
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
		//return entityManager.unwrap(Session.class);
	} 
	
	@Override
	public void save(T entity) {
		getSession().save(entity);
		//entityManager.persist(entity);
	}


	@Override
	public void update(T entity) {
		getSession().update(entity);
		//entityManager.merge(entity);
	}

	@Override
	public void delete(T entity) {
		getSession().delete(entity);
		//entityManager.remove(entity);
	}

	@Override
	public void persist(T entity) {
		getSession().persist(entity);
		//entityManager.persist(entity);
	}

	@Override
	public void merge(T entity) {
		getSession().merge(entity);
		//entityManager.merge(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
	}

}
