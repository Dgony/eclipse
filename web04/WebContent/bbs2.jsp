<%@page import="bean.BbsDTO2"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
    <jsp:setProperty property="id" name="bag"/>
    
<!DOCTYPE html>
<%
	BbsDAO dao = new BbsDAO();
    BbsDTO2 bag2 = dao.one(bag);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" type="text/css" href="CSS/project.css">
</head>
<body>
    <div id = "total"><!-- 전체 화면 을 묶음  -->
        <div id ="top"><!-- 메뉴가 들어가는 부분  -->
            <jsp:include page='top.jsp'></jsp:include>
        </div>
        <div id ="top2"><!-- 장바구니가 들어가는 부분 -->
            <jsp:include page="top2.jsp"></jsp:include>
        </div>
        <div id ="center"><!-- 메뉴 별 내용 부분 -->
            <table class="table table-hover">
                <thead>
                    <tr class="table-warning">
                        <th colspan="2"><%= bag2.getWriter() %>님이 작성함</th>
                    <tr>
                </thead>
                <tbody>
                    <tr class="table-info">
                        <td>
                            제목
                        </td>
                        <td>
                            <%= bag2.getTitle() %>
                        </td>
                    </tr>
                    <tr class="table-info">
                        <td>
                            내용
                        </td>
                        <td>
                            <%= bag2.getContent() %>
                        </td>
                    </tr>
                    <tr class="table-info">
                        <td>
                            작성자
                        </td>
                        <td>
                            <%= bag2.getWriter() %>
                        </td>
                    </tr>
                    <tr class="table-info">
                        <td colspan = "2">
                            <a href="bbs.jsp">
                                <button  class="btn btn-danger">리스트로</button>
                            </a>
                            <% 
                            //if(로그인한사람id랑 글작성한사람id와 동일한지체크)
                            if(session.getAttribute("id") != null){
                            	if(session.getAttribute("id").equals(bag2.getWriter())) {
                            %>
	                            <a href="update.jsp?id=<%= bag2.getId() %>">
	                                <button class="btn btn-secondary">수정</button>
	                            </a>
	                            <a href="delete.jsp?id=<%= bag2.getId() %>">
	                                <button class="btn btn-dark">삭제</button>
	                            </a>
                            <%}}%>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>        
    </div>
</body>
</html>