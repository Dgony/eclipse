<%@page import="bean.CarDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1) 데이터를 받아서, vo에 넣으세요.
    		1-1) vo를 만들자
    		MemberDTO dto = new MemberDTO();
    		1-2) vo에 받은 데이터를 다 넣자.
     -->
     <!-- jsp만의 특별한 태그(액션태그): 특정한 처리를 해줌 -->
     <!-- 태그명앞에 다른 태그들과 구분하기 위해서 이름을 써준다.
     	  namespace(이름공간)
      -->
     <jsp:useBean id="bag" class="bean.MemberDTO"></jsp:useBean>
     <jsp:setProperty property="*" name="bag"/>
    <!-- 2) dao에 insert(vo)를 요청 -->
    <%
    	CarDAO dao = new CarDAO();
        int result = dao.insert(bag); //int(1/0)
        String resultText = "";
        if(result == 1){
        	resultText = "회원가입에 성공했습니다.";
        }else{
        	resultText = "회원가입에 실패했습니다.";
        }
    %>
    <!-- 3) insert결과에 따라서 성공하면 member.jsp로 페이지 자동 넘김 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" type="text/css" href="CSS/project.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
<%= resultText %>
<a href="member.jsp">회원가입 / 로그인 페이지로 이동</a>
</body>
</html>