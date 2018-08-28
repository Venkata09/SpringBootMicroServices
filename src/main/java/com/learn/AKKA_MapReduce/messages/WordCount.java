package com.learn.AKKA_MapReduce.messages;

/**
 * @author vdokku
 */
public final class WordCount {


    private final String word;
    private final Integer count;
    public WordCount(String inWord, Integer inCount) {
        this.word = inWord;
        this.count = inCount;
    }

    public String getWord() {
        return this.word;
    }

    public Integer getCount() {
        return count;
    }

}
