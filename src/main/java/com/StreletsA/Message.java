package com.StreletsA;

import com.StreletsA.infs.IMessage;
import com.StreletsA.infs.ISender;
import org.springframework.stereotype.Component;

import java.util.Date;

public class Message implements IMessage {

    private String content;
    private ISender sender;
    private long date;

    public Message(String content){
        this.content = content;
        this.date = (new Date()).getTime();
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public ISender getSender() {
        return sender;
    }

    @Override
    public long getDate() {
        return date;
    }
}
