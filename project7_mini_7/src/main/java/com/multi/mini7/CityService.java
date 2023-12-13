package com.multi.mini7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CityService {

	@Autowired
	CityDAO dao;
	
	public String insert(CityVO cityVO) {
		int result = dao.insert(cityVO);
		if(result == 1) {
			return "city_insert";
		}else {
			return "city_insert.jsp";
		}
	}
	
	public void list(CityVO cityVO , Model model) { //start, end
		List<CityVO> list = dao.list(cityVO);
		System.out.println(list.size());
		//views의 list1.jsp로 전달 
		model.addAttribute("list", list);
	}
	
}
