package in.tejas.service;

import java.util.List;

import in.tejas.entity.Product;

public interface ProductService {

	public boolean saveProduct(Product p);

	public List<Product> getAllProducts();

}
