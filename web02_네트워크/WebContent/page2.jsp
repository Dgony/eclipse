<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie[] cookies = request.getCookies();
    
    String name = "";
    String value = "";
    for(Cookie c : cookies) {
    	out.print(c.getName() + " " + c.getValue() + "<br>");
    	name = c.getName();
    	value = c.getValue();
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠큭 쿠키 프린트하기<br>
쿠키의 갯수 <%= cookies.length %><br>
쿠키의 이름 <%= name %><br>
쿠키의 값 <%= value %><br>
</body>
</html>