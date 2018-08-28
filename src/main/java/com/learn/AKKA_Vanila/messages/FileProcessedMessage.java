package com.learn.AKKA_Vanila.messages;

import java.util.Map;

/**
 * @author vdokku
 */
public class FileProcessedMessage {

    private Map<String, Long> data;

    public FileProcessedMessage(Map<String, Long> data) {
        this.data = data;
    }

    public Map<String, Long> getData() {
        return data;
    }
}
