package com.kang.elk.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/index")
    public String hello() {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                logger.info("test "+ Instant.now());
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    logger.error("fail:",e);
                }
            }
        }).start();
        return "hello";
    }
}
