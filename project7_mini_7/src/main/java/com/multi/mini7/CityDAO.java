package com.multi.mini7;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CityDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public int insert (CityVO cityVO) {
		return my.insert("city.insert", cityVO);
	}
	
	public List<CityVO> list (CityVO cityVO) {
		return my.selectList("city.list", cityVO);
	}
	
}
