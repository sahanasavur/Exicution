package com.xworkz.hotels.hotel;

import java.util.Arrays;

import com.xworkz.hotels.constant.Location;
import com.xworkz.hotels.hotelDTO.HotelDTO;

public class Hotel {

	HotelDTO[] hotels = new HotelDTO[5];
	private int currentIndex = 0;

	public Hotel() {

	}

	public void addHotel(HotelDTO dto) {
		if (dto != null && this.currentIndex < 5) {
			System.out.println("Accepting information");
			System.out.println("index value: " + this.currentIndex);
			this.hotels[currentIndex] = dto;
			this.currentIndex++;
		} else {
			if (dto == null) {
				System.out.println("Invalid Data ,Enter Properly");
			}
			if (dto != null) {
				System.out.println("cannot add more hotel " + this.currentIndex);
			}
			System.out.println("Current Index: " + this.currentIndex);
		}
	}

	public void displayHotelDetails() {
		for (int j = 0; j < hotels.length; j++) {
			HotelDTO dto = hotels[j];
			if (dto != null) {
				System.out.println(dto.getName());
				System.out.println(dto.getOwnerName());
				System.out.println(dto.getLocation());
				System.out.println(dto.getService());
				System.out.println(dto.getType());
				System.out.println(Arrays.toString(dto.getFoodItems()));
				break;
			}
		}
	}

	public void displayByNameAndLocation(String name, Location location) {
		if (name != null && location != null) {
			System.out.println("Display by name and location");
			boolean start = false;
			for (int i = 0; i < this.hotels.length; i++) {
				HotelDTO ref = this.hotels[i];
				if (ref != null) {
					String localstart = ref.getName();
					Location locallocation = ref.getLocation();
					if (name.equals(localstart) && location.equals(locallocation)) {
						start = true;
						System.out.println("Hotel name is : " + ref.getName());
						System.out.println("Location is : "+ref.getLocation());
						break;
					}
				}
			}
			if (start == false) {
				System.out.println("Hotel not Found");
			}

		}
	}

	// method to return owner name by hotel name

	public void returnOwner(String ownerName) {
		if (ownerName != null) {
			boolean start = false;
			for (int i = 0; i < this.hotels.length; i++) {
				if (this.hotels[i] != null) {
					System.out.println("Displaying owner name");
					HotelDTO refOfStart = this.hotels[i];
					refOfStart.setOwnerName("SAHANA");
					String localOwnerName = refOfStart.getOwnerName();
					if (ownerName.equals(localOwnerName)) {
						System.out.println("Owner Name is : " + refOfStart.getOwnerName());
						break;
					}
				}
			}
			if (start == false) {
				System.out.println("Owner not found");
			}
		}
	}
}