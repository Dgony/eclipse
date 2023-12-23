<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    // API 호출 주소 설정
    String apiUrl = "http://apis.data.go.kr/B551011/KorService1/areaBasedList1";
    // API 키
    String apiKey = "YOUR_API_KEY"; // 실제 API 키로 대체

    // API 호출을 위한 URL 생성
    String urlString = apiUrl + "?ServiceKey=" + apiKey + "&parameter1=value1&parameter2=value2";

    try {
        // URL 연결 설정
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // 응답 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            response.append(line);
        }
        br.close();

        // 응답 출력
        out.println("API Response:<br>");
        out.println(response.toString());

        // 연결 해제
        conn.disconnect();
    } catch (Exception e) {
        e.printStackTrace();
        out.println("Error: " + e.getMessage());
    }
%>
</body>
</html>