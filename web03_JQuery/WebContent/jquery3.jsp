<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url : "jquery00.jsp",
		success : function() {
			alert("ajax 성공!----1");
		} // success
	}) // ajax
}) // $

$(function() {
	$.ajax({
		url : "jquery1.jsp",
		success : function() {
			alert("ajax 성공!----2");
		} // success
	}) // ajax
}) // $

$(function() {
	$.ajax({
		url : "jquery4.jsp",
		success : function(x) {
			alert("ajax 성공!----3");
			alert(x);
		} // success
	}) // ajax
}) // $
</script>
</head>
<body>

</body>
</html>