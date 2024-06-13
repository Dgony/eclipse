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
    $("#b1").click(function () {
    	let api_key = "";
    	// zmganvb7b0cue 3
    	// 4dsjepnjkhcom 2
    	// hzii0cdvezqjae 1
        $.ajax({
            url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.hankyung.com%2Ffeed%2Fall-news&api_key=" + api_key,
            success: function (doc) { // rss든 api든 전달받은 문서를 doc라는 매개변수로 받는 것 같다. 
                let list = $(doc.items);
                console.log(doc.items);
                $(list).each(function (index, item) {
                    $("#d1").append(
                    		item.title + "<br>" +
                    		"<a href = " + item.link + ">" + item.link + "</a>" + "<hr>");
                });
            },
            error: function (xhr, status, error) {
                console.log("Error: " + error);
            }
        });
    });
});
</script>
</head>
<body>
<button id="b1">한국경제 RSS 불러오기</button>
<hr color="red">
<div id="d1"></div>
</body>
</html>