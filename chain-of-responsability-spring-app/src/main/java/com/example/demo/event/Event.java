package com.example.demo.event;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.stereotype.Component;

/**
 * This class represents a generic event.
 * It is used to create a unique entry point to process incoming events
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
@Component
public abstract class Event {
}