package com.learn.AKKA_Remoting.messages;

import java.io.Serializable;

/**
 * @author vdokku
 */
public class GetRequest implements Serializable {

    private final String key;

    public GetRequest(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
