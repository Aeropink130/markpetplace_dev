package org.markpetplace.markpetplace.controller;

import java.util.List;

import org.markpetplace.markpetplace.model.Product;
import org.markpetplace.markpetplace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})

public class ProductController {
	
	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping(path = "/byId")
	public ResponseEntity<Product> getProductById(@RequestParam Long id){
		Product product = productService.getById(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	@GetMapping(path = "/byCategory")
	public ResponseEntity<List<Product>> getProductByCategory(@RequestParam String category){
		List<Product> products = productService.getByCategory(category);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping(path = "/byAnimal")
	public ResponseEntity<List<Product>> getProductsByAnimal(@RequestParam String animal){
		List<Product> products = productService.getByAnimal(animal);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteById(@PathVariable("id") Long id) {
		productService.deleteById(id);
	}
	
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
}
