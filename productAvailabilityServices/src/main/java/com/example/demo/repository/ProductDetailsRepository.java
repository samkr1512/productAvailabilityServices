package com.example.demo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ProductDetails;

public interface ProductDetailsRepository extends CrudRepository<ProductDetails, BigInteger> {

	@Query("select pd from ProductDetails pd where (product_name = :productName)")
	List<ProductDetails> findProductDetailsByName(@Param("productName") String productName);

	@Query("select pd from ProductDetails pd where (product_id = :productId)")
	List<ProductDetails> findProductDetailsById(@Param("productId") BigInteger productId);

	@Query("select pd from ProductDetails pd where (product_availability = :value)")
	List<ProductDetails> findProductsOnline(@Param("value") Boolean value);

	void deleteById(BigInteger productid);

}
