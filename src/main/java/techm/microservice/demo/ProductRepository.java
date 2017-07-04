package techm.microservice.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import techm.microservice.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

	public Product findByproductName(String productName);

}
