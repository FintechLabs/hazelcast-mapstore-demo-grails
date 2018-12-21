package com.fintechlabs

class PersonDomainController {

    HazelCastConfigBean hazelCastConfigBean

    def index = {
        def personMap = hazelCastConfigBean.client.getMap("personMap")
        List<com.fintechlabs.model.PersonDomainHazel> personList = []
        personMap.each { def key, def value ->
            personList << (value as com.fintechlabs.model.PersonDomainHazel)
        }
        [personList: personList]
    }

    def create = {}

    def save = {
        def personMap = hazelCastConfigBean.client.getMap("personMap")
        com.fintechlabs.model.PersonDomainHazel person = new com.fintechlabs.model.PersonDomainHazel()
        person.setFirstName(params.firstName)
        person.setLastName(params.lastName)
        person.setEmailAddress(params.emailAddress)
        person.setPhoneNumber(params.phoneNumber)
        person.setDateCreated(new Date())
        person.setLastUpdated(new Date())
        personMap.put(person.getUniqueId(), person)
        redirect(action: 'index')
    }

    def delete = {
        def personMap = hazelCastConfigBean.client.getMap("personMap")
        personMap.remove(params.id)
        redirect(action: 'index')
    }

    def show = {
        def personMap = hazelCastConfigBean.client.getMap("personMap")
        com.fintechlabs.model.PersonDomainHazel person = personMap.get(params.id) as com.fintechlabs.model.PersonDomainHazel
        [person: person]
    }

}
