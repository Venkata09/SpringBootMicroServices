package com.learn.AKKA_WithSpring.messages;

/**
 * @author vdokku
 */
public class LogLineMessage {

    private String data;

    public LogLineMessage(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
