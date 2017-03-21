package com.lbiggin

class BootStrap {

    def init = { servletContext ->

def MrsLibrary = new Librarian(
name: 'Mrs Library',
email: 'lib@lib.co.uk',
office: 'The library',
username: 'library1',
password: 'password',
telephone: '01142222222', 
library: 'Adsetts Library'
).save()

def MrLibrary = new Librarian(
name: 'Mr Library',
email: 'lib2@lib.co.uk',
office: 'The library office',
username: 'library2',
password: 'password2',
telephone: '01142222223', 
library: 'Cantor Library'
).save()

def Adsetts = new Library(
buildingName: 'Adsetts Library',
address: 'Sheffield',
openingHours: '24 hours',
location: 'city',
studySpace: '500'
).save()

def Cantor = new Library(
buildingName: 'Cantor Library',
address: 'Sheffield',
openingHours: '7am - 9pm',
location: 'city',
studySpace: '100'
).save()

def ArtOfScreaming = new Book(
title: 'The Art of Screaming',
subject: 'How to scream well',
author: 'Manny Bianco',
isbn: '123456789',
dateBorrowed: new Date('01/01/2017'),
returnDate: new Date('02/02/2017'),
student: 'Louise Biggin',
overdue: true
).save()

def Tanks = new Book(
title: 'Tanks',
subject: 'How to enjoy tanks',
author: 'Bernard Black',
isbn: '987654321',
dateBorrowed: new Date('02/02/2017'),
returnDate: new Date('23/03/2017'),
student: 'Tracy Bent',
overdue: false
).save()

def LittleBookOfCalm = new BookReview(
book: 'Little Book of Calm',
dateMade: new Date('01/02/2017'),
student: 'Louise Biggin',
review: '''Not bad'''
).save()

def LittleBookOfTanks = new BookReview(
book: 'Little Book of Tanks',
dateMade: new Date('02/02/2017'),
student: 'Tracy Bent',
review: '''Its quite good'''
).save()

def Systems = new Course(
title: 'Systems',
code: 'SYS345',
leader: 'Tonderai',
department: 'Computing',
description: '''2nd year Systems course''',
studyMode: 'full-time'
).save()

def Web = new Course(
title: 'Web',
code: 'WEB678',
leader: 'Jacky',
department: 'Computing',
description: '''2nd year Web course''',
studyMode: 'full-time'
).save()

def LouiseBiggin = new Student(
name: 'Louise Biggin',
email: 'lou.b@gmail.com',
username: 'lbiggin',
password: 'password',
studentID: 'b5016549',
course: 'computing'
).save()

def TracyBent = new Student(
name: 'Tracy Bent',
email: 'tracy.b@gmail.com',
username: 'tbent',
password: 'password',
studentID: 'b5021234',
course: 'computing'
).save()

    }
    def destroy = {
    }
}
