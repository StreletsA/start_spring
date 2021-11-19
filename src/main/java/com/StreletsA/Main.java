package com.StreletsA;

import com.StreletsA.infs.Message;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MessageViewer messageViewer = context.getBean(
                "messageViewer",
                MessageViewer.class
        );

        Message adminMessage = context.getBean(
                "adminMessage",
                AdminMessage.class
        );

        Message systemMessage = context.getBean(
                "systemMessage",
                SystemMessage.class
        );

        Message userMessage = context.getBean(
                "userMessage",
                UserMessage.class
        );

        UserMessage userMessage2 = context.getBean(
                "userMessage",
                UserMessage.class
        );

        messageViewer.addMessage(adminMessage);
        messageViewer.addMessage(systemMessage);
        messageViewer.addMessage(userMessage);

        userMessage2.setSender("Bla-bla");

        messageViewer.addMessage(userMessage2);

        MainMessageViewer mainMessageViewer = context.getBean(
                "mainMessageViewer",
                MainMessageViewer.class
        );

        MainMessageViewer author = context.getBean(
                "authorMessageViewer",
                MainMessageViewer.class
        );

        author.showContent();

        mainMessageViewer.showContent();

    }

}
