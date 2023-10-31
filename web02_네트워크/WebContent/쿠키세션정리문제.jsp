<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie c1 = new Cookie("apple", "1000");
    Cookie c2 = new Cookie("melong", "2000");
    Cookie c3 = new Cookie("ice", "3000");
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
    
    session.setAttribute("tennis", 10000);
    session.setAttribute("swimming", 20000);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="쿠키정리.jsp">쿠키 보러가기</a>
<a href="세션정리.jsp">세션 보러가기</a>
</body>
</html>