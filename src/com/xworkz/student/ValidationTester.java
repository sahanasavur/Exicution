package com.xworkz.student;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.student.dao.JuiceDAO;
import com.xworkz.student.dao.JuiceDAOImpl;
import com.xworkz.student.dto.JuiceDTO;
import com.xworkz.student.service.JuiceService;
import com.xworkz.student.service.JuiceServiceImpl;

public class ValidationTester {
	public static void main(String[] args) {
		List<JuiceDTO> list = new LinkedList<JuiceDTO>();

		JuiceDAO dao = new JuiceDAOImpl(list);
		JuiceService juiceService = new JuiceServiceImpl(dao);

		JuiceDTO dto = new JuiceDTO("SLICE", 30, 250);

		JuiceDTO dto1 = new JuiceDTO("SPRITE", 25, 500);

		JuiceDTO dto2 = new JuiceDTO("COCOCOLA", 50, 750);

		JuiceDTO dto3 = new JuiceDTO("DEW", 45, 1000);

		juiceService.validateAndSave(dto);
		System.out.println(" ");
		juiceService.validateAndSave(dto1);
		System.out.println(" ");
		juiceService.validateAndSave(dto2);
		System.out.println(" ");
		juiceService.validateAndSave(dto3);
		System.out.println(" ");

		 System.out.println("Total juice Size: " +dao.totalJuiceSize());
		
		boolean updated = juiceService.validateAndUpdatePriceByName(100, "SPRITE");
		System.out.println("Valid Update");
		System.out.println(" ");

		boolean deleted = juiceService.validateAndDeleteByName("SLICE");
		System.out.println("Valid Deletion");
		System.out.println(" ");
		
        System.out.println("Total juice Size: " +dao.totalJuiceSize());

	}
}
