package com.learn.Non_Spring_Works.impl;

import com.learn.Non_Spring_Works.Loopable;

/**
 * @author vdokku
 */
public class Loop implements Loopable {


    @Override
    public void call() {
        double value = Math.random();
        System.out.println(value);
    }
}
