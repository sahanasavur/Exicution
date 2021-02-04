package com.xworkz.student.service;

import com.xworkz.student.dto.JuiceDTO;

public interface JuiceService {
	boolean validateAndSave(JuiceDTO dto);

	boolean validateAndUpdatePriceByName(int price, String name);

	boolean validateAndDeleteByName(String name);
	
	int validateTotalJuiceSize();

}
