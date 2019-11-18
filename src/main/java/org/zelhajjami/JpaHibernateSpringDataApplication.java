package org.zelhajjami;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.zelhajjami.dao.EntityRepository;
import org.zelhajjami.entities.Product;

@SpringBootApplication
public class JpaHibernateSpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaHibernateSpringDataApplication.class, args);
		EntityRepository<Product> productDao = context.getBean(EntityRepository.class);
		/*productDao.save(new Product("ABC12",8000,7));
		productDao.save(new Product("ABC13",7840,2));
		productDao.save(new Product("ABC14",21548,9));
		*/
		List<Product> products = productDao.findByKw("%C14%");
		for(Product p:products)
			System.out.println(p.getIdProduct()+"____"+p.getAppelation()+"____"+p.getPrice()+"____"+p.getQuantity());
	}

}
