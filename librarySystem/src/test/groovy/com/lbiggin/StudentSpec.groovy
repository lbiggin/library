package com.lbiggin

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

        void emailFormat(){
	when:"A Student has email"
	def LouiseBiggin=new Student(email: 'lou.b@gmail.com')
	then:"The emailFormat method will check the email format"
	LouiseBiggin.emailFormat()=='lou.b@gmail.com'

    }
}
