<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
$(function () {
	$('.b1').click(function () {
		$.ajax({
			url : "landmark_list2",
			data : ({
				city : $(this).val()
			}),
			success : function (x) {
				$("#result").html(x)
			}
		})
	})
})
</script>
</head>
<body bgcolor="yellow">
<table border="1">
    <tr bgcolor="lime">
        <td>도시</td>
        <td>국가</td>
    </tr>
<c:forEach items="${list}" var="vo">
    <tr>
        <td><button class ="b1" value = "${vo.city}">${vo.city}</button></td>
        <td>${vo.country}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>