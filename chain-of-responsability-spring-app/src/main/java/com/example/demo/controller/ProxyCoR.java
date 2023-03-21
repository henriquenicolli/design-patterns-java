package com.example.demo.controller;

import com.example.demo.config.HandlersChain;
import com.example.demo.event.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events-handler")
public class ProxyCoR {

    /**
     * @see HandlersChain
     */
    private HandlersChain handlersChain;

    public ProxyCoR(final HandlersChain handlersChain) {
        this.handlersChain = handlersChain;
    }

    /**
     * This method represents the main entry point for each event to be processed.
     * The event has to be checked by all the handler in the chain of the responsibility.
     * Each handler is responsible for that event basing on specific rules defined into the canHandle(Event event) method
     * in each handler.
     *
     * @param event the input event to be processed
     * @return the method returns a positive/negative ACK because of preliminary checks
     */
    @PostMapping
    public ResponseEntity<?> handleEvents(@RequestBody Event event) {

        handlersChain.getChain()
                .stream()
                .filter(handler -> handler.canHandle(event))
                .forEach(handler -> handler.handle(event));

        return ResponseEntity.ok().build();

    }

}