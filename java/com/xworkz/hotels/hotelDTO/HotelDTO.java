package com.xworkz.hotels.hotelDTO;

import com.xworkz.hotels.constant.Location;

public class HotelDTO {
	private String name;
	private Location location;
	private String ownerName;
	private String type;
	private boolean service;
	private String foodItems[];
	
	public HotelDTO() {

	}

	public HotelDTO(String name, Location location, String ownerName, String type, boolean service, String[] foodItems) {
		super();
		this.name = name;
		this.location = location;
		this.ownerName = ownerName;
		this.type = type;
		this.service = service;
		this.foodItems = foodItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getService() {
		return service;
	}

	public void setService(boolean service) {
		this.service = service;
	}

	public String[] getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(String[] foodItems) {
		this.foodItems = foodItems;
	}

}
