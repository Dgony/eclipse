<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
.th1 {
background: white;
color: blue;
}
.th2 {
background: yellow;
}
.text1 {
background: pink;
}
.th3 {
background: yellow;
}
.th4 {
background: white;
color: green;
}
th {
background: lime;
}
</style>
</head>
<body>

	<table border="1">
		<tr>
			<th>항목</th>
			<th>입력</th>
		</tr>
		<tr>
			<th class="th1">번호</th>
			<th class="th2"><input type="text", class="text1"></th>
		</tr>
		<tr>
			<th class="th1">제목</th>
			<th class="th2"><input type="text", class="text1"></th>
		</tr>
		<tr>
			<th class="th1">내용</th>
			<th class="th2"><input type="text", class="text1"></th>
		</tr>
		<tr>
			<th class="th1">작성자</th>
			<th class="th2"><input type="text", class="text1"></th>
		</tr>
		<tr>
			<th class="th3", colspan="2"><input class="th4", type="submit" , value="글쓰기 완료"></th>
		</tr>
	</table>

</body>
</html>