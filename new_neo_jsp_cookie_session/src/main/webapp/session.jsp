<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// session.setAttribute(name(String), value(Object))
session.setAttribute("view", 0); // String, Object만 지켜서 넣으면 됨
%>
세션값 확인 : <%= session.getAttribute("view") %><Br>
</body>
</html>