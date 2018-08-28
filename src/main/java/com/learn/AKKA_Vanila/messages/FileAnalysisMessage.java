package com.learn.AKKA_Vanila.messages;

/**
 * @author vdokku
 */
public class FileAnalysisMessage {
    private String fileName;

    public FileAnalysisMessage(String file) {
        this.fileName = file;
    }

    public String getFileName() {
        return fileName;
    }
}
