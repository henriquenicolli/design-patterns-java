package com.example.demo.service;

import com.example.demo.event.Event;
import com.example.demo.event.EventA;
import org.springframework.stereotype.Service;

@Service
public class EventAHandler extends Handler {

    private static final String EVENT_A_ID = "EVENT_A";

    public EventAHandler() {
        super(EVENT_A_ID);
    }

    @Override
    public boolean canHandle(Event event) {
        return event instanceof EventA;
    }

    @Override
    public void handle(Event event) {
        System.out.println("handled event A");
    }

}
