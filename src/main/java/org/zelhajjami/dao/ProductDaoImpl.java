package org.zelhajjami.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.zelhajjami.entities.Product;

@Repository //class doit être instancier pas Spring
@Transactional //toutes les methodes sont transactional // delegate transations to spring
public class ProductDaoImpl implements EntityRepository<Product>{

	@PersistenceContext
	private EntityManager em;
	@Override
	public Product save(Product p) {
		em.persist(p);
		return p;
	}

	@Override
	public List<Product> findAll() {
		Query req = em.createQuery("select p from Product p");
		return req.getResultList();
	}

	@Override
	public List<Product> findByKw(String kw) {
		Query req = em.createQuery("select p from Product p where p.appelation like :x");
		req.setParameter("x", kw);
		return req.getResultList();
	}

	@Override
	public Product findOne(Long id) {
		Product p = em.find(Product.class, id);
		return p;
	}

	@Override
	public Product update(Product p) {
		em.merge(p);
		return p;
	}

	@Override
	public void dalete(Long id) {
		Product p = em.find(Product.class, id);
	}

}
