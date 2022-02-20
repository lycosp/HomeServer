package com.lycos.server.controller;

import javax.websocket.server.PathParam;

import com.google.gson.Gson;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHello(@PathParam(value = "name") String name) {
        return new Gson().toJson(String.format("Hello %s!", name));
    }
}
