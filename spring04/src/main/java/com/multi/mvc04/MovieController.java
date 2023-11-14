package com.multi.mvc04;

import java.util.List;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;
	
	//요청하나당 함수하나!!!
	@RequestMapping("movieinsert")
	public String insert(MovieDTO dto) {
		int result = dao.insert(dto);
		if(result == 1) {
			return "movieinsert";
		}else {
			return "redirect:movieindex.jsp";
		}
	}
	
	@RequestMapping("movieupdate")
	public String update(MovieDTO dto) {
		int result = dao.update(dto);
		if(result == 1) {
			return "update";
		}else {
			return "redirect:movieindex.jsp";
		}
	}
	
	@RequestMapping("movieone") //one?id=4
	public void one(String id, Model model) {
		MovieDTO dto = dao.one(id);
		//views/one.jsp로 dto를 보내서 출력해야한다. 
		//model이라고 하는 객체가 필요!
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("movielist")
	public void movielist(Model model) {
		List<MovieDTO> list = dao.list();
		//views/one.jsp로 dto를 보내서 출력해야한다. 
		//model이라고 하는 객체가 필요!
		model.addAttribute("list", list);
	}
	
}
