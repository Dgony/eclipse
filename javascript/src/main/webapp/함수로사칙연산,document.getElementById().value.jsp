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
input {
	width: 200px;
	height: 30px;
	background: skyblue;
	font-size: 15px;
	color: white;
	text-align: center;
}
</style>

<script type="text/javascript">

function plus() {
	let x = parseInt(document.getElementById("in1").value);
	let y = parseInt(document.getElementById("in2").value);
	result = x + y;
	alert("더한 값은 " + result); 
}

function minus() {
	let x = parseInt(document.getElementById("in1").value);
	let y = parseInt(document.getElementById("in2").value);
	result = x - y;
	alert("뺀 값은 " + result); 
}

function multiple() {
	let x = parseInt(document.getElementById("in1").value);
	let y = parseInt(document.getElementById("in2").value);
	result = x * y;
	alert("곱한 값은 " + result); 
}

function division() {
	let x = parseInt(document.getElementById("in1").value);
	let y = parseInt(document.getElementById("in2").value);
	result = x / y;
	alert("나눈 값은 " + result); 
}

</script>
</head>
<body>

<div> 
<input id="in1"><br>
<input id="in2"><br>
<button id="b1" onclick="plus()">더하기</button>
<button id="b1" onclick="minus()">빼기</button>
<button id="b1" onclick="multiple()">곱하기</button>
<button id="b1" onclick="division()">나누기</button>
</div>

</body>
</html>