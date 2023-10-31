<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 로그인 성공한 경우 id를 세션으로 설정해주세요!
    // id가 세션으로 설정이 되어있다면 로그인 성공이라고 판단하자!
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    String id2 = "pineapple";
    String pw2 = "1234";
    
    if(id.equals(id2) && pw.equals(pw2)) {
    	session.setAttribute("id", id);
    	out.print("로그인 성공!<br>");
    } else {
    	out.print("로그인이 실패했습니다. 다시 로그인해주세요.<br>");
    	out.print("<a href = '네이버로그인.jsp'>로그인 페이지로 돌아가기</a><br> ");
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="news.jsp">뉴스로 링크</a><br>
<a href="mail.jsp">메일로 링크</a><br>
<a href="shoppin.jsp">쇼핑으로 링크</a><br>
</body>
</html>