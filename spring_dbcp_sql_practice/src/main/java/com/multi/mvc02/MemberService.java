package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 비즈니스 로직을 모아둔 서비스 클래스를 지정하기 위한 어노테이션  
public class MemberService {
	
	@Autowired
	MemberDAO dao;
	
	// DB 데이터 create를 위한 메서드  
	public int insert(MemberDTO bag) {
		return dao.insert(bag); 
	}

}
