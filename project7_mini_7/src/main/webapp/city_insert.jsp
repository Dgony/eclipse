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
<form action="city_insert">
도시 : <input name="city"><br>
국가 : <input name="country"><br>
<button id = "b1" type="submit">서버로 전송</button>
</form>
</body>
</html>