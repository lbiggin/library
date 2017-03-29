package com.lbiggin

class Library {

String buildingName
String address
String openingHours
String location
String studySpace

static hasMany=[books:Book, libraries:Librarian, students:Student]

    static constraints = {

buildingName blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpace blank:false, nullable:false

    }
}
