package com.xworkz.student.dao;

import com.xworkz.student.dto.JuiceDTO;

public interface JuiceDAO {
	boolean save(JuiceDTO dto);

	boolean updatePriceByName(int price, String name);

	boolean deleteByName(String name);
	
	int totalJuiceSize();

}
