package com.learn.AKKA_WithSpring.messages;

/**
 * @author vdokku
 */
public class LineProcessingResult {

    private String ipAddress;

    public LineProcessingResult(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }
}
