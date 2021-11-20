package com.StreletsA;

import com.StreletsA.infs.IMessage;
import com.StreletsA.infs.ISender;
import com.StreletsA.infs.IViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender implements ISender {

    private IViewer viewer;

    @Autowired
    public Sender(IViewer viewer){
        this.viewer = viewer;
    }

    @Override
    public void sendMessage(String content) {
        viewer.addMessage(new Message(content));
    }
}
