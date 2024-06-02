<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/v1K4EAXe2oo?si=TpQkYQRTp2mlVZpj"
		title="YouTube video player" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
		referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
	<!-- iframe 태그로 다른 웹사이트의 콘텐츠를 내 웹페이지에 삽입할 때 사용된다. -->


	<h3>table과 iframe 같이 쓰기</h3>
	<table border="1">
		<tr>
			<th>ajr의 World's Smallest Violin</th>
			<th>ajr의 Burn the House Down</th>
		</tr>
		<tr>
			<td><iframe width="560" height="315"
					src="https://www.youtube.com/embed/PEnJbjBuxnw?si=n2Qdn4D8HdnCjyPm"
					title="YouTube video player" frameborder="0"
					allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
					referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></td>
			<td><iframe width="560" height="315"
					src="https://www.youtube.com/embed/UnyLfqpyi94?si=chuwopco3g_5iRFX"
					title="YouTube video player" frameborder="0"
					allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
					referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></td>
		</tr>
		<tr>
			<td>조회수 1억 9천회</td>
			<td>조회수 1억 1천회</td>
		</tr>
		<tr>
			<td>https://www.youtube.com/watch?v=PEnJbjBuxnw</td>
			<td>https://www.youtube.com/watch?v=UnyLfqpyi94</td>
		</tr>
	</table>

</body>
</html>