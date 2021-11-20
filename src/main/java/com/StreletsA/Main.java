package com.StreletsA;

import com.StreletsA.infs.IMessage;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MessageViewer messageViewer = context.getBean("messageViewer", MessageViewer.class);

        Sender userA = context.getBean("sender", Sender.class);
        Sender userB = context.getBean("sender", Sender.class);

        userA.sendMessage("Hi!");
        userB.sendMessage("Hello!");

    }

}
