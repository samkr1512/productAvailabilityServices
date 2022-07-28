package com.example.demo.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LocationDetails;
import com.example.demo.repository.LocationDetailsRepository;

@RestController
public class LocationDetailsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductAvailabilityServicesController.class);

	@Autowired
	private LocationDetailsRepository locationDetailsRepository;

	@GetMapping(path = "/locationDetails/{locationId}")
	@ResponseStatus(HttpStatus.OK)
	public List<LocationDetails> getLocationDetails(
			@PathVariable(name = "locationName", required = true) BigInteger locationId) {
		LOGGER.info("Entering getLocationDetails locationId={}", locationId);
		return locationDetailsRepository.findLocationDetailsById(locationId);

	}

	@GetMapping(path = "/locationDetailsLocal/{locationId}")
	@ResponseStatus(HttpStatus.OK)
	public List<LocationDetails> getLocationDetailsLocal(
			@PathVariable(name = "locationId", required = true) String locationId) {
		LOGGER.info("Entering locationDetailsLocal locationId={}", locationId);

		return setLocationDetails();

	}

	@PostMapping(path = "/locationDetails")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertLocationDetails(@RequestBody LocationDetails locationDetails) {
		LOGGER.debug("Entering insertLocationDetails LocationDetails={}", locationDetails);

		locationDetailsRepository.save(locationDetails);

		LOGGER.debug("Exiting insertLocationDetails");

	}

	@PutMapping(path = "/locationDetails")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateLocationDetails(@RequestBody LocationDetails locationDetails) {
		LOGGER.debug("Entering updateLocationDetails locationDetails={}", locationDetails);

		locationDetailsRepository.save(locationDetails);

		LOGGER.debug("Exiting updateLocationDetails");
	}

	@DeleteMapping(path = "/locationDetails/{locationId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteLocationDetails(@PathVariable(name = "locationId", required = true) BigInteger locationId) {
		LOGGER.debug("Entering deleteLocationDetails locationId={}", locationId);

		locationDetailsRepository.deleteById(locationId);

		LOGGER.debug("Exiting deleteLocationDetails");
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public List<LocationDetails> setLocationDetails() {

		LocationDetails location = new LocationDetails();
		List<LocationDetails> locations = new ArrayList<>();

		location.setLocationId(BigInteger.valueOf(2));
		location.setLocationName("Test");
		location.setAddressLine1("123 Test");
		location.setCity("Shawnee");
		location.setState("KS");
		location.setZip("66221");

		locations.add(location);

		return locations;

	}

}
