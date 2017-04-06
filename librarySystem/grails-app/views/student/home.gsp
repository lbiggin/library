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

		<h3>Book Reviews</h3>

	<p>This section allows you to add a new book review and list all of the book reviews currently stored in the system</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="bookReview" action="create">Add New Book Review</g:link>

		</button>

		<button type="button" class="btn btn-success">
	
			<g:link controller="bookReview" action="index">List All Book Reviews</g:link>

		</button>

	</div>




	<div class="second">

	<h3>Books</h3>

	<p>This section allows you to list all of the books currently stored in the system</p>


		
		<button type="button" class="btn btn-success">
	
			<g:link controller="book" action="index">List All Books</g:link>

		</button>

	</div>

	



	<div class="third">

		<h3>Advanced Book Search</h3>

		<p>Search for books by title, subject, and/or author</p>

		<button type="button" class="btn btn-success">
	
			<g:link controller="book" action="advSearch">Advanced Book Search</g:link>

		</button>

	</div>

	

</div>
</div>
</body>
</html>
