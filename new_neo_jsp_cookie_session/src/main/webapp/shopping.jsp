<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쇼핑사이트</h1>
로그인한 사람 : <%= session.getAttribute("id") %>
<!-- 로그인 여부에 따라 장바구니 목록 / 로그인 페이지로 보내기 -->
<% if(session.getAttribute("id")!=null) {%>
<br>
* 운동화<br>
* 커피<br>
* 물 1병
<% }else if (session.getAttribute("id")==null) { %>
<script type="text/javascript">location.href="session.jsp"</script>
<%}; %>
</body>
</html>