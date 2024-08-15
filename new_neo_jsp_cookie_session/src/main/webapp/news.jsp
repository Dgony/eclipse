<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>뉴스사이트</h1>
로그인한 사람 : <%= session.getAttribute("id") %><br>
<!-- 로그인 여부에 따라 댓글 입력 폼 / 로그인 페이지로 자동 넘김  -->
<% if(session.getAttribute("id")!=null) {%>
댓글 입력하기 : <input type="text">
<% }else if (session.getAttribute("id")==null) { %>
<script type="text/javascript">location.href="session.jsp"</script>
<%}; %>
</body>
</html>