package com.lbiggin

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

        void nameSize(){
	
	when:"A Librarian has name"
	def DonaldTrump=new Librarian(name:'DonaldTrump')
	then: "The nameSize method will check the size of the name"
	DonaldTrump.nameSize()=='DonaldTrump'

    }
}
