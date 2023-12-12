<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
<%@ include file="header.jsp"%>
<script type="text/javascript">

</script>
</head>

<body>
<h3>랜드마크 추가</h3>
<form action="landmark_insert">
이름 : <input name="landmark_name"><br>
정보 : <input name="landmark_info"><br>
사진 : <input name="landmark_pic"><br>
위도 : <input name="lat"><br>
경도 : <input name="lon"><br>
도시 : <input name="city"><br>
<button id = "b1" type="submit">서버로 전송</button>
</form>
</body>
</html>