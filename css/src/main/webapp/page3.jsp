<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

td {
	background: yellowgreen;
	width : 100px;
}

td:hover { /* 가상 선택자(마우스 올려놓기) */
	background: red;
	color: white;
	font-family: 궁서;
	font-size: 20px;
}

</style>

</head>
<body>

	<h1>나의 취미</h1>
	<hr color="red" , size="30px">
	<table border="1">
		<tr>
			<th style="background: yellow;">취미종류</th>
			<th style="background: pink;">취미금액</th>
			<th style="background: green;">취미장소</th>
		</tr>
		<tr>
			<td>달리기</td>
			<td>1000</td>
			<td>여의도 공원</td>
		</tr>
		<tr>
			<td>등산</td>
			<td>2000</td>
			<td>관악산</td>
		</tr>
		<tr>
			<td>독서</td>
			<td>10000</td>
			<td>강남역</td>
		</tr>
		<tr style="background: violet;">
			<th colspan="3"><a href="page1.jsp">첫페이지로</a></th>
		</tr>
	</table>

</body>
</html>