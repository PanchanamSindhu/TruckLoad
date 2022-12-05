package com.user.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Load {

	private Integer loadId;
	private Integer driverId;
	private LocalDate pickUpDate;
	private String pickUpLocation;
	private LocalDate dropDate;
	private String dropLocation;
	private String itemType;
	private String bookingStatus;
	private LocalDate bookingDate;

}
