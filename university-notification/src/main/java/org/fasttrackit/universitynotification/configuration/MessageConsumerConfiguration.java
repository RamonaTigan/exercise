package org.fasttrackit.universitynotification.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConsumerConfiguration {
    @Bean
    public Queue hello() {
        return new Queue("queue-01");
    }
}
