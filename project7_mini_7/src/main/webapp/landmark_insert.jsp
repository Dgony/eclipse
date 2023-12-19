<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<script type="text/javascript">
        function validateForm() {
            var landmarkName = document.getElementsByName("landmark_name")[0].value;
            var landmarkInfo = document.getElementsByName("landmark_info")[0].value;
            var landmarkPic = document.getElementsByName("landmark_pic")[0].value;
            var lat = document.getElementsByName("lat")[0].value;
            var lon = document.getElementsByName("lon")[0].value;
            var city = document.getElementsByName("city")[0].value;

            // 유효성 검사
            if (landmarkName === '' || landmarkInfo === '' || landmarkPic === '' ||
                lat === '' || lon === '' || city === '') {
                alert('빈칸을 모두 채워주세요');
                return false; // 서버로의 전송을 막음
            }

            return true;
        }
    </script>
</head>

<body>
<h3>랜드마크 추가</h3>
<form action="landmark_insert" onsubmit="return validateForm();"> <!-- submit을 누르면 Controller가 landmark_insert를 찾아서 값 전달-->
이름 : <input name="landmark_name"><br>
정보 : <input name="landmark_info"><br>
사진 : <input name="landmark_pic"><br>
위도 : <input name="lat"><br>
경도 : <input name="lon"><br>
도시 : <input name="city"><br>
<button id = "b1" type="submit">서버로 전송</button>
<hr style="color: red">
</form>
<a href = "landmark_index.jsp"><button>첫페이지로 돌아가기</button></a>
<div>결과 표시되는 곳</div>
</body>
</html>