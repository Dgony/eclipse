package com.multi.mini7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityController {
	
	@Autowired
	CityService cityService;

	@RequestMapping ("city_insert") 
	public void insert(CityVO cityVO) {
		cityService.insert(cityVO); // cityService로 insert 전처리
	}
	
	@RequestMapping("city_list")
	public void list(CityVO cityVO , Model model) {
		cityService.list(cityVO, model); // cityService로 list 전처리
	}
	
}
