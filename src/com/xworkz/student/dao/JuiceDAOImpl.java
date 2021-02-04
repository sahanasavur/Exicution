package com.xworkz.student.dao;

import java.util.Iterator;
import java.util.List;
import com.xworkz.student.dto.JuiceDTO;

public class JuiceDAOImpl implements JuiceDAO {

	List<JuiceDTO> juicelist;

	public JuiceDAOImpl(List<JuiceDTO> juiceDTOs) {
		System.out.println("invoked ResortDAOImpl");
		this.juicelist = juiceDTOs;
	}

	@Override
	public boolean save(JuiceDTO dto) {
		boolean added = false;
		if (!this.juicelist.contains(dto)) {
			added = this.juicelist.add(dto);
		}
		if (added) {
			System.out.println("DTO is added");
			added = true;
		} else {
			System.out.println("DTO is not added");
			added = false;
		}
		return false;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {
		System.out.println("Invoked update Price by Name");
		for (JuiceDTO juiceDTO : juicelist) {
			String juiceName = juiceDTO.getName();
			if (juiceName != null && juiceName.equals(name)) {
				System.out.println("juice name found ");
				juiceDTO.setPrice(price);
				System.out.println("updated price " + juiceDTO);
				return true;
			} else {
				System.out.println("Juice not found");
			}
		}
		System.out.println("no elements in list");
		return false;

	}

	@Override
	public boolean deleteByName(String name) {
		System.out.println("Invoked Delete by Name Method");
		Iterator<JuiceDTO> iterator = this.juicelist.iterator();
		while (iterator.hasNext()) {
			JuiceDTO dto = iterator.next();
			if (dto.getName().equals(name)) {
				System.out.println("name  found can delete");
				iterator.remove();
				System.out.println("name deleted " + dto);
				return true;
			} else {
				System.out.println("name not matched");
			}
		}
		return false;
	}

	@Override
	public int totalJuiceSize() {
		return this.juicelist.size();
	}

}
