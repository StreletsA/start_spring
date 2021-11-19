package com.StreletsA;

import com.StreletsA.infs.Message;

import java.util.Date;

public class SystemMessage implements Message {

    private String sender;
    private String content;
    private long date;

    public SystemMessage(String content){
        sender = "System";
        this.content = content;
        date = (new Date()).getTime();
    }

    @Override
    public String getContent() {
        return content;
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
