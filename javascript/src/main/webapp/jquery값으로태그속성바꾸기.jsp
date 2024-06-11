<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL 코어 태그를 사용하기 위함(c타입 반복문 등) -->
<!-- 즉 위의 JSTL 코어태그 사용이 있어야 아래의 Path 기준 경로 설정을 쉽게 할 수 있다. -->
<c:set var="path" value="${pageContext.request.contextPath}"/> <!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () {
	$("#b1").click(function () {
		$("#img1").attr("src", "${path}/resources/img/img2.jpg")
	});
	
	$("#b2").click(function () {
		$("#img2").attr("src", "${path}/resources/img/img4.jpg")
	});
	
	$("#b3").click(function () {
		$("#b3").attr("style", "background: pink")
	})
})
</script>
</head>
<body>
<img id = "img1" src="${path}/resources/img/img1.jpg"><br>
<button id="b1">이미지 변신!</button>
<hr>
<img id = "img2" src="${path}/resources/img/img3.jpg"><br>
<button id="b2">이미지 변신!</button>
<hr>
<button id ="b3">색깔이 바뀌는 버튼!</button>
</body>
</html>