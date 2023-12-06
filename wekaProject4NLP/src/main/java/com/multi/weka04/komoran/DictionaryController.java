package com.multi.weka04.komoran;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DictionaryController {
	
	@Autowired
	DictionaryService service;
	
	@Autowired
	DictionaryService dictionaryService;

	@RequestMapping("emotion")
	public void one(String sentence, Model model) {
		// 문장에 들어있는 명사만을 추출해서 
		service.emotion(sentence);
		// ==> db에 넣기 전 전처리, db에서 검색한 후 후처리
		// 컨트롤러 --> 전처리 / 후처리(service) ==> dao
		// 
		System.out.println("emotion컨트롤러 >> " + sentence);
		
		String result = dictionaryService.emotion(sentence);
		model.addAttribute("result", result);
	}
}
