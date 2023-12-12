package com.multi.mini7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandmarkController {

	@Autowired
	LandmarkService landmarkService;
	
	@RequestMapping ("landmark_insert")
	public void insert(LandmarkVO landmarkVO) {
		landmarkService.insert(landmarkVO);
	}
	
	
}
