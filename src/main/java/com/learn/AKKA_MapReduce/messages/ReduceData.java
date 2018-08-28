package com.learn.AKKA_MapReduce.messages;


import java.util.HashMap;

/**
 * @author vdokku
 */
public class ReduceData {


    private final HashMap<String, Integer> reduceDataList;

    public HashMap<String, Integer> getReduceDataList() {
        return reduceDataList;
    }

    public ReduceData(HashMap<String, Integer> reduceDataList) {
        this.reduceDataList = reduceDataList;
    }
}
