package com.multi.mini7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandmarkController {

	@Autowired
	LandmarkDAO dao;
	
	@RequestMapping ("landmark_insert")
	public String insert(LandmarkVO landmarkVO) {
		dao.insert(landmarkVO);
		return "landmark_insert";
	}
	
	
}
