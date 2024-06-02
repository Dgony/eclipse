<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
안녕하세요!

<h1>오늘은 일요일</h1>
<ol type="a"> <!-- ordered list, 순서 있는 목록 -->
<li>웹 코딩 수업</li>
<li>점심식사</li>
<li>공원에 놀러가기</li>
</ol>
<ul type="circle"> <!-- unordered list, 순서 없는 목록 -->
<li>떡볶이 먹기</li>
<li>방청소</li>
<li>친구와 수다</li>
</ul>

<ul type="circle">
	<li>1번 목록</li>
		<ol> <!-- 이런 방식으로 목록 속 목록도 가능 -->
		<li> Item one </li>
   		<li> Item two </li>
		</ol>
	<li>2번 목록</li>
	<li>3번 목록</li>
</ul>

</body>
</html>