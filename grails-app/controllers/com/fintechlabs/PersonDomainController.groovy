package com.fintechlabs

class PersonDomainController {

    HazelCastConfigBean hazelCastConfigBean

    def index = {
        def personMap = hazelCastConfigBean.client.getMap("personMap")
        List<Person> personList = []
        personMap.each { def key, def value ->
            personList << (value as Person)
        }
        [personList: personList]
    }

    def create = {}

    def save = {
        def personMap = hazelCastConfigBean.client.getMap("personMap")
        Person person = new Person()
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
        Person person = personMap.get(params.id) as Person
        [person: person]
    }

}
