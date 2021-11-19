package com.StreletsA;

import com.StreletsA.infs.IMainMessageViewer;
import com.StreletsA.infs.IMessageViewer;
import com.StreletsA.infs.Message;
import com.StreletsA.infs.Viewer;

public class MainMessageViewer implements IMainMessageViewer {

    private Message mainMessage;

    @Override
    public void setMainMessage(Message message){
        mainMessage = message;
    }

    @Override
    public void showContent() {
        if (mainMessage != null){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(mainMessage.getContent());
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
