import com.fintechlabs.HazelCastConfigBean
import com.fintechlabs.messaging.ListenerOne

// Place your Spring DSL code here
beans = {
    hazelCastConfigBean(HazelCastConfigBean)

    listenerOne(ListenerOne, ref("hazelCastConfigBean"))
}
