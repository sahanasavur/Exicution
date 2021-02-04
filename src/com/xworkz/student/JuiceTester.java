package com.xworkz.student;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.student.dao.JuiceDAO;
import com.xworkz.student.dao.JuiceDAOImpl;
import com.xworkz.student.dto.JuiceDTO;
import com.xworkz.student.service.JuiceService;
import com.xworkz.student.service.JuiceServiceImpl;

public class JuiceTester {

	public static void main(String[] args) {
		List<JuiceDTO> list = new LinkedList<JuiceDTO>();

		JuiceDAO dao = new JuiceDAOImpl(list);

		JuiceService juiceService = new JuiceServiceImpl(dao);

		JuiceDTO dto = new JuiceDTO("SLICE", 30, 250);

		JuiceDTO dto1 = new JuiceDTO("SPRITE", 25, 500);

		JuiceDTO dto2 = new JuiceDTO("COCOCOLA", 50, 750);
		
		JuiceDTO dto3 = new JuiceDTO("DEW", 45, 1000);
		
		dao.save(dto);
		System.out.println(dto);
		System.out.println(" ");
		dao.save(dto1);
		System.out.println(dto1);
		System.out.println(" ");
		dao.save(dto2);
		System.out.println(dto2);
		System.out.println(" ");
		dao.save(dto3);
		System.out.println(dto3);
		System.out.println(" ");
		
		
		boolean updated = dao.updatePriceByName(60,"SPRITE");
		System.out.println("Updated updatePriceByName method" );
		System.out.println(" ");
		
		boolean deleted=dao.deleteByName("COCOCOLA");
		System.out.println("After Deletebyname method");
		System.out.println(" ");
		
		
		
		
		
		
		

	}

}
