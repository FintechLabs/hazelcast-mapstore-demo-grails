package com.fintechlabs.messaging

import com.fintechlabs.HazelCastConfigBean
import com.hazelcast.core.ITopic
import com.hazelcast.core.Message
import com.hazelcast.core.MessageListener

class ListenerOne implements MessageListener {

    HazelCastConfigBean hazelCastConfigBean
    ITopic topic

    public ListenerOne(HazelCastConfigBean hazelBean) {
        this.hazelCastConfigBean = hazelBean
        this.topic = this.hazelCastConfigBean.client.getTopic("ListenerOne")
        this.topic.addMessageListener(this)
    }

    void publishMessage(Object message) {
        this.topic.publish(message)
    }

    @Override
    void onMessage(Message message) {
        Thread.sleep(5000)
        println("**************             Listener One            *****************   ${message.messageObject.toString()}")
    }

}
