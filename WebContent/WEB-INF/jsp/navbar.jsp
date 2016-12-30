

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>

<head>
<title>User Form</title>

<!--Import Google Icon Font-->
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<body class="grey lighten-3">

	<!-- Materialize core JavaScript -->
	<!-- Placed at the end of the document so the pages load faster -->
	<header>
		<nav class="light-blue lighten-1" role="navigation">
			<div class="nav-wrapper container">
				<a href="#" class="brand-logo">Issue Tracking</a>
				<ul class="right hide-on-med-and-down">
					<li><a href="getIssues" >Search<i class="material-icons left">search</i></a>
					</li>
					<li><a href="reportAnIssue">Report Issue<i class="material-icons left">add</i></a>
					</li>
					<li>
						<ul id="dropdown1" class="dropdown-content">
							<li><a href="#!">Edit Profile</a></li>
							<li><a href="#!">View Profile</a></li>
							<li><a href="#!">Change Password</a></li>
							<li class="divider"></li>
							<li><a href="#!">Sign Out</a></li>
						</ul> <a class="dropdown-button" href="#!" data-activates="dropdown1" data-beloworigin="true">Profile<i
							class="material-icons right">arrow_drop_down</i>
					</a>
					</li>
				</ul>
				<ul id="nav-mobile" class="side-nav">
					<li><a class="waves-effect waves-teal" href="#">Search<i
							class="material-icons left">search</i></a></li>
					<li><a class="waves-effect waves-teal" href="#">Report
							Issue<i class="material-icons left">add</i>
					</a></li>
					<li class="no-padding">
						<ul class="collapsible collapsible-accordion">
							<li class="bold active"><a
								class="collapsible-header waves-effect waves-teal">Profile</a>
								<div class="collapsible-body" style="display: block;">
									<ul>
										<li><a class="waves-effect waves-teal" href="#parallax">Edit
												Profile</a></li>
										<li><a class="waves-effect waves-teal" href="#grid">View
												Profile</a></li>
										<li><a class="waves-effect waves-teal" href="#shadows">Change
												Password</a></li>
										<li class="divider"></li>
										<li><a class="waves-effect waves-teal" href="#shadows">Sign
												Out</a></li>
									</ul>
								</div></li>
						</ul>
					</li>
				</ul>
				<a href="#" data-activates="nav-mobile" class="button-collapse"><i
					class="material-icons">menu</i></a>
			</div>
		</nav>
	</header>


</body>

</html>