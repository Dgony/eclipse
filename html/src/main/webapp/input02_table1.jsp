<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr align="center" , bgcolor="yellowgreen">
			<th width="100">항목</th>
			<th width="300">입력</th>
		</tr>
		<tr align="center">
			<td width="100">번호</td>
			<td width="300" , bgcolor="violet"></td>
		</tr>
		<tr align="center">
			<td width="100">제목</td>
			<td width="300" , bgcolor="yellow"><input type="text"></td>
		</tr>
		<tr align="center">
			<td width="100">내용</td>
			<td width="300" , bgcolor="yellow"><textarea rows="10" cols="30"></textarea></td>
		</tr>
		<tr align="center">
			<td width="100">작성자</td>
			<td width="300" , bgcolor="yellow"><input type="text"></td>
		</tr>
		<tr align="center">
			<td colspan="2" , bgcolor="yellow"><input type="submit"
				, value="글쓰기 완료"></td>
		</tr>
	</table>

</body>
</html>