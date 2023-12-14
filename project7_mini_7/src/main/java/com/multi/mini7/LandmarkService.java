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
	
	public void list(String city , Model model) { 
		List<LandmarkVO> list = dao.list(city);
		System.out.println(list.size());
		//views의 landmark_list.jsp에 model로 출력해온 db의 landmark를 list로 전달 
		model.addAttribute("list", list);
	}
	
	public void list2(String city , Model model) { 
		List<LandmarkVO> list = dao.list2(city);
		System.out.println(list.size());
		//views의 landmark_list.jsp에 model로 출력해온 db의 landmark를 list로 전달
		model.addAttribute("list", list);
	}
	
}
