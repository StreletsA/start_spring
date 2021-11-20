package com.StreletsA;

import com.StreletsA.infs.IMessage;
import com.StreletsA.infs.IViewer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InfoViewer implements IViewer {

    private List<IMessage> messages;

    public InfoViewer(){
        messages = new ArrayList<IMessage>();
    }

    @Override
    public void addMessage(IMessage message) {
        messages.add(message);
        showContent();
    }

    @Override
    public void showContent() {
        System.out.println("-------------------------------");
        for (IMessage message: messages) {
            System.out.println(message.getContent());
        }
        System.out.println("-------------------------------");
    }
}
