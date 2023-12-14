<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<script type="text/javascript">
$(function () {
	
	$('#b1').click(function () { // state_city 불러오기
		$.ajax({
			url : "city_list",
			success : function (x) {
				$("#result").html(x)
			}
		}) // ajax
	}) // b1
	
	$('#b2').click(function () { // landmark 불러오기
		$.ajax({
			url : "landmark_list",
			success : function (x) {
				$("#result").html(x)
			}
		}) // ajax
	}) // b2
	
}) // $u
</script>
</head>

<body>
<a href = "landmark_insert.jsp"><button >랜드마크 입력페이지로 가기</button></a><br>
<a href = "city_insert.jsp"><button >도시 입력페이지로 가기</button></a><br>
<hr style="color: red">
<button id ="b1">state_city 불러오기</button><br>
<button id ="b2">landmark 불러오기</button><br>
<hr style="color: red">
<div id ="result">도시 결과 들어가는 곳</div>
</body>
</html>