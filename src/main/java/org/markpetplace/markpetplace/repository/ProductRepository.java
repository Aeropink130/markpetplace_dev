package org.markpetplace.markpetplace.repository;

import java.util.List;

import org.markpetplace.markpetplace.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query("SELECT u FROM Product u WHERE u.id=?1")
	Product getById(Long id);
	
	@Query("SELECT u FROM Product u WHERE u.categoria=?1")
	List<Product> getByCategory(String category);
	
	@Query("SELECT u FROM Product u WHERE u.animal=?1")
	List<Product> getByAnimal(String animal);
}
