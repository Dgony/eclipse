<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies) {
	out.print(c.getName() + ", " + c.getValue() + "<br>");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키의 갯수 : <%= cookies.length %> <!-- 프린트용으로 사용하는 자바스크립트릿 표현식 -->
</body>
</html>