package com.xworkz.cityWards.wards;

import com.xworkz.cityWards.constant.WardName;
import com.xworkz.cityWards.warddto.WardDTO;

public class CityWards {

	private WardDTO[] wards = new WardDTO[5];
	private int currentIndex;

	public CityWards() {

	}

	public void addWardInfo(WardDTO dto) {
		if (dto != null && this.currentIndex < 5)
			if (dto.getWardnumber() != 0 && dto.getWardname() != null && dto.getPopulation() < 5000) {
				System.out.println("Data Can be Added");
				System.out.println("current index is : " + this.currentIndex);
				wards[this.currentIndex] = dto;
				this.currentIndex++;
			} else {
				System.out.println("Data Can not be Added");
			}

	}

	public void displayCityWardInfo() {
		for (int i = 0; i < this.wards.length; i++) {
			if (this.wards[i] != null) {
				System.out.println("Invoked Display CityWardInfo");
				WardDTO wdto = this.wards[i];
				System.out.println("Corporator Name : "+wdto.getCorporatorname());
				System.out.println("Wardname is : "+wdto.getWardname());
				System.out.println("Ward Number is : "+wdto.getWardnumber());
				System.out.println("Ward Population is : "+wdto.getPopulation());
				System.out.println("Ward Area is : "+wdto.getArea());
				System.out.println(" ");
			}
		}
	}

	public void displayByNameorNumber(WardName name, int wardNumber) {
		if (name != null || wardNumber > 0) {
			boolean start = false;
			for (int j = 0; j < wards.length; j++) {
				if (this.wards[j] != null) {
					WardDTO ref = this.wards[j];
					WardName local = ref.getWardname();
					int number = ref.getWardnumber();
					if (name.equals(local) || wardNumber == number) {
						System.out.println("Invoked Display By Name or Number");
						start = true;
						System.out.println("Ward name is : " + ref.getWardname());
						System.out.println("Ward number is : " +ref.getWardnumber());
						System.out.println("Corporator Name is : "+ref.getCorporatorname());
                        System.out.println(" ");
					}
				}
			}
			if (start == false) {
				System.out.println("Ward not found");
			}
		}
	}

}
