<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- c언어적 코딩-${path}-같은 것을 사용하기 위함 --%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- jqeury를 사용하여 더 간편한 방법으로 javascript를 작성하는 방법
이번 jsp파일에선 js의 문자열을 웹 브라우저에 표시하기 위해 쓰였다. -->

<script type="text/javascript">
	// 화면에 다음과 같이 반복해서 출력하세요 ==> @@@ 세줄
	function print() {
		let output = "";
		for (var i = 0; i < 3; i++) {
			output += "@@@<br>";
		}
		$("#output").html(output); // jquery 사용
		// 'output'변수를 html로 변경 후, body애서 id output을 가진 태그에 넣는다.
	}

	// out.js에 여행햐다() 함수, 쉬다() 함수를 정의하여 html에 링크하여 사용해보세요.
	function 여행하다() {
		let trip = "";
		for (var i = 0; i < 5; i++) {
			trip += i + "번 여행지를 여행했다.<br>";
		}
		$("#trip").html(trip);
	}
	function 쉬다() {
		let q = "아이스크립";
		let w = "놀이동산";
		let e = "돈";
		let rest = w + "에서 " + q + "를 먹으며 " + e + "을 펑펑 쓰며 놀았다.";
		$(".rest").html(rest);
	}

	// $(document).ready(function() { ==> jQuery의 문법에서 $는 jQuery의 준말로, jQuery대신 쓸 수 있다.
	// $(document).ready(function()) ==> $(function) 또한 아무것도 쓰지 않고 그냥 함수를 쓰는 것으로 DOM ready 함수를 축약할 수 있다. 
	jQuery(document).ready(function() { // DOM이 준비되면 자동으로 ready의 내용을 실행시키는 객체
		print();
		여행하다();
		쉬다();
	});
</script>
</head>

<body>

	<div id="output"></div>
	<div id="trip"></div>
	<div class="rest"></div>

</body>
</html>