<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Radio Buttons</h2>
	<h3>Choose your favorite language</h3>
	<form action="">
		<input type="radio" , name="fav_language" , value="HTML">HTML<br>
		<input type="radio" , name="fav_language" , value="CSS">CSS<br>
		<input type="radio" , name="fav_language" , value="JavaScipt">JavaScript
		<!-- type 지정 radio를 통해 중복이 불가능한 선택지 입력폼을 제공할 수 있다. -->
		<br>
		<input type="submit", value="가장 좋아하는 프로그래밍 언어 선택 안료">
	</form>

	<hr>

	<h2>Checkboxes</h2>
	<h3><strong>input : checkbox</strong> defines a checkbox</h3>
	<form action="">
	<input type="checkbox", name="vehicle1", value="bike">I have a bike.<br>
	<input type="checkbox", name="vehicle2", value="car">I have a car.<br>
	<input type="checkbox", name="vehicle3", value="bus">I have a bus
	<br>
	<input type="submit", value="가지고 있는 교통수단 선택 완료">
	</form>

</body>
</html>