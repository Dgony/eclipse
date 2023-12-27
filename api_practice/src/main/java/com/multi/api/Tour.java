package com.multi.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class Tour {
    public static void main(String[] args) {
        try {
            // API Key
            String apiKey = "gRjisabrZIfabIjre8qnZIy4ig724PgKzbxWE5KdbOHL4SD%2FneKsnNw2phKHIowgD5NXuBRaTpMEvSAY2uTA1Q%3D%3D"; // 본인의 API Key로 교체

            // API 요청을 위한 URL
            String apiUrl = "http://apis.data.go.kr/B551011/KorService1/areaBasedList1";

            // 파라미터 설정
            String parameters = "parameter=value&key=" + apiKey;
            apiUrl = apiUrl + "?" + parameters;

            // API에 연결
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // 연결 설정
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            // 응답 코드 확인
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                // API에서 받아온 데이터 읽기
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // JSON 데이터 파싱
                JSONObject jsonData = new JSONObject(response.toString());

                // 데이터 출력
                System.out.println(jsonData.toString(2)); // 두 번째 매개변수는 들여쓰기 수입니다.
            } else {
                // 오류 처리
                System.out.println("Failed to fetch data. Response Code: " + responseCode);
            }
        } catch (Exception e) {
            // 예외 처리
            e.printStackTrace();
        }
    }
}