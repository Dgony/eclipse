<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
</head>

<body>
<h3>랜드마크 추가</h3>
<form action="landmark_insert"> <!-- submit을 누르면 Controller가 landmark_insert를 찾아서 값 전달-->
이름 : <input name="landmark_name"><br>
정보 : <input name="landmark_info"><br>
사진 : <input name="landmark_pic"><br>
위도 : <input name="lat"><br>
경도 : <input name="lon"><br>
도시 : <input name="city"><br>
<button id = "b1" type="submit">서버로 전송</button>
<hr style="color: red">
<a href = "landmark_index.jsp"><button>첫페이지로 돌아가기</button></a>
</form>
</body>
</html>