package com.lbiggin

class Librarian {

String name
String email
String office
String userName
String password
String telephone
Library library

/* Text representation on app */
String toString(){

"$name, $library"

}

/* unit test */
String nameSize(){

"$name"

}


    static constraints = {

name blank:false, nullable:false, minSize:5, maxSize:20
email blank:false, nullable:false, email:true
office blank:false, nullable:false
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false
telephone blank:false, nullable:false
library blank:false, nullable:false

    }
}
