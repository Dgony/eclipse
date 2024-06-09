<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- c언어적 코딩-${path}-같은 것을 사용하기 위함 --%>
<c:set var="path" value="${pageContext.request.contextPath}"/> <!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
button {
	height: 120px;
	width: 240px;
	background: yellow;
	font-size: 40px;
}
</style>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- jquery 이렇게 html이나 jsp에서 로드하면 됨 -->
<script type="text/javascript" src="${path}/resources/js/forjquery.js">

/*
$(document).ready(function() {
	go();
}); ==> 자동실행하는 방식. 이번 파일엔 go 함수로 대신 실행
*/


</script>
</head>
<body>
<button onclick="go()">go</button>
<div id ="re"></div>
</body>
</html>