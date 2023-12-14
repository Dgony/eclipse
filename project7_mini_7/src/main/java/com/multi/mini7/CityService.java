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
		int result = dao.insert(cityVO); // dao.insert의 return값을 이용
		if(result == 1) {
			return "city_insert"; // insert 성공시 views에서 완료페이지 찾기
		}else {
			return "city_insert.jsp"; // insert 실패시 입력페이지로 돌아가기
		} 
	}
	
	public void list(CityVO cityVO , Model model) { 
		List<CityVO> list = dao.list(cityVO);
		System.out.println(list.size());
		//views의 city_list.jsp에 model로 출력해온 db의 state_city를 list로 전달 
		model.addAttribute("list", list);
	}
	
}
