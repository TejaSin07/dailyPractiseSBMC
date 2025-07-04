package in.tejas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tejas.entity.Product;
import in.tejas.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean saveProduct(Product p) {
		Product savedProdct = productRepo.save(p);
		return savedProdct.getPid() != null;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

}










