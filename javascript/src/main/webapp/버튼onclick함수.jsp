<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<script type="text/javascript">

function fighting() {
	alert("파이팅!");
}

function goodbye() {
	alert("잘가!");
}


</script>
</head>
<body>

<button id="fighting" onclick="fighting()">파이팅!</button>
<button id="goodbye" onclick="goodbye()">잘가!</button>

</body>
</html>