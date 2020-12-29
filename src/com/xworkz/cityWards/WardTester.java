package com.xworkz.cityWards;

import com.xworkz.cityWards.constant.WardName;
import com.xworkz.cityWards.warddto.WardDTO;
import com.xworkz.cityWards.wards.CityWards;


public class WardTester {

	public static void main(String[] args) {

		CityWards citywards = new CityWards();

		WardDTO wards=new WardDTO(1, WardName.GADAG, "Sahana", 1500, 25000.0);
		citywards.addWardInfo(wards);
		citywards.displayByNameorNumber(WardName.GADAG, 1);
		citywards.displayCityWardInfo();




	}
}
