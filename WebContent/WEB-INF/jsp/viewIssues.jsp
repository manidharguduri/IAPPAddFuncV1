<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<html>
<head>
<title>This is for MAIssueTracking Development</title>
<spring:url value="/project/css/materialize_pine.css"
	var="materializeCss" />
<link href="${materializeCss}" rel="stylesheet" />

<%@ include file="/WEB-INF/jsp/navbar.jsp"%>


<spring:url value="/project/js/jquery.min.js" var="jQueryJS" />
<spring:url value="/project/js/materialize_pine.js" var="materializeJS" />
<spring:url value="/project/js/navbar.js" var="navbarJS" />
<spring:url value="/project/js/collapsible.js" var="collapsibleJS" />

<script src="${jQueryJS}"></script>
<script src="${materializeJS}"></script>
<script src="${navbarJS}"></script>
<script src="${collapsibleJS}"></script>




<script type="text/javascript">
	var len=0;
	var endindexval =0;
	var sindexval = 0;
	var upperlimit=0;
	function searchText() {
		
		sindexval = parseInt(document.getElementById("fetchvalueid").value);
		endindexval = sindexval+10;
		document.getElementById("fetchvalueid").value=endindexval;
		$.ajax({
			type : "GET",
			contentType : 'application/json; charset=utf-8',
			url : "getAJAXIssueList",
			data: {sindex:sindexval,endindex:endindexval},
			success : function(response) {
				var json = JSON.parse(JSON.stringify(response));
				display(json);
			}
		});


		
	}
	function display(data) {
		var contenttrielen = data.length;
		if(contenttrielen<10)
			{
			if(upperlimit==0){
			upperlimit=sindexval+parseInt(contenttrielen);
			}
			document.getElementById("fetchvalueid").value=upperlimit;
			}
		
		
		for (i = 0; i < data.length; i++) {
			var item2 = '<ul class="collapsible" data-collapsible="expandable">';
			item2 = item2 + '<li>';
			item2 = item2 + '<div class="collapsible-header">';
			item2 = item2 + '<i class="material-icons">add</i>Third:';
			item2 = item2 + data[i].clientCode;
			item2 = item2 + '</div>';
			item2 = item2 + '<div class="collapsible-body"><p>';
			item2 = item2 + data[i].issueSolution;
			item2 = item2 + '</p></div>';
			item2 = item2 + '</li>';
			item2 = item2 + '</ul>';
			this.$('.collapsible').collapsible();
			$("#reloadme").append(item2);
			}

		
		
	}


	$(function() {
		$(window)
				.scroll(
						function() {
							var docElement = $(document)[0].documentElement;
							var winElement = $(window)[0];

							if ((docElement.scrollHeight - winElement.innerHeight) == winElement.pageYOffset) {
								searchText();
							}
						});
	});

	
</script>
<style>
</style>

</head>

<body>
	<input type="hidden" id ="fetchvalueid" name="fetchvaluename" value ="<%= session.getAttribute("datafetched") %>"/>
	<div class="container">

		<div class="col s12 m6">
			<div class="card ">

				<div class="card-content">
					<span class="card-title">Issues found</span>




					<c:if test="${not empty listsofIssues}">
						<c:forEach var="listValue" items="${listsofIssues}">


							<ul class="collapsible" data-collapsible="expandable">

								<li>
									<div class="collapsible-header">
										<i class="material-icons">add</i>Third:${listValue.clientVersion}:${listValue.issueSolution}
									</div>
									<div class="collapsible-body">
										<p>${listValue.issueSolution}</p>
									</div>
								</li>
							</ul>


						</c:forEach>

					</c:if>
					<div id="reloadme"></div>
	

					<div class="row">

						<div class="input-field col s12">
							<button class="btn waves-effect waves-light "
								onclick="searchText();" id="onsubmit">
								Submit <i class="material-icons right">send</i>
							</button>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>
