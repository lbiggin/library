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

	<p>This section allows you to add a new book and list all of the book reviews currently stored in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="book" action="create">Add New Books</g:link>

		</button>

		<button type="button" class="btn btn-success">
	
			<g:link controller="book" action="index">List All Books</g:link>

		</button>

	</div>

	

	

	
	<div class="second">

		<h3>Courses</h3>

	<p>This section allows you to add a new course and list all of the courses currently stored in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="course" action="create">Add New Courses</g:link>

		</button>

		<button type="button" class="btn btn-success">
	
			<g:link controller="course" action="index">List All Courses</g:link>

		</button>

	</div>

	

	<div class="first">

		<h3>Librarians</h3>

	<p>This section allows you to add a new librarian and list details of all of the librarians currently stored in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="librarian" action="create">Add New Librarian</g:link>

		</button>

		<button type="button" class="btn btn-success">
	
			<g:link controller="librarian" action="index">List All Librarians</g:link>

		</button>

	</div>





<div class="second">

		<h3>Students</h3>

		<p>This section allows you to add a new student and list all of the students currently stored in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="student" action="create">Add New Student</g:link>

		</button>

		<button type="button" class="btn btn-success">
	
			<g:link controller="student" action="index">List All Students</g:link>

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
