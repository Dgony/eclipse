<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
li {
	list-style: none; float : left;
	padding: 15px;
	width: 100px;
	height: 25px;
	border-radius: 50px;
	text-align: center;
	float: left;
}

li:nth-child(2n) {
	background: orange;
}

li:nth-child(2n+1) {
	background: yellow;
}

li:hover {
	background: red;
	font-size: 20px;
}
</style>
</head>

<body>

	<ul>
		<li><a href="page1.jsp">css 적용</a></li>
		<li><a href="page2.jsp">선택자</a></li>
		<li><a href="page3.jsp">hover</a></li>
		<li><a href="page4.jsp">div 꾸미기</a></li>
	</ul>

</body>
</html>