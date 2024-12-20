package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 어노테이션을 통해 스프링 컨테이너가 인식, 요청 응답만을 처리하는 컨트롤러 클래스
public class MemberController {
	
	@Autowired   
	MemberService service;  
	// 필요한 곳에 자동으로 의존성 주입을 하기 위한 어노테이션
	// 비즈니스 로직을 모아놓은 서비스 클래스
	
	@RequestMapping("insert") // "insert"라는 요청과 연결되는 비즈니스 로직ㅡ 어노테이션을 통해 스프링 컨테이너가 인식, 요청 응답만을 처리하는 컨트롤러 클래스  
	public String insert(MemberDTO bag) {
		int result = service.insert(bag); 
		System.out.println("컨트롤러 가동 완료");
		
		if(result == 1) { // 응답여부에 따라 다른 view solver의 응답 설정 
			return "insertOK";
		}else {
			return "redirect:insertNO";
		}
	}
	
	// view를 찾아가는 방식   
	// 1. @RequestMapping은 요청 URL일 뿐만 아니라 반환될 view 이름이기도 함, 
	//    이 경우 view resolver가 자동으로 찾아줌  
	// 2. 클래스를 String 반환형으로 직접 명시하는 경우  


}
