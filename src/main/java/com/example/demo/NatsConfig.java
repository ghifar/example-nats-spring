package com.example.demo;

import io.nats.client.Connection;
import io.nats.client.Nats;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class NatsConfig {

    @Bean
    public Connection conn() throws IOException, InterruptedException {
        return Nats.connect("nats://localhost:4222");
    }
}
