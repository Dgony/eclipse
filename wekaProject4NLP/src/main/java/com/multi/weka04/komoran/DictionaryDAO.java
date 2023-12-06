package com.multi.weka04.komoran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryDAO {
	
	@Autowired
	MongoTemplate mongo;
	
	public void one(String word); {
		Query query = new Query(new Criteria("word").is(word));
		mongo.findOne(query, DictionaryVO.class, "dictionary");
	}

}