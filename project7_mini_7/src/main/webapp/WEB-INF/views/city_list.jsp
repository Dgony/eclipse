<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1">
    <tr bgcolor="lime">
        <td>도시</td>
        <td>국가</td>
    </tr>
<c:forEach items="${city_list}" var="vo">
    <tr>
        <td>${vo.city}</td>
        <td>${vo.country}</td>
    </tr>
</c:forEach>
</table>