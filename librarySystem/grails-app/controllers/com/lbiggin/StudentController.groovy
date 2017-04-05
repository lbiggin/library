package com.lbiggin

class StudentController {

    def scaffold = Student
    
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
