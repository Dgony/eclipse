package com.multi.mvc02;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MemberDTO bag) {
		my.insert("bbs.create", bag);
		return 0;
	}

}
