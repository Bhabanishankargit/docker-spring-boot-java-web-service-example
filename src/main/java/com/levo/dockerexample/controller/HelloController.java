package com.levo.dockerexample.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker-java-app")
public class HelloController {

    // REST Controller Method (Place your customized message here)
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        // Return a customized message
        return "Hello,Roopa!!-docker-java-app is up and running: " + new Date();
    }

    // Additional Method (You can add more endpoints for different messages or images)
    @RequestMapping(value = "/custom-message", method = RequestMethod.GET)
    public String customMessage() {
        // Return another customized message
        return "Hello Bhabani!! at: " + new Date();
    }

    // Additional Method to Serve Images (Place your image URL here)
    @RequestMapping(value = "/image", method = RequestMethod.GET, produces = "image/png")
    public byte[] getImage() {
        // Load and return an image
        InputStream in = getClass().getResourceAsStream("/static/images/logo.png");
        return IOUtils.toByteArray(in);
    }
}
