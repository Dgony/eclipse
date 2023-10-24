<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="com.sun.xml.internal.ws.encoding.XMLHTTPBindingCodec"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--
    jsp에서 해야 하는 작업 3가지
    1. form안에 입력한 데이터 받아서 저장해두자. ==> java
    2. 받은 데이터를 DAO에게 주자. ==> java
    3. 결과를 html로 만들자. ==> html/css/js
    -->
    <% 
    // 여기에 자바 코드를 쭉 쓰면 됨
    // 톰캣에서 자주 사용하는 객체는 내장함수로 미리 만들어 놓았음.
    // String 처럼 사용하면 된다는 얘기인듯.
    // 클라이언트로부터 데이터를 받아오는 객체 ==> request
    %>
    <%
    // 1. 클라이언트로부터 요청 받아오기
    String id = request.getParameter("id"); // input 안에 name = ""에 입력한 데이터를 받아옴
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img");
    
    // 2. DAO에 데이터를 주소로 전달하기
    ProductDAO dao = new ProductDAO();
    ProductVO bag = new ProductVO();
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setCompany(company);
    bag.setPrice(Integer.parseInt(price));
    bag.setImg(img);
    
    dao.insert(bag);
        
    // 3. HTML로 작성해서 클라이언트에 응답하기
    %> 
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
button {
	width: 150px;
	height: 30px;
	color: blue;
	background: yellow;
}
body {
	font-size: 20px;
}
</style>
</head>
<body bgcolor="lime">
<a href="index.html"><button>목차 페이지로</button>	</a><br>
	<a href="bbs.html"><button>게시판정보 페이지로</button></a><br>
상품등록이 완료되었습니다.!<br>
클라이언트에서 받은 데이터는 <%= id %>, <%= name %>, <%= content %>, <%= price %>, <%= company %>, <%= img %> 
</html>