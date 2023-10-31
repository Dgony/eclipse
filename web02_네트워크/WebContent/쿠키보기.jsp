<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 브라우저에 심어놓은 쿠키들은 한꺼번에 다 가지고 온다.
    // 브라우저 --> 서버, request
    Cookie[] cookies = request.getCookies(); // cookie[]
    // {cookie1, cookie2, cookie3} 요롷게 저장됨
    
    String name = ""; // ==> servlet으로 변환될 때 service() 메서드 안으로 코드가 전부 들어가서 생성
    // 그래서 지금 위치가 전역변수처럼 보이지만 나중에 지역변수로 바뀌는 거임. 초기화 해줘야함
    String value = "";
    for(Cookie c : cookies) {
    	out. print(c.getName() + " " + c.getValue() + "<br>");    	
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키의 개수 <%= cookies.length %><br>
쿠키의 이름 <%= name %><br>
쿠키의 값 <%= value %><br>
</body>
</html>