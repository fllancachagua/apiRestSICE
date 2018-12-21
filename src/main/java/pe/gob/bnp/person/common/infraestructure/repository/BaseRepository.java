package pe.gob.bnp.person.common.infraestructure.repository;

public interface BaseRepository<T> {
	public void persist(T entity);
	public void merge(T entity);
	public void save(T entity);
	public void update(T entity);
	public void saveOrUpdate(T entity);	
	public void delete(T entity);
}
