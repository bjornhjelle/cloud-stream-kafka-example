package com.example.demo.config;

import com.example.demo.listeners.TestTopicListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bjørn Hjelle, Acando on 13.12.2017.
 */
@Configuration
public class BeanConfig {

    @Bean
    public TestTopicListener testListener() {
        return new TestTopicListener();
    }

}
