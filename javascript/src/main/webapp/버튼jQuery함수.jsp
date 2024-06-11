<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
button {
	height: 120px;
	width: 240px;
	background: yellow;
	font-size: 40px;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () { // 익명함수, DOM ready 함수와 완전히 똑같은 단축문법이다.

	$("#b1").click(function () {
		alert("버튼1을 눌렀습니다.");
	});
	
	$("#b2").click(function () {
		alert("버튼2를 눌렀습니다.");
	});
	
})
</script>
<body>
<button id="b1">버튼1</button>
<button id="b2">버튼1</button>
</body>
</html>