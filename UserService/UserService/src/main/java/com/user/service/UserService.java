package com.user.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.user.entity.Load;
import com.user.entity.User;

public interface UserService {
	
	 User registerUser(User u);
	 
	 Load saveLoad(@Valid Load load);

	List<Load> getAllLoad(int userId);

	List<Load> searchLoads(String pickUpDate, String pickUpLocation, String dropDate, String dropLocation, String itemType,int userId);

	ResponseEntity<?> bookLoad(Integer loadId, Integer driverId);

	ResponseEntity<?> cancelLoad(Integer loadId);

}
