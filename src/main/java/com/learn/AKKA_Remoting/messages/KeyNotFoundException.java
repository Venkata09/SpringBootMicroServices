package com.learn.AKKA_Remoting.messages;

import java.io.Serializable;

/**
 * @author vdokku
 */
public class KeyNotFoundException extends Exception implements Serializable {

    private final String key;

    public KeyNotFoundException(String key) {
        this.key = key;
    }
}
