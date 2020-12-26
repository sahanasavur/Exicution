package com.xworkz.cityWards;

import com.xworkz.cityWards.ward.WardDTO;

public class CityWards {
	private int wardnumber;
	private String wardname;
	private String corporatorname;
	private long population;
	private double area;
	WardDTO[] wards = new WardDTO[2];

	public CityWards() {
		super();
	}

	public CityWards(int wardnumber, String wardname, long population) {
		super();
		this.wardnumber = wardnumber;
		this.wardname = wardname;
		this.population = population;
	}

	public void addWardInfo(int wardnumber, String wardname, long population) {
		if (wardnumber != 0 && wardname != null && population < 5000) {

			System.out.println("Data Can be Added");
		} else {
			System.out.println("Data Can not be Added");
		}

	}

	public void displayCityWardInfo() {
		for (int i = 0; i < this.wards.length; i++) {
			WardDTO wdto = wards[i];
			System.out.println(wdto.getCorporatorname());
			System.out.println(wdto.getWardname());
			System.out.println(wdto.getWardnumber());
			System.out.println(wdto.getPopulation());
			System.out.println(wdto.getArea());
		}

	}

	public int getWardnumber() {
		return wardnumber;
	}

	public void setWardnumber(int wardnumber) {
		this.wardnumber = wardnumber;
	}

	public String getWardname() {
		return wardname;
	}

	public void setWardname(String wardname) {
		this.wardname = wardname;
	}

	public String getCorporatorname() {
		return corporatorname;
	}

	public void setCorporatorname(String corporatorname) {
		this.corporatorname = corporatorname;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
