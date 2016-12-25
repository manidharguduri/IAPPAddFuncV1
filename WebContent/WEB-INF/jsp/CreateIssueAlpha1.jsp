<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>



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

<script src="${jQueryJS}"></script>
<script src="${materializeJS}"></script>
<script src="${navbarJS}"></script>

<style>
</style>

<script>
	$(document).ready(function(e) {

		$("#tec").click(function(e) {
			$("#fileip").show();
		});

		$("#fun").click(function(e) {

			$("#fileip").hide();

		});

		$('select').material_select();
	});
</script>
</head>

<body>
	<div class="container">

		<div class="col s12 m6">
			<div class="card grey lighten-4">
				<div class="card-content">
					<form:form class="col s6" id="saveIssue" action="save"
						modelAttribute="issue">
						<!-- form class="col s6" >-->



						<div class="card-content">
							<span class="card-title">Log an Issue</span>


							<div class="row">
								<div class="input-field col s12">
									<input id="issueSummaryid" type="text" class="validate"
										name="issueSummary"> <label for="IssueSummaryid">Issue
										Summary</label>
								</div>
							</div>

							<div class="row">

								<div class="input-field col s6">
									<select name="clientVersion" id="clientVersionid">
										<option value="1">Select Versions</option>
										<option value="2016">2016</option>
										<option value="2015">2015</option>
										<option value="2014">2014</option>
									</select>
								</div>
								<div class="input-field col s6">
									<input id="clientcodeid" type="text" class="validate"
										name="clientCode"> <label for="clientcodeid">Client
										code</label>
								</div>
							</div>
							<div class="row">
								<div class="input-field col s12">
									<textarea id="issueDescriptionid" name="issueDescription" 
										class="materialize-textarea"></textarea>
									<label for="issueDescriptionid">Issue Description</label>
								</div>
							</div>


							<div class="row">

								<div class="input-field col s6">
									<select name="issueType" id="issueTypeid">
										<option value="1">Select IssueType</option>
										<option value="Technical">Technical</option>
										<option value="Functional">Functional</option>
										<option value="TechnoFunctional">TechnoFunctional</option>
									</select>
								</div>
							</div>

							<div class="row">

								<div class="input-field col s12">
									<textarea id="issueSolutionid" class="materialize-textarea"
										name="issueSolution"></textarea>
									<label for="issueSolutionid">Solution</label>
								</div>
							</div>

							<div class="row">

								<div class="input-field col s12">
									<button class="btn waves-effect waves-light " type="submit"
										name="action" id="onsubmit">
										Submit <i class="material-icons right">send</i>
									</button>
								</div>
							</div>

						</div>



					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
