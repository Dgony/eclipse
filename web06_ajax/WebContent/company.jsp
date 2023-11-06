<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function() {
	
	$('#b1').click(function() {
		$.ajax({
			url : "data/company_mock.json",
			success : function(json) {
				// console.log(json)
				// console.log(json[0])
				// console.log(json[0].email)
				alert(json.length);
				for (let i = 0; i < json.length; i++) {
					console.log(json[i].addr);
					console.log(json[i].domain);
					console.log("------------");
				}
				
				// $(json).each(function(i, one) {
				// 	console.log(one.email)
				// })
			}
		})
	}) // b1
	
	$('#b2').click(function() {
		$.ajax({
			url : "data/company_mock.json",
			success : function(json) {
				// console.log(json)
				// console.log(json[0])
				// console.log(json[0].email)
				// for (let i = 0; i < json.length; i++) {
				//	console.log(json[i].id);
				//	console.log(json[i].email);
				//	console.log(json[i].car);
				// }
				
				$(json).each(function(i, one) {
					// console.log(one.email)
					
					idValue = one.id
					nameValue = one.name
					addrValue = one.addr
					telValue = one.tel
					domainValue = one.domain
					
					$.ajax({
						url : "db_create2.jsp",
						data : {
							id : idValue,
							name : nameValue,
							addr : addrValue,
							tel : telValue,
							domain : domainValue,
						},
						success : function(result){
							if (result.trim() === 1) {
								console.log("db에 넣기 성공")
							} else {
								console.log("db저장 실패")
							}
							}
					})
				})
			}
		})
	}) // b1
	
	$('#b3').click(function() {
		$('#d1').empty()
		$.ajax({
			url : "data/company_mock.xml",
			success : function(xml) {
				console.log(xml)
				list = $(xml).find('record')
				
				for (let i = 0; i < list.length; i++) {
					let id = $(list[i]).find('id').text()
					let name = $(list[i]).find('name').text()
					let addr = $(list[i]).find('addr').text()
					let tel = $(list[i]).find('tel').text()
					let domain = $(list[i]).find('domain').text()
					$('#d1').append(id + " " + name + " " + addr + " " + tel + " " + domain + "<br>");
				}
			}
		})
	}) // b3
}) // $
</script>
</head>
<body>
<button id = "b1">company_mock.json 읽어와서 추출하기</button>
<button id = "b2">company_mock.json 읽어와서 DB에 집어넣기</button>
<button id = "b3">company_mock.xml 읽어와서 추출하기</button>
<hr>
<div id="d1" style="background: pink"></div>
</body>
</html>