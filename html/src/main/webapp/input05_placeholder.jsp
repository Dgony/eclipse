<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>placeholder 적용하기</h2>
	<table border="1">
		<tr align="center">
			<th>value 속성인 경우</th>
			<th>placeholder 속성인 경우</th>
		</tr>
		<tr align="center">
			<td><input type="text", value="여기에 이름을 적어주세요"></td>
			<td><input type="text", placeholder="여기에 이름을 적어주세요"></td>
		</tr>
		<!-- value ==> 입력폼에 기본 입력되어 있음 / placeholder ==> 입력폼 설명용 배경(?) -->
	</table>


</body>
</html>