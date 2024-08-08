<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String tel = request.getParameter("tel");

String result = "";
String pre = tel.substring(0, 3);
switch (pre) {
case "010":
	result = "100";
	break;
case "011" : 
	result = "111";
	break;
case "012" : 
	result = "222";
	break;
}

Random r = new Random();
int post = r.nextInt(900) + 100;
result = pre + post;
%><%= result %> 