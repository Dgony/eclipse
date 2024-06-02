<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>여러 선택지중 하나 고르기</h2>

	<table border="1">
		<tr align="center">
			<td><form action="">
					선택지 중 하나 고르기 : 
					<select> <!-- form이지만 input과는 다른 select와 option으로 여러 선택지 제공 가능, 중복x -->
						<option>선택지 1</option>
						<option>선택지 2</option>
						<option>선택지 3</option>
						<option>선택지 4</option>
						<option>선택지 5</option>
					</select>
				</form></td>
		</tr>
		<tr align="center">
			<td><input type="submit" , value="선택 완료"></td>
		</tr>


	</table>

</body>
</html>