<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie c1 = new Cookie("exercise", "soccer"); // 이름 + 값
    Cookie c2 = new Cookie("filed", "football"); // 이름 + 값
    response.addCookie(c1);
    response.addCookie(c2);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키 생성 완료 쿠키킥
<a href = "page2.jsp">쿠키킥 보러 가기</a>
</body>
</html>