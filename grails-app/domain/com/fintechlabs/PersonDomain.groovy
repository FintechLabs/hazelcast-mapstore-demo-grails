package com.fintechlabs

class PersonDomain {

    String firstName
    String lastName
    String emailAddress
    String phoneNumber
    String uniqueId = UUID.randomUUID().toString()
    Date dateCreated
    Date lastUpdated

}
