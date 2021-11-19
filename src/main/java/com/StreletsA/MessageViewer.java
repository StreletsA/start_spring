package com.StreletsA;

import com.StreletsA.infs.IMessageViewer;
import com.StreletsA.infs.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageViewer implements IMessageViewer {

    private List<Message> messages;

    public MessageViewer(){
        messages = new ArrayList<Message>();
    }

    @Override
    public void showContent() {
        System.out.println("******************************");
        for (Message message: messages) {
            System.out.println(message.getMessage());
        }
        System.out.println("******************************");
    }

    @Override
    public void addMessage(Message message) {
        messages.add(message);

        showContent();
    }
}
