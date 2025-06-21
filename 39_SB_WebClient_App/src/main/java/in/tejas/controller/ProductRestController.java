package in.tejas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tejas.binding.Product;
import in.tejas.service.ProductService;
import reactor.core.publisher.Mono;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService service;

	@GetMapping("/product")
	public ResponseEntity<Mono<Product>> getProduct() {
		
		Mono<Product> productData = service.getProductNew();
		
		return new ResponseEntity<>(productData, HttpStatus.OK);
	}
	
	
	@GetMapping("/productk")
	public ResponseEntity<Mono<String>>getProductk() {
		
		Mono<String> productData = service.getProduct();
		
		return new ResponseEntity<>(productData, HttpStatus.OK);
	}
}






