package com.example.demo.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by Bjørn Hjelle, Acando on 23.11.2017.
 */
public interface ConsumerChannels {

    String TESTTOPIC = "testTopic";
    @Input(TESTTOPIC)
    SubscribableChannel testChannel();

}
