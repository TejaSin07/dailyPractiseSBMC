package in.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.tejas.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
