<%@page import="java.util.ArrayList"%>
<%@page import="bean.CarDAO"%>
<%@page import="bean.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>      
    <%
          	String id = request.getParameter("id");    
              MemberVO bag = new MemberVO();
              bag.setId(id);
              
              CarDAO dao = new CarDAO();
              ArrayList<MemberVO> list =  dao.list();
              
              String result = "사용 가능한 id 입니다.";
              for(MemberVO x : list) {
              	if(x.getId().equals(id)) {
              		result = "중복된 id 입니다.";
              	}
              }
          %>
<%= result %>