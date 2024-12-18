package com.multi.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO dao;
	
	public void insert(MemberDTO bag) {
		dao.insert(bag);
	}

}
