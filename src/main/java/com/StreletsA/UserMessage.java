package com.StreletsA;

import com.StreletsA.infs.Message;

import java.util.Date;

public class UserMessage implements Message {

    private String sender;
    private String content;
    private long date;

    public UserMessage(String sender, String content){
        this.sender = sender;
        this.content = content;
        date = (new Date()).getTime();
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getMessage() {
        return String.valueOf(date) + " : " + sender + " -> " + content;
    }

    @Override
    public long getDate() {
        return date;
    }
}
