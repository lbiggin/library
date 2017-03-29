package com.lbiggin

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void dateType() {

	when: "A Book has title and dateBorrowed"
	def Tanks=new Book(title: 'Tanks', dateBorrowed: new Date('02/02/2017'))

	then: "The dateType method will return the date"
	
	Tanks.dateType()==new Date ('02/02/2017')


    }
}
