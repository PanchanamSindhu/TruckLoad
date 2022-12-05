package com.load.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "truck_load")
public class Load {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loadId")
	private Integer loadId;

	private Integer driverId;

	@DateTimeFormat(style = "yyyy-MM-dd")
	private LocalDate pickUpDate;

	@NotNull
	private String pickUpLocation;

	@DateTimeFormat(style = "yyyy-MM-dd")
	private LocalDate dropDate;

	@NotNull
	private String dropLocation;

	private String itemType;

	private String bookingStatus;

	@DateTimeFormat(style = "yyyy-MM-dd")
	private LocalDate bookingDate;

	public Integer getLoadId() {
		return loadId;
	}

	public void setLoadId(Integer loadId) {
		this.loadId = loadId;
	}

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public LocalDate getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(LocalDate pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public String getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public LocalDate getDropDate() {
		return dropDate;
	}

	public void setDropDate(LocalDate dropDate) {
		this.dropDate = dropDate;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "Load [loadId=" + loadId + ", driverId=" + driverId + ", pickUpDate=" + pickUpDate + ", pickUpLocation="
				+ pickUpLocation + ", dropDate=" + dropDate + ", dropLocation=" + dropLocation + ", itemType="
				+ itemType + ", bookingStatus=" + bookingStatus + ", bookingDate=" + bookingDate + "]";
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Load(Integer loadId, Integer driverId, LocalDate pickUpDate, @NotNull String pickUpLocation,
			LocalDate dropDate, @NotNull String dropLocation, String itemType, String bookingStatus,
			LocalDate bookingDate) {
		super();
		this.loadId = loadId;
		this.driverId = driverId;
		this.pickUpDate = pickUpDate;
		this.pickUpLocation = pickUpLocation;
		this.dropDate = dropDate;
		this.dropLocation = dropLocation;
		this.itemType = itemType;
		this.bookingStatus = bookingStatus;
		this.bookingDate = bookingDate;
	}

}
