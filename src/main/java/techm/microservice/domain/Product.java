package techm.microservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="Product")
public class Product {
	
	@Id
	public String Id; 
	
	public String productName;
	public String productDescription;
	
	public Product() {}
	
	public Product(String name, String description)
	{
		this.productName = name;
		this.productDescription = description;
	}
	
	public String getId()
	{
		return Id;
	}
	
	public void setId(String id)
	{
		this.Id = id;
	}

	public String getName()
	{
		return productName;
	}
	
	public void setName(String name)
	{
		this.productName = name;
	}
	
	public String getDescription()
	{
		return productDescription;
	}

	public void setDescription(String description)
	{
		this.productDescription = description;
	}
	
	@Override
	public String toString()
	{
		return String.format("Product [id=%s, Product Name = '%s', Product Description = '%s']",
								Id, productName, productDescription);
		
	}
	
//	@Override
//	public String toString()
//	{
//		return "Value{" +
//				"productName =" + productName +
//				", productDescription =" + productDescription + "}";
//	}
		
}
