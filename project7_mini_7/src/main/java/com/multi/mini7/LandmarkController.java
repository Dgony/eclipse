package com.multi.mini7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandmarkController {

	@Autowired
	LandmarkService landmarkService;
	
	@RequestMapping ("landmark_insert")
	public void insert(LandmarkVO landmarkVO) {
		landmarkService.insert(landmarkVO);
	}
	
	@RequestMapping ("landmark_list")
	public void list(String city , Model model) {
		landmarkService.list(city, model);
		
	}
	
	@RequestMapping ("landmark_list2")
	public void list2(String city , Model model) {
		landmarkService.list(city, model); // list 전처리로 모두 가져오기
		model.addAttribute("city", city); // 조건에 맞는 row만 출력하기 위한 값 전달
		
	}
	
}
