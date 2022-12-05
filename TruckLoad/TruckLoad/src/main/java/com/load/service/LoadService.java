package com.load.service;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.load.entity.Load;

public interface LoadService {
	
	Load saveLoad(@Valid Load load);

	List<Load> getAllLoad();

	List<Load> getLoadNotBooked();

	List<Load> searchLoads(String pickUpDate, String pickUpLocation, String dropDate, String dropLocation, String itemType) throws ParseException;

	ResponseEntity<?> bookLoad(Integer loadId, Integer driverId);

	List<Load> searchDriverLoads(String pickUpDate, String pickUpLocation, String dropDate, String dropLocation,
			String itemType) throws ParseException;

	ResponseEntity<?> cancelLoad(Integer loadId);

}
