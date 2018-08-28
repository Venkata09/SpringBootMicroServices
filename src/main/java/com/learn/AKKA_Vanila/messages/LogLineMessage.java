package com.learn.AKKA_Vanila.messages;

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
