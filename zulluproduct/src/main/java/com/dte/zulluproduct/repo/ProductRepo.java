package com.dte.zulluproduct.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dte.zulluproduct.entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	
	@Query("select p from Product p where p.productId=:productId")
    public List<Product> getAllProductsBasedOnProductId(int productId);

}