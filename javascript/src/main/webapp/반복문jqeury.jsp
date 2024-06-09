<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

// 0부터 999까찌 브라우저에 출력
function thousand() {
	let result = "";
	for (var i = 0; i < 1000; i++) {
		result += "<li>" + i + "</li>";
	}
	$("#thousand").html(result);
} // <li>0</li> 부터 순서대로 999까지 브라우저에 표시하는 코드

$(document).ready(function () {
	thousand();
})

</script>

</head>
<body>

<div>
<ul id="thousand"></ul>
</div>

</body>
</html>