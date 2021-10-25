package org.fasttrackit.ro.fasttrackit.university.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
    @Bean
    public Queue message() {
        return new Queue("queue-01");
    }
// TODO
     // @Bean
     //  public Tut1Sender sender() {
     //   return new Tut1Sender();}
}
