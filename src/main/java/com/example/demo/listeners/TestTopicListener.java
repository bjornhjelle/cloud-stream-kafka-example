package com.example.demo.listeners;

import com.example.demo.avro.AvroMessage;
import com.example.demo.channels.ConsumerChannels;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Created by Bjørn Hjelle, Acando on 23.11.2017.
 */

public class TestTopicListener {

    @StreamListener(ConsumerChannels.TESTTOPIC)
    public void receiveEvent(AvroMessage event) {
        System.out.println("Got event with id: " + event.getId());
    }
}