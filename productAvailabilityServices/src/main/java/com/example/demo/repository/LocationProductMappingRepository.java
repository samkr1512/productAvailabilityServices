package com.example.demo.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.LocationProductMapping;

public interface LocationProductMappingRepository extends CrudRepository<LocationProductMapping, BigInteger> {

	// List<LocationProductMapping> findLocationProductMappingById(BigInteger
	// locationId);

	@Query("select lpm from LocationProductMapping lpm where (location_id = :locationId)")
	List<LocationProductMapping> findLocationProductMappingById(@Param("locationId") BigInteger locationId);
}
