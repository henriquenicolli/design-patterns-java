package com.example.demo.service;

import com.example.demo.event.Event;
import lombok.Data;

/**
 * This class represents the main class of all the sub-classes within the chain of responsibility
 */
@Data
public abstract class Handler {

    private String id;

    public Handler(String id) {
        this.id = id;
    }

    /**
     * This method checks if an event can be handled by that specific sub-class handler
     *
     * @param event the input event
     * @return true if the handler can handle the event, false otherwise
     */
    public abstract boolean canHandle(Event event);

    /**
     * This method handles and performs all the actions required by that specific handler
     * e.g. This method can generate one or more messages to queue towards the MQTT broker
     * e.g. This method can simply save into a DB event's information
     *
     * @param event the input event
     */
    public abstract void handle(Event event);

}
