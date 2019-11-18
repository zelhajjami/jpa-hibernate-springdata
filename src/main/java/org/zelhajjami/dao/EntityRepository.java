package org.zelhajjami.dao;

import java.util.List;

public interface EntityRepository<T> {
	public T save(T p);
	public List<T> findAll();
	public List<T> findByKw(String kw);
	public T findOne(Long id);
	public T update(T p);
	public void dalete(Long id);
}
