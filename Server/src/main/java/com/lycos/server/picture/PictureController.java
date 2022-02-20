package com.lycos.server.picture;

import javax.websocket.server.PathParam;

import com.google.gson.Gson;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class PictureController {

    private final PictureService SERVICE = new PictureService();

    @GetMapping(value = "pictures")
    public String getPictures() {
        return new Gson().toJson(SERVICE.getPictures());
    }

    @GetMapping(value = "picture")
    public String getPicture(@PathParam(value = "id") int id) {
        return new Gson().toJson(SERVICE.getPicture(id));
    }
}
