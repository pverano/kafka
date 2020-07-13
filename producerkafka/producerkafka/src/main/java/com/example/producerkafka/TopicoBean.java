package com.example.producerkafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TopicoBean {
    @Bean
    public NewTopic createTopic() {
        return new NewTopic("teste", 2, (short)1);
    }
}
