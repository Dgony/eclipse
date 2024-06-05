<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%-- c언어적 코딩-${path}-같은 것을 사용하기 위함 --%>
<c:set var="path" value="${pageContext.request.contextPath}"/> <!-- Path의 기준 경로 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

// 함수는 여러절차가 있는 처리를 이름을 부여하여 기능을 정의한다. 
// function
function 빨래하기() {
	console.log("1. 먼지를 털자.");
	console.log("2. 물에 집어 넣는다.");
	console.log("3. 비누를 바른다.");
	console.log("4. 오물조물 비빈다.");
	console.log("5. 물에 여러번 헹군다.");
	console.log("6. 짠다.");
	console.log("7. 넌다.");
}

빨래하기() // 함수를 사용, 기능을 사용하는 것
빨래하기() // 이렇게 두번 사용하면 두번 써진다.

</script>


</head>
<body>

</body>
</html>