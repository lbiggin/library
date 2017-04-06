package com.lbiggin

class StudentController {

    def scaffold = Student
    
	
	def login(){

	}

	def validate(){

		def user = Student.findByUsername(params.username)

		if (user && user.password == params.password){

			session.user = user
			session.role = 'student'
			render view: 'home'
		}

		else {

			flash.message = "Invalid Username and Password"

			render view: 'login'
		}

	}

	def logout = {

		session.user = null
		session.role = null
		redirect (uri:'/')
	}




	def search(){
	
	}
	def results(String name){
		def students=Student.where{
			name=~name
		}.list()
		return [students:students,
		term:params.name,
		totalStudents:Student.count()]
	}

	def advSearch() {
	
	}
	
	def advResults() {
	def studentProps = Student.metaClass.properties*.name
	def students = Student.withCriteria {
	"${params.queryType}" {
	params.each { field, value ->
	if (studentProps.grep(field) && value) {
	ilike(field, value)
	}
	}
	}
	}
	[ students : students ]
	}
}
