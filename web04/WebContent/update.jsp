<%@page import="bean.BbsDTO2"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
    <jsp:setProperty property="id" name="bag"/>
    
<%
	BbsDAO dao = new BbsDAO();
    BbsDTO2 bag2 = dao.one(bag);
%>
    
    
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
		<div id="center">
<hr color="blue">
			<form action="update2.jsp">
			<input name = "id" value = "<%= bag2.getId() %>" type = "hidden">
				<table border="1"  class="table table-hover">
					<tr  class="table-warning">
						<td width="200">제목</td>
						<td width="300"><input name="title" value = "<%= bag2.getTitle() %>"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200">내용</td>
						<td width="300"><input name="content" value = "<%= bag2.getContent()%>"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200">작성자</td>
						<td width="300"><input name="writer" value ="${id}"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200" colspan="2">
							<button type="submit">글 수정하기</button>
						</td>
					</tr>
				</table>
			</form>
</body>
</html>