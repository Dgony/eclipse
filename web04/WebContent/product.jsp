<%@page import="bean.ProductDTO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
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
		<br>
		<% if(session.getAttribute("id") != null) {%>
		<span class="alert alert-success"> <%=session.getAttribute("id")%>님
				환영합니다.
			</span>
			<a href="logout.jsp">
			<button class="btn btn-danger">로그아웃</button>
			</a>
		<% } %>
		<br>
		<%
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.list();
		%>
		<br>
		<table border="1" class="table table-hover">
				<thead>
					<tr class="table-warning">
						<td>상품명</td>
						<td>상품가격</td>
						<td>상품이미지</td>
					</tr>
				</thead>
				<% for(ProductDTO bag : list) { %>
				<tr>
				<td><%= bag.getTitle() %></td>
				<td><%= bag.getPrice() %></td>
				<td> <a href="product2.jsp?id=<%= bag.getId() %>">
				<img src="IMG/<%= bag.getImg() %>"></a></td>
				</tr>
				<% } %>
				</table>
		
	</div>
</body>
</html>