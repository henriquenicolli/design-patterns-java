package com.example.demo.service;

import com.example.demo.event.Event;
import com.example.demo.event.EventB;
import org.springframework.stereotype.Service;

@Service
public class EventBHandler extends Handler {

    private static final String EVENT_B_ID = "EVENT_B";

    public EventBHandler() {
        super(EVENT_B_ID);
    }

    @Override
    public boolean canHandle(Event event) {
        return event instanceof EventB;
    }

    @Override
    public void handle(Event event) {
        System.out.println("handled event B");
    }

}
