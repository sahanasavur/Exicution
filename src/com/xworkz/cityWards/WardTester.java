package com.xworkz.cityWards;

import com.xworkz.cityWards.constant.WardName;
import com.xworkz.cityWards.ward.WardDTO;

public class WardTester {

	public static void main(String[] args) {

		CityWards citywards = new CityWards();

		WardDTO wards = new WardDTO(001, "Abhishek", 4500, 2500.0);
		System.out.println(wards);

		WardDTO wards1 = new WardDTO(002, "Sandesh", 250, 15000.0);
		System.out.println(wards1);

		WardDTO wards2 = new WardDTO(003, "Sahana", 4200, 4522.0);
		System.out.println(wards2);

	}
}
