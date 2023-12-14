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
<h3>도시 추가</h3>
<form action="city_insert"> <!-- submit을 누르면 Controller가 city_insert를 찾아서 값 전달-->
도시 : <input name="city"><br>
국가 : <input name="country"><br>
<button id = "b1" type="submit">서버로 전송</button>
<hr style="color: red">
<a href = "landmark_index.jsp"><button>첫페이지로 돌아가기</button></a>
</form>
</body>
</html>