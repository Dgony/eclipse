<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String dollar = request.getParameter("dollar");
    String won = request.getParameter("one");
    
    int dollar2 = Integer.parseInt(dollar);
    int won2 = Integer.parseInt(won);
    
    String result = "";
    
    if(dollar != null) {
    	dollar2 *= 1340;
    	result = dollar + "달러는 " + dollar2 + "원"; 
    } else {
    	
    }
    
    if(won != null) {
    	won2 /= 1340;
    }
    %>
    
    
    
    
    
    