package com.multi.mini7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandmarkService {
	
	@Autowired
	LandmarkDAO dao;
	
	public String insert(LandmarkVO landmarkVO) {
		int result = dao.insert(landmarkVO);
		if(result == 1) {
			return "landmark_insert";
		}else {
			return "landmark_insert.jsp";
		}
	}
	
}
