package com.example.demo.service;

import com.example.demo.event.Event;
import com.example.demo.event.EventC;
import org.springframework.stereotype.Service;

@Service
public class EventCHandler extends Handler {

    private static final String EVENT_C_ID = "EVENT_C";

    public EventCHandler() {
        super(EVENT_C_ID);
    }

    @Override
    public boolean canHandle(Event event) {
        return event instanceof EventC;
    }

    @Override
    public void handle(Event event) {
        System.out.println("handled event C");
    }

}
