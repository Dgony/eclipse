<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() { // $() ==> 브라우저가 body 부분을 먼저 읽고 와서 $()내용을 처리하도록 명령
	
	// b1을 클릭했을 때 처리할 내용
	$('#b1').click(function() {
		let yearValue = $('#year').val();
		let year2 = 2023;
		let age = year2 - parseInt(yearValue);
		alert('당신의 나이는 ' + age);
	})
	
	//b2를 클릭했을 때 처리할 내용 
	$('#b2').click(function() {
		wValue = $('#w').val()
		hValue = $('#h').val()
		let result = parseFloat(wValue) * parseFloat(hValue)
		alert('사각형의 면적은 ' + result)
	})
})
</script>
</head>
<body>
태어난 해 입력 <input name = "year" id = "year" value ="2000">
<button id = "b1">나이 계산</button><br>
<br>
사각형의 가로 면적 : <input id = "w"><br>
사각형의 세로 면적 : <input id = "h">
<button id = "b2">사각형의 면적 계산</button><br>
<hr>
</body>
</html>