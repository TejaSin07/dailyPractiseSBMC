package in.tejas.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.tejas.response.Product;

@Service
public class ProductsService {

	public Product getProduct(String productId) {

		String apiUrl = "https://api.restful-api.dev/objects/" + productId;
		// above method representing url with id 
		RestTemplate rt = new RestTemplate();

		ResponseEntity<Product> resEntity = rt.getForEntity(apiUrl, Product.class);// look for more details
		//RestTemplate will take care of converting json/xml to java object 
		int status = resEntity.getStatusCode().value();

		if (status == 200) {
			return resEntity.getBody();
		}
		return null;
	}

	public void getProducts() {

		String apiUrl = "https://api.restful-api.dev/objects";
		RestTemplate rt = new RestTemplate();

		ResponseEntity<Product[]> resEntity = rt.getForEntity(apiUrl, Product[].class);
		//So you're telling RestTemplate:
			//Hey, you're going to receive a JSON array. Deserialize each item into a Product, 
		//		and give me back a Product[].”
		
		//RestTemplate will take care of converting json/xml to java object 
		int statusCode = resEntity.getStatusCode().value();

		if (statusCode == 200) {
			Product[] products = resEntity.getBody();
			for (Product p : products) {
				System.out.println(p);
			}
		}

	}

}
