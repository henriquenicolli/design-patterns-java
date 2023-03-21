package com.example.demo.config;

import com.example.demo.service.Handler;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * This class represents the configuration class responsible of the creation of the Chain of Responsibility
 * The list is formed by each subclass of Handler class
 *
 * @see Handler
 */
@Configuration
@Data
public class HandlersChain {

    private List<Handler> chain;

    public HandlersChain(final List<Handler> chain) {
        this.chain = chain;
    }

}
