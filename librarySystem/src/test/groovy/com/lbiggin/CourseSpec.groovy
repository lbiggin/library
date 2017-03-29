package com.lbiggin

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {

        when: "A course has title, leader and department"
	def systems=new Course(title: 'systems', leader: 'Tonderai', department: 'computing')
	then: "The toString method will merge them"
	systems.toString()=='systems, Tonderai, computing'
    }
}
