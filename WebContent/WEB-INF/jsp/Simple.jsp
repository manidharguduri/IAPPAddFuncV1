<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

function searchText() {

	alert('Hello');
	   var issue = {
	      "issueSummary" : "bhanu",
	      "clientCode" :"prasad"
	   }
	   $.ajax({
	      type: "GET",
	      contentType : 'application/json; charset=utf-8',
	      dataType : 'json',
	      url: "/save",
	      data: JSON.stringify(issue), // Note it is important
	      success :function(result) {
	       // do what ever you want with data
	     }
	  });
}

</script>


<script>
	jQuery(document).ready(function($) {
 
		$("#submit").click(function(){
			var employeeData = {};
			employeeData["id"] = $("#id").val();
			employeeData["firstName"] = $("#firstName").val();
			employeeData["lastName"] = $("#lastName").val();
			employeeData["age"] = $("#age").val();
			employeeData["salary"] = $("#salary").val();
			
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "postEmployee",
				data : JSON.stringify(employeeData),
				dataType : 'json',				
				success : function(data) {
					$('#processedData').html(JSON.stringify(data));
					$('#displayDiv').show();
				}
			});
		});
 
	});
</script>	
</html>