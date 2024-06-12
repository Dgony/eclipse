<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- JSTL 코어 태그를 사용하기 위함(c타입 반복문 등) -->
<!-- 즉 위의 JSTL 코어태그 사용이 있어야 아래의 Path 기준 경로 설정을 쉽게 할 수 있다. -->
<c:set var="path" value="${pageContext.request.contextPath}"/> <!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () {
	$("#b1").click(function () { // div 태그에 img파일을 append 방식으로 추가하는 방법
		let img = "${path}/resources/img/img1.jpg";
		$("#d1").append("<img src = " + img + "><br>");
	}); 
	
	$("#b2").click(function () { // div에 댓글만 추가
		let reply1 = $("#text1").val();
		$("#d1").append(reply1 + "<br>");
	});
	
	$("#b3").click(function () { // div에 댓글와 이미지 추가
		let img = "${path}/resources/img/img1.jpg";
		let reply1 = $("#text2").val(); 
		$("#d1").append("<img src = " + img + ">" + reply1 + "<br>");
	});
	
	$("#b4").click(function () { 
		let button = `<button id="b1">이미지 추가</button><br>`;
		// 변수할당하는 과정에서 문자열을 감싸는 ""큰따옴표가 여러번 들어가는 경우 ``을 감싸서 해결 가능
		$("#d1").append(button);
	});
})
</script>
</head>
<body>

<button id="b1">이미지 추가</button><br>

댓글 1 : <input type="text" id="text1">
<button id="b2">댓글1 추가</button><br>

댓글 2 : <input type="text" id="text2">
<button id="b3">이미지+댓글2 추가</button>

<br>
<button id="b4">이미지 추가 버튼을 추가하기</button>

<hr color="red">
<div id="d1"></div>
</body>
</html>