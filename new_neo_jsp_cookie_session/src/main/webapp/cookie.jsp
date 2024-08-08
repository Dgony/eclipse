<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% //쿠키는 자바 클래스와 메서드를 통해 심을 수 있다.
// 스크립트릿 applet : application + let(작은) 프로그램
// 쿠키는 브라우저에 텍스트로 저장되어야 하기 때문에 문자열만 허용 가능
Cookie c1 = new Cookie("name", "honggildong"); // name, value
Cookie c2 = new Cookie("age", "100");
response.addCookie(c1); // 클라이언트에 쿠키를 심게 명령하는 메서드 
response.addCookie(c2); 

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
브라우저에 쿠키글 심었음. <br>
<a href="cookieCheck.jsp">쿠키 확인하러 가기</a>
</body>
</html>