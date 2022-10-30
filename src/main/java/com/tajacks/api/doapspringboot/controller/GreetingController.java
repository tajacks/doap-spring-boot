package com.tajacks.api.doapspringboot.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;

@RestController
public class GreetingController {

    private final BiFunction<String, String, String> addSuffix = (s, y) -> s + " " + y;

    private final List<String> greetings = List.of(
            "Hello",
            "Howdy",
            "Hi",
            "Hey",
            "Hiya",
            "Ahoy",
            "Sup",
            "Yo"
    );

    private final List<String> greetingSuffixes = List.of(
            "friend",
            "!",
            ":(",
            "again",
            "pal",
            "partner",
            "buddy",
            "dude"
    );

    @GetMapping (path = "/greeting", produces = MediaType.TEXT_PLAIN_VALUE)
    public String greet() {
        return addSuffix.apply(getGreeting(), getSuffix());
    }

    private String getGreeting() {
        return greetings.get(new Random().nextInt(0, greetings.size()));
    }

    private String getSuffix() {
        return greetingSuffixes.get(new Random().nextInt(0, greetingSuffixes.size()));
    }
}
