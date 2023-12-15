package com.multi.mini7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		int count = dao.count(); //전체게시물 수
		int pages = count / 10;
		// views의 landmark_list.jsp에 model로 출력해온 db의 landmark를 list로 전달
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
	}
	
	@RequestMapping("list2")
	public void list2(PageVO pageVO, Model model) { //start, end
		pageVO.setStartEnd();//start, end계산해주는 메서드
		System.out.println(pageVO);
		List<BbsVO> list = dao.list1(pageVO);
		//전체 페이지수 구하기 
		int count = dao.count(); //전체게시물 수 
		System.out.println("전체 게시물수>> " + count);
		int pages = count / 10;
		if(count % 10 != 0) {
			pages = count / 10 + 1;
		}
		//모델로 views까지 페이지수를 넘겨야 페이지수 버튼을 만들 수 있음. 
		System.out.println("페이지당 가지고 온 게시물수>> " + list.size());
		//views의 list1.jsp로 전달 
		model.addAttribute("list", list);
		model.addAttribute("pages", pages);
		model.addAttribute("count", count);
	}
	
}
