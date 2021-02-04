package com.xworkz.student.service;

import com.xworkz.student.dao.JuiceDAO;
import com.xworkz.student.dto.JuiceDTO;

public class JuiceServiceImpl implements JuiceService {
	private JuiceDAO juiceDao;

	public JuiceServiceImpl(JuiceDAO dao) {
		this.juiceDao = dao;
	}

	@Override
	public boolean validateAndSave(JuiceDTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null,can save fields");
			String name = dto.getName();
			if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
				validData = true;
			} else {
				System.out.println("name is invalid");
				validData = false;
			}
		}
		if (validData) {
			int price = dto.getPrice();
			if (price >= 10 && price <= 1000) {
				System.out.println("price is valid");
				validData = true;
			} else {
				System.out.println("price is invalid");
				validData = false;
			}
		}
		if (validData) {
			int quantity = dto.getQuantity();
			if (quantity >= 250 && quantity <= 1000) {
				System.out.println("Quantity is valid");
				validData = true;
			} else {
				System.out.println("Quantity is invalid");
				validData = false;
			}
		}
		if (validData) {
			System.out.println("All data is valid");
			this.juiceDao.save(dto);
			validData = true;
		} else
			System.out.println("dto is null can not save fields");

		return false;
	}

	@Override
	public boolean validateAndUpdatePriceByName(int price, String name) {
		System.out.println("invoked validateAndUpdatePriceByName");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")
				&& price != 0 && price <= 1000) {
			this.juiceDao.updatePriceByName(price, name);
			System.out.println("Name is valid can update Price");
			return true;
		} else {
			System.out.println("Name is not valid");
		}
		return false;
	}

	@Override
	public boolean validateAndDeleteByName(String name) {
		System.out.println("Invoked validateAndDeleteByName");
		if (name != null && name.length() >= 3 && name.length() <= 15 && !name.isEmpty() && !name.contains(" ")) {
			this.juiceDao.deleteByName(name);
			System.out.println("Name is valid can update");
			return true;
		} else {
			System.out.println("Name is invalid");
		}
		return false;
	}

	@Override
	public int validateTotalJuiceSize() {
		return this.juiceDao.totalJuiceSize();
	}

}
