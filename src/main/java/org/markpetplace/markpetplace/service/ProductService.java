package org.markpetplace.markpetplace.service;

import java.util.List;

import org.markpetplace.markpetplace.model.Product;
import org.markpetplace.markpetplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getById(Long id) {
		return productRepository.getById(id);
	}
	
	public List<Product> getByCategory(String category){
		return productRepository.getByCategory(category);
	}
	
	public List<Product> getByAnimal(String animal){
		return productRepository.getByAnimal(animal);
	}
	
	public void deleteById(Long id) {
		if(productRepository.existsById(id)) {
			productRepository.deleteById(id);
		}else {
			throw new IllegalStateException("The product with the requested id doesn't exist");
		}
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
}
