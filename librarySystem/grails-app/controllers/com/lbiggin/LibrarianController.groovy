package com.lbiggin

class LibrarianController {

	def scaffold = Librarian

	def login(){

	}

	def validate(){

		def user = Librarian.findByUserName(params.username)

		if (user && user.password == params.password){

			session.user = user
			render view: 'home'

		}

		else {

			flash.message = "Invalid Username and Password"

			render view: 'login'

		}

	}

	def logout = {

		session.user = null

		redirect (uri:'/')

	}
}
