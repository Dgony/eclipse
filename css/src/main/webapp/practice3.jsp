<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- c언어적 코딩-${path}-같은 것을 사용하기 위함 --%>
<c:set var="path" value="${pageContext.request.contextPath}"/> <!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href ="${path}/resources/css/body.css">

</head>
<body>

	<h1>테이블 만들어보기</h1>
	<hr>
	<table border="1">
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>반지의제왕</td>
			<td>반지를 차지하기 위한 여정</td>
		</tr>
		<tr>
			<td>해리포터</td>
			<td>딱총나무 지팡이를 차지하기 위한 여정</td>
		</tr>
		<tr>
			<td>나니아 연대기</td>
			<td>4남매의 이세계 생존기</td>
		</tr>
		<tr>
			<td>몬스터헌</td>
			<td>몬스터 떄려잡는 게임</td>
		</tr>
	</table>

</body>
</html>