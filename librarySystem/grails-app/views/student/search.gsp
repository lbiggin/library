<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Welcome to the Library System</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css" />
</head>
<body>

<div class="row">
	<h1>Student Search Facility</h1>
	<formset>
		<legend>Student Search</legend>
		<g:form action="results">
			<label for="name">Student Name</label>
			<g:textField name="name"/>
			<g:submitButton name="search" value="search"/>
		</g:form>
	</formset>
</div>
</body>
</html>
