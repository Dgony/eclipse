<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function () {
	
	$('#b1').click(function () {
		$.ajax({
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.hankyung.com%2Ffeed%2Fall-news",
			success : function (x) {
				console.log(x);
				$('#d1').append(JSON.stringify(x));		
			}
		})
	})
	
})

</script>
</head>
<body style="background: pink">
<h2>한경 전체 뉴스 Json으로 받아오기</h2><br>
<button id='b1'>받아오기</button>
<hr style="color: red" size="5px">
<div id='d1'></div>
</body>
</html>