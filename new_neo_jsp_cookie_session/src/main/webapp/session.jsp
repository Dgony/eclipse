<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
<% 
// 세션 끊고 시작하기
session.removeAttribute("id");

%>
<form action="sessionCheck.jsp">
	로그인 id : <input type="text" name = "id"><br>
	로그인 pw : <input type="text" name = "pw"><br>
	<button style="color: red;, background: yellow">로그인 처리 요청</button>
</form>
</html>