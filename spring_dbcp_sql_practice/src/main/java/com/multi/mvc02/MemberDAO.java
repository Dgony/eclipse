package com.multi.mvc02;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // spring 컨테이가 관리하며 AOP의 역할을 할 수 있는 DAO로 지정하기 위함  
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	// 이 객체를 통해 MyBatis에서 sql문 실행하면
	// 3단게 (Statement 생성) 및 4단계(SQL 실행) 간접적으로 처리   
	
	public int insert(MemberDTO bag) {
		System.out.println(bag.getPw());
		return my.insert("member.create", bag); 
		// .insert 메서드의 sql문을 모아둔 xml의 id를 지정하는 String, DTO 매개변수들
	}

}
