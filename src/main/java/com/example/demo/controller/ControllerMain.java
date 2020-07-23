package com.example.demo.controller;

import io.nats.client.Connection;
import io.nats.client.Nats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ControllerMain {
    private static final Logger LOG = LoggerFactory.getLogger(ControllerMain.class);
    @Autowired
    Connection nc;

    @GetMapping("/")
    public ResponseEntity<String> testin() throws IOException, InterruptedException {
        LOG.info("nats-called");
        nc.publish("hello","message coming".getBytes());
        return ResponseEntity.ok("okay");
    }
}
