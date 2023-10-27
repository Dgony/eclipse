<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 쿠키를 만들자
    Cookie c1 = new Cookie("name", "홍길동"); // 이름 + 값dmfh mapping 됨
    Cookie c2 = new Cookie("age", "10");
    
    // 브라우저에 심자
    // 내장된 객체인 response 사용하기
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
<h3>브라우저에 쿠키심기 완료!</h3>
<a href = "쿠키보기.jsp"></a>
</body>
</html>