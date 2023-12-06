package com.multi.weka04.komoran;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;

@Service // controller -- service(전처리 / 후처리) -- dao
public interface DictionaryService {
	
	public void emotion (String sentence) {
		// komoran 이용해서 명사만 추출 후 프린트
		Komoran komoran = new Komoran(DEFAULT_MODEL.FULL);
		KomoranResult result = komoran.analyze(setence);
		List<String> list = result.getNouns();
		System.out.println(listm);
	}
	
}
