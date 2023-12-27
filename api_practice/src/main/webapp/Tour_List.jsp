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
				url: "apis.data.go.kr/B551011/KorService1/areaBasedList1",
				data: {
					key : "gRjisabrZIfabIjre8qnZIy4ig724PgKzbxWE5KdbOHL4SD%2FneKsnNw2phKHIowgD5NXuBRaTpMEvSAY2uTA1Q%3D%3D"
				},
				dataType: "json",
				success: function(json) {
					console.log(json)

					}
				}
			}) 
		})
		
	})
</script>
</head>
<body>
<button id="b1">박스오피스 가지고 오기(영화진흥위원회)</button>
</body>
</html>