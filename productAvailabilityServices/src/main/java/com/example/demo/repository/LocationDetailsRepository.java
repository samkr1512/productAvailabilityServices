package com.example.demo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.LocationDetails;
import com.example.demo.model.ProductDetails;

public interface LocationDetailsRepository extends CrudRepository<LocationDetails, BigInteger> {

	// List<LocationDetails> findLocationDetailsById(BigInteger locationId);

	@Query("select ld from LocationDetails ld where (location_id = :locationId)")
	List<LocationDetails> findLocationDetailsById(@Param("locationId") BigInteger locationId);

	void deleteById(BigInteger locationId);

}
