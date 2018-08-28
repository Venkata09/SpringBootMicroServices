package com.learn.AKKA_MapReduce.messages;


import java.util.List;


/**
 * @author vdokku
 */
public class MapData {

    private final List<WordCount> dataList;

    public List<WordCount> getDataList() {
        return dataList;
    }

    public MapData(List<WordCount> dataList) {
        this.dataList = dataList;
    }
}
