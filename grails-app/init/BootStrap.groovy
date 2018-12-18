import com.fintechlabs.PersonDomain
import org.apache.commons.lang.RandomStringUtils

class BootStrap {

    def init = { servletContext ->
        (0..9).each { num ->
            PersonDomain personDomain = new PersonDomain()
            personDomain.firstName = "Test"
            personDomain.lastName = "Person #${num + 1}"
            personDomain.phoneNumber = RandomStringUtils.randomNumeric(10)
            personDomain.emailAddress = "person${num + 1}@email.com"
            personDomain.save(flush: true)
        }
    }
    def destroy = {
    }
}
