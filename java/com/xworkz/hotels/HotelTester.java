package com.xworkz.hotels;

import com.xworkz.hotels.constant.Location;
import com.xworkz.hotels.hotel.Hotel;
import com.xworkz.hotels.hotelDTO.HotelDTO;

public class HotelTester {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();

		String foodItems[] = new String[10];
		foodItems[0] = "pani puri";
		foodItems[1] = "kaaju barfi";
		foodItems[2] = "pizza";
		foodItems[3] = "Burger";
		foodItems[4] = "sandwich";
		foodItems[5] = "Dosa";
		foodItems[6] = "Fried Rice";
		foodItems[7] = "Gobi";
		foodItems[8] = "Baji";
		foodItems[9] = "Samosa";

		HotelDTO dto = new HotelDTO("Udupi Grand", Location.JPNAGAR, "Ganesh", "AC", true, foodItems);
		System.out.println("Details of Hotel 1 ");
		hotel.addHotel(dto);;
		hotel.displayHotelDetails();
		System.out.println(" ");

		HotelDTO dto1 = new HotelDTO("Grand", Location.RAJAJINAGAR, "Ravi", "Non AC", true, foodItems);
		System.out.println("Details of Hotel 2 ");
		hotel.addHotel(dto1);
		hotel.displayHotelDetails();
		System.out.println(" ");
		
		hotel.displayByNameAndLocation("Grand", Location.RAJAJINAGAR);
		
		hotel.returnOwner("SAHANA");;
		

	}

}
