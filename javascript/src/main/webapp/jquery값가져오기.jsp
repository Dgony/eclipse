<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () {
	
	$("div").text();
	$("div").text("새 텍스트"); // 지정한 태그의 텍스트를 수정하는 코드
	// $("#b1").text("새 텍스트"); 태그를 지정하는 방법은 id, class, 태그 전부 가능하다.
	
	$("input").val("입력함");
	// $("#b2").val("입력함");
	// input 태그를 수정하는 방법
	
	$("img").attr("src");
	$("img").attr("src", "win.jpg");
	// input을 제외한 다른 태그를 수정하는 방법
	
})
</script>
</head>
<body>
<div id="b1">1번구역</div><br>
<input id="b2" value="입력하는부분"><br>
<img src="test.jpg" width="100">
</body>
</html>