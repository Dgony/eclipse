<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

body { /* 기본 선택자(태그) */
	background: yellow;
	color: green;
}

h3 {
	height: 200px;
	width: 300px;
	border: dotted;
}

li {
	background: white;
	color: blue;
}

#s { /* 기본선탁지 (id) */
	font-size: 100px;
	color: green;
}

#n {
	background: gold;
	color: lime;
}

#g, #j {
	border-style: double;
}

</style>

</head>
<body>

<h3>가고 싶은 곳</h3>
<ul>
<li id="s">신촌</li>
<li id="g">강남</li>
<li id="j">종로</li>
<li id="n">노량진</li>
<li><a href="page3.jsp">3페이지로</a></li>

</ul>

</body>
</html>