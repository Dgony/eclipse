<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsDTO2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 가방을 만들어서, ajax(브라우저)로 넘어온 값 받아서 가방에 넣어주세요.-->
    <jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <!-- jsp액션태그 -->
    <%
   /*  String id = request.getParameter("id");
    String price = request.getParameter("price");
    String title = request.getParameter("title");
    
    ProductDTO bag = new ProductDTO();
    bag.setId(id);
    bag.setPrice(price);
    bag.setContent(content); */
    BbsDAO dao = new BbsDAO();
    
    %>
    <%
    int result = dao.insert(bag);
    if(result == 1) {
    	response.sendRedirect("bbs.jsp");
    } else {
    	out.print("실패했지렁");
    }

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
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





