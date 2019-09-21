package com.mazuryk.spring.core.event;

import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class MessageEvent extends ApplicationEvent {

    private String message;
    private static AtomicInteger messageCounter = new AtomicInteger();

    public MessageEvent(String message) {
        super(message);
        this.message = generateMessage(message);
    }

    public String getMessage() {
        return message;
    }

    private String generateMessage(String message){

        StringBuilder builder = new StringBuilder();
        builder.append("| INFO |")
                .append(Calendar.getInstance().getTime())
                .append(" | ")
                .append("Message Sequences | ")
                .append(messageCounter.getAndIncrement())
                .append("|")
                .append(message);
        return builder.toString();
    }
}
