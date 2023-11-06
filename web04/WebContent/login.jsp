<%@page import="bean.CarDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 액션태그!!  -->
    <!-- spring: MemberDTO dto -->
    <jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean> <!-- 1줄 -->
    <jsp:setProperty property="*" 			name="dto"/> <!-- 4줄 -->
    <!--             변수지정(*,모든 파라메터)		가방의 이름(빈, 객체의 이름) -->
    <!-- 받아서 가방에 넣은 변수 20개경우, 받는거 20줄, 가방에 넣는거 20줄 40줄을 대체!! -->
    <%
    	//1.입력: id,pw를 받아오자.
     		String id = request.getParameter("id");
        	String pw = request.getParameter("pw");
        	
        	MemberDTO bag  = new MemberDTO();
        	bag.setId(id);
        	bag.setPw(pw);
        	
        	//2.처리: db처리(DAO, DTO)
        	CarDAO dao = new CarDAO();
        	boolean result = dao.login(dto); //boolean(true, false)
        	//로그인이 성공했으면 반드시 해주어야 하는 처리는 세션처리!!!!
        	if(result){ //if(조건) {조건이 true이면 이 괄호를 실행해라!}
        		//세션을 설정해주자.!!!
        		session.setAttribute("id", bag.getId());
        	}
        	//화면을 첫화면으로 넘어가자.!
        	response.sendRedirect("member.jsp");
        	//서버가 클라이언트(브라우저)에게 member.jsp를 
        	//요청하라고 명령!!
    %>
    <!--2. dao를 이용해서 db처리, login(bag) -->
    <!--3. 결과는 member.jsp로 다시 돌아감. -->
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
</body>
</html>