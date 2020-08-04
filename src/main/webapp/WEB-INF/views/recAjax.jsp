<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/restful/recAjax.json" >
			<label for="fname">가로</label>
			<input type="text" id='width' name='width'>
			<label for="fname">가로</label>
			<input type="text" id='height' name='height'>
			<input type="submit" value="전송">
		</form>
		
		<script>
			function areaAjax2() {
				
				$('form').submit(function (event) {
					
					ebent.preventDefault();
					
						var formData={
								'width' : $('input[name=width]').val(),
								'height' : $('input[name=height]').val()
						};
						
						$.ajax({
						    type: 'POST',
						    url: $('form').attr('action'),
						    data : formData,
						    dataType: 'json',
						    success: function(data){
						    	var jsonObj = JSON.parse(data);
						    	/* $('body').html(""); */
						    	$('body').append(jsonObj);
						    },//success
							error : function (xhr, status) {
								alert(xhr + " : " + status);
							}
						});
				});		
			}
		</script>
				
		<script>
			$(document).ready(function (){
				areaAjax2();
			});
		</script>
	</body>
</html>