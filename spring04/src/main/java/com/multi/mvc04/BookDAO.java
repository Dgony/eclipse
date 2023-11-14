package com.multi.mvc04;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert(BookDTO dto) {
		return my.insert("book.create", dto);
	}
	
	public int update(BookDTO dto) {
		return my.update("book.update", dto);
	}
	
	public BookDTO one(String id) {
		return my.selectOne("book.one", id);
	}
	
	public List<BookDTO> list() {
		return my.selectList("book.list");
	}
	
}
