package org.zelhajjami.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zelhajjami.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
