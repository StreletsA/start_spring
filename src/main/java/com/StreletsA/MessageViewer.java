package com.StreletsA;

import com.StreletsA.infs.IMessage;
import com.StreletsA.infs.IViewer;
import com.StreletsA.infs.IMessage;
import com.StreletsA.infs.IViewer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MessageViewer implements IViewer {

    private List<IMessage> messages;

    public MessageViewer(){
        messages = new ArrayList<IMessage>();
    }

    @Override
    public void showContent() {
        System.out.println("******************************");
        for (IMessage message: messages) {
            System.out.println(message.getContent());
        }
        System.out.println("******************************");
    }

    @Override
    public void addMessage(IMessage message) {
        messages.add(message);

        showContent();
    }
}
