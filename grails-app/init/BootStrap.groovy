import com.fintechlabs.HazelCastConfigBean
import com.fintechlabs.PersonDomain
import org.apache.commons.lang.RandomStringUtils

class BootStrap {

    HazelCastConfigBean hazelCastConfigBean

    def init = { servletContext ->
        (0..19).each { num ->
            PersonDomain personDomain = new PersonDomain()
            personDomain.firstName = "Test"
            personDomain.lastName = "Person #${num + 1}"
            personDomain.phoneNumber = RandomStringUtils.randomNumeric(10)
            personDomain.emailAddress = "person${num + 1}@email.com"
            personDomain.save(flush: true)
        }
        hazelCastConfigBean.client.getMap("localizationMap").get(2L)
    }
    def destroy = {
    }
}
