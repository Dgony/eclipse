<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			//var xhr = new XMLHttpRequest();
			$.ajax({
				url: "apis.data.go.kr/B551011/KorService1",
				data: {
					key : "",
`				},
				dataType: "json",
				success: function(json) {
					console.log(json)
					
				}
			}) 
		})
	})
	</script>
</head>
<body>
셋팅완료!!<button id = 'b1'>청년 지원 정책 api로  받아서 db에  넣기.</button>
</body>
</html>