<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#d1 {
	border-style: double;
	border-color: red;
}

#d2, #d3 {
	width: 250px;
	background: yellow;
	padding: 20px; /* 안쪽 여백 4군데를 20xp만큼 둠 */
	margin: 20px; /* 바깥쪽 여백 4군데를 250px만큼 둠 */
	border-radius: 100px 10px; /* 테두리의 곡률을 정함 */
	border: 20px inset blue; /* 테두리의 색과 두께를 정함 */
	box-shadow: 10px 10px grey; /* 해당 선택자의 그림자의 형태를 정함 */
}
</style>
</head>
<body>

	<div id="d1">
		나는 첫번째 메뉴가 들어갈 부분<br> 나는 두번째 글입니다.
	</div>
	<div id="d2">오늘은 비가 많이 오고 황사 떄문에 먼지도 많습니다.</div>
	<div id="d3">내일은 비가 그치고 황사도 사라질 것입니다.</div>

</body>
</html>