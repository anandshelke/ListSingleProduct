package techm.microservice.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techm.microservice.domain.Product;


@SpringBootApplication
@RestController

public class ListSingleProductApplication {

	@Autowired
	private ProductRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ListSingleProductApplication.class, args);
	}
	
	@RequestMapping(value="/showproduct/{productname}", method=RequestMethod.GET)
	public String ListSingleProduct(@PathVariable String productname)
	{
		Product product; 
		product = repository.findByproductName(productname);
		return product.toString();
		
	}
	
	
	
	
	

	
		
	
}