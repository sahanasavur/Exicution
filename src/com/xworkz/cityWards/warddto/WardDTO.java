package com.xworkz.cityWards.warddto;

import com.xworkz.cityWards.constant.WardName;

public class WardDTO {

	private int wardnumber;
	private WardName wardname;
	private String corporatorname;
	private int population;
	private double area;

	public WardDTO(int wardnumber, WardName wardname, String corporatorname, int population, double area) {
		super();
		this.wardnumber = wardnumber;
		this.wardname = wardname;
		this.corporatorname = corporatorname;
		this.population = population;
		this.area = area;
	}

	public int getWardnumber() {
		return wardnumber;
	}

	public void setWardnumber(int wardnumber) {
		this.wardnumber = wardnumber;
	}

	public WardName getWardname() {
		return wardname;
	}

	public void setWardname(WardName wardname) {
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

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
