package org.zelhajjami;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.zelhajjami.dao.springdata.CategoryRepository;
//import org.zelhajjami.dao.EntityRepository;
import org.zelhajjami.dao.springdata.ProductRepository;
import org.zelhajjami.entities.Category;
import org.zelhajjami.entities.Product;

@SpringBootApplication
public class JpaHibernateSpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaHibernateSpringDataApplication.class, args);
		
		ProductRepository productDao = context.getBean(ProductRepository.class);
		CategoryRepository catDao = context.getBean(CategoryRepository.class);
		
		Category c1 = new Category("Computer");
		Category c2 = new Category("Printer");
		Category c3 = new Category("Smarphone");
		
		catDao.save(c1);
		catDao.save(c2);
		catDao.save(c3);
		
		productDao.save(new Product("IBM", 2500, 22, c1));
		productDao.save(new Product("Acer", 5200, 35, c2));
		productDao.save(new Product("Canon", 1300, 14, c2));
		
		List<Product> products = productDao.findAll();
		for(Product p:products)
			System.out.println(p.getIdProduct()+"____"+p.getAppelation()+"____"+p.getPrice()+"____"+p.getQuantity());
	}

}