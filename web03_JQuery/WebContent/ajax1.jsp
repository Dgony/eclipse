<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.reddit.com%2Fr%2Fgifs.rss&api_key=hzii0cdvezqjae4dsjepnjkhcomzmganvb7b0cue",
		success : function(x) {
			console.log(x) // 브라우저를 console에 출력하기
			list = x.items //[{titlte:..., content:...},{},{}]
			for(let i = 0; i< list.length; i++){
				console.log(list[i].title)
				console.log(list[i].link)
				console.log(list[i].content)
				$('#d1').append(list[i].titke + " " + list[i].link + " " + list[i])
			}
		},
		error : function() {
			alert("에러 발생함.")
		}
	}) // ajax
}) // $
</script>
</head>
<body>

</body>
</html>