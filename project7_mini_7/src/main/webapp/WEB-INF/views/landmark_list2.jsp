<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table border="1">
	<tr bgcolor="lime">
		<td>관광지 이름</td>
		<td>관광지 정보</td>
		<td>관광지 사진</td>
		<td>위도</td>
		<td>경도</td>
		<td>도시</td>
	</tr>
	<c:forEach items="${list}" var="vo">
		<c:if test="${vo.city eq city}">
			<tr bgcolor="pink">
				<td>${vo.landmark_name}</td>
				<td>${vo.landmark_info}</td>
				<td><img src="resources/img/${vo.landmark_pic}" width="300" height="250"></td>
				<td>${vo.lat}</td>
				<td>${vo.lon}</td>
				<td>${vo.city}</td>
			</tr>
		</c:if>
	</c:forEach>
</table>