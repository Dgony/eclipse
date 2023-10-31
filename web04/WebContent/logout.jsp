<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% // 로그아웃은 세션을 끊겠다는 의미, 각 브라우저에 해당하는 서버 램에 저장했던 값들을 모두 지운다
    // 보통 로그아웃 하면 첫페이지로 넘어가는데, 이걸 서버가 브라우저에게 명령하면 된다.
    // response 객체를 이용한다.
    session.invalidate(); // 세션을 무효로 만들어주는 명령어
    response.sendRedirect("member.jsp"); //원하는 페이지로 돌아가는 명령어 
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>