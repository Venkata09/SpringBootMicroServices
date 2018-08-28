package com.learn.AKKA_WithSpring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author vdokku
 */

@Service
public class FileReadService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void doStuff(Object o) {
        logger.info("Sample service doing stuff with: {}", o);
    }

}
