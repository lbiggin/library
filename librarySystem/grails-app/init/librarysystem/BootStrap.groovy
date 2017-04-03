package com.lbiggin

class BootStrap {

    def init = { servletContext ->

/*def Systems = new Course(
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

def Adsetts = new Library(
buildingName: 'Adsetts Library',
address: 'Sheffield',
openingHours: '24 hours',
location: 'city',
studySpace: '500 PCs'
).save()

def Cantor = new Library(
buildingName: 'Cantor Library',
address: 'Sheffield',
openingHours: '7am - 9pm',
location: 'city',
studySpace: '100 PCs'
).save()

def TeresaMay = new Librarian(
name: 'Teresa May',
email: 'lib.one@gmail.co.uk',
office: 'The library',
userName: 'library1',
password: 'password',
telephone: '01142222222', 
library: Adsetts
).save()

def DonaldTrump = new Librarian(
name: 'DonaldTrump',
email: 'lib.too@gmail.co.uk',
office: 'The library office',
userName: 'library2',
password: 'password2',
telephone: '01142222223', 
library: Cantor
).save()

def LouiseBiggin = new Student(
name: 'Louise Biggin',
email: 'lou.b@gmail.com',
username: 'lbiggin',
password: 'password',
studentID: 'b5016549',
course: Systems,
library: Adsetts
).save()

def TracyBent = new Student(
name: 'Tracy Bent',
email: 'tracy.b@gmail.com',
username: 'tbent',
password: 'password',
studentID: 'b5021234',
course: Web,
library: Cantor
).save()

def ArtOfScreaming = new Book(
title: 'The Art of Screaming',
subject: 'How to scream well',
author: 'Manny Bianco',
isbn: '123456789',
dateBorrowed: new Date('01/01/2017'),
returnDate: new Date('02/02/2017'),
student: LouiseBiggin,
overdue: true,
library: Cantor
).save()

def Tanks = new Book(
title: 'Some Tanks',
subject: 'How to enjoy tanks',
author: 'Bernard Black',
isbn: '987654321',
dateBorrowed: new Date('02/02/2017'),
returnDate: new Date('28/03/2017'),
student: TracyBent,
overdue: false,
library: Adsetts
).save()

def LittleBookOfCalm = new BookReview(
book: ArtOfScreaming,
dateMade: new Date('01/02/2017'),
student: LouiseBiggin,
review: '''Not bad'''
).save()

def LittleBookOfTension = new BookReview(
book: Tanks,
dateMade: new Date('02/02/2017'),
student: TracyBent,
review: '''Its quite good'''
).save()*/

    }
    def destroy = {
    }
}
