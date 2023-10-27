<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 뉴스 댓글을 쓸 때 로그인 여부에 따라 화면이 다름
    // 로그인 했을 때, 안했을 때를 세션에 id가 저장되어있는지 확인해서 판단한다.
    if(session.getAttribute("id") == null) {
    	out.print("로그인 되지 않았습니다.");
    	out.print("로그인 아이디 : <input name = id>");
    } else {
    	out.print(session.getAttribute("id") + "님이 로그인 하셨습니다.");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
메일화면입니다. 100통의 메일이 도착했습니다.
</body>
</html>