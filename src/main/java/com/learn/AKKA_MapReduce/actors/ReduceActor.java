package com.learn.AKKA_MapReduce.actors;

import akka.actor.UntypedActor;
import com.learn.AKKA_MapReduce.messages.MapData;
import com.learn.AKKA_MapReduce.messages.ReduceData;
import com.learn.AKKA_MapReduce.messages.WordCount;

import java.util.HashMap;
import java.util.List;

/**
 * @author vdokku
 */
public class ReduceActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof MapData) {
            MapData mapData = (MapData) message;
            // reduce the incoming data and forward the result to Master actor
            getSender().tell(reduce(mapData.getDataList()), getSelf());
        } else {
            unhandled(message);
        }
    }

    private ReduceData reduce(List<WordCount> dataList) {
        HashMap<String, Integer> reducedMap = new HashMap<String, Integer>();
        for (WordCount wordCount : dataList) {
            if (reducedMap.containsKey(wordCount.getWord())) {
                Integer value = (Integer) reducedMap.get(wordCount.getWord());
                value++;
                reducedMap.put(wordCount.getWord(), value);
            } else {
                reducedMap.put(wordCount.getWord(), Integer.valueOf(1));
            }
        }
        return new ReduceData(reducedMap);
    }

}