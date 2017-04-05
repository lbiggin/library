<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Welcome to the Library System</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css" />
</head>
<body>

	<div id="content" role="main">

	<div class="row">

	<div class="first">

		<h3>Books</h3>

	<p>This section allows you to search through all the books recorded in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="book" action="create">Books</g:link>

		</button>

	</div>

	

	

	
	<div class="second">

		<h3>Courses</h3>

	<p>This section allows you to search through all the courses recorded in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="course" action="create">Courses</g:link>

		</button>

	</div>

	

	<div class="first">

		<h3>Librarians</h3>

	<p>This section allows you to search through all the librarians recorded in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="librarian" action="create">Librarians</g:link>

		</button>

	</div>





<div class="second">

		<h3>Students</h3>

		<p>This section allows you to search through all the students recorded in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="student" action="create">Students</g:link>

		</button>

	</div>









	<div class="third">

		<h3>Advanced Student Search</h3>

		<p>Search for Students by Name, Username, and/or Student ID</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="student" action="advSearch">Advanced Student Search</g:link>

		</button>

	</div>

	

</div>
</div>
</body>
</html>
