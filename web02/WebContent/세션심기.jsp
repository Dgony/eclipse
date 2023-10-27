<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.setAttribute("name", "hong");
    session.setAttribute("age", 100);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션에 집어넣었음<br>
<a href="세션보기.jsp">집어넣은 세션 보러가기</a>
</body>
</html>