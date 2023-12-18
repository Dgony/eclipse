package com.multi.mini7;

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
	public void list(LandmarkVO landmarkVO , Model model) {
		landmarkService.list(landmarkVO, model); // list 전처리로 모두 가져오기
		
	}
	
	@RequestMapping ("landmark_list2")
	public void list2(PageVO pageVO, Model model) {
		landmarkService.list2(pageVO, model); // list 전처리로 모두 가져오기
		
	}
	
}
