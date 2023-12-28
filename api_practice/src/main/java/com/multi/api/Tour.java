package com.multi.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Tour {
    public static void main(String[] args) {
	
    	// 인증키 (개인이 받아와야함)
    	String key = "";

    	// 파싱한 데이터를 저장할 변수
    	String result = "json1";

    	try {

    		URL url = new URL("apis.data.go.kr/B551011/KorService1"
    				+ key + "&movieCd=20124039");

    		BufferedReader bf;

    		bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

    		result = bf.readLine();

        	JSONParser jsonParser = new JSONParser();
        	JSONObject jsonObject = (JSONObject)jsonParser.parse(result);


    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}