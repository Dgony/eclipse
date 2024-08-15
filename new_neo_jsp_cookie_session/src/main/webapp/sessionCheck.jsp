<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<% // 스크립트릴

// session.jsp에서 form 제출을 통해 일시적인 파라미터 id, pw 에 저장한 값 가져오기
String id = request.getParameter("id");
String pw = request.getParameter("pw");

String id2 = "root";
String pw2 = "pass";
String result = "로그인 실패!";
if(id.equals(id2) && pw.equals(pw2)) {
	result = "로그인 성공!";
	// 로그인을 성공하게 되면, 그떄부턴 id가 파라미터가 아닌 세션에 저장되어야 함
	// 세션은 jsp에서 내장된 객체로 제공하기 떄문에 따로 설정 x
	session.setAttribute("id", id);
	
	// jsp의 내장 객체 - request, response, session, out 전부 해당
	// JavaScript의 내장 객체 - location, window, document, history
} else {
	out.print("재로그인 해주세요.<br>");
}

%>

<body>
로그인 결과 : <%= result %><br>
<%if(session.getAttribute("id")!=null) {%>
세션 id 값은 : <%= session.getAttribute("id")%>
<% }%><br>
<hr>
<a href = "news.jsp">
	<button>뉴스사이트</button>
</a><br>
<a href = "shopping.jsp">
	<button>쇼핑사이트</button>
</a><br>
<a href = "mail.jsp">
	<button>메일사이트</button>
</a>
</body>
</html>