package com.websocket.chatrealtime.models;

import java.time.LocalDateTime;

public class ChatMessage {
    private String from;
    private String content;
    private LocalDateTime timeStamp;

    public ChatMessage(String from, String content, LocalDateTime timeStamp) {
        this.from = from;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public ChatMessage() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
