<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<img alt="no" src="resources/img/marvle.jpg" width="200" height="200">
<h3>영화 정보검색</h3>
<form action="movieone">
아이디 : <input type="text" name="id"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>

<h3></h3>
<a href="movielist"><button>전체 검색 요청</button></a>
<hr>

<h3>영화 추가</h3>
<form action="movieinsert">
아이디 : <input name="id"><br>
제목 : <input name="title"><br>
평점 : <input name="rate"><br>
개봉일 : <input name="date"><br>
포스터 : <input name="img"><br>
<button type="submit">서버로 전송</button>
</form>
<hr>

<h3>평점 수정</h3>
<form action="movieupdate">
아이디 : <input name="id"><br>
평점 : <input name="rate"><br>
<button type="submit">서버로 전송</button>
</form>

</body>
</html>