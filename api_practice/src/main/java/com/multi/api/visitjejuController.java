package com.multi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 싱글톤 + 컨트롤러 등록
public class visitjejuController {
	
	@Autowired
	visitjeju jeju;
	
	@RequestMapping("visitjeju")
	public void one(String ko, Model model) throws Exception {
		StringBuilder json = jeju.jeju(ko);
		
		model.addAttribute("json", json);
	}

}
