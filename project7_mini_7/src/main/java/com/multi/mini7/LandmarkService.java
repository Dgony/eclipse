package com.multi.mini7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
	
	public void list(LandmarkVO landmarkVO , Model model) { //start, end
		List<LandmarkVO> list = dao.list(landmarkVO);
		System.out.println(list.size());
		//views의 list1.jsp로 전달 
		model.addAttribute("list", list);
	}
	
}
