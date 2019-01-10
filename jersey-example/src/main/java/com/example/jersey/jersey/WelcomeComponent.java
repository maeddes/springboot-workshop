package com.example.jersey.jersey;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

@Component
@Path("test")
public class WelcomeComponent {

    @GET
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Path("/hello")
    public ResponseEntity getWelcomeMessage() {
        return ResponseEntity.ok("hello");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Path("/{value}")
    public ResponseEntity getValueMessage(@PathParam("value") String value) {
        return ResponseEntity.ok(value);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Path("/hello")
    public ResponseEntity postWelcomeMessage() {
        return ResponseEntity.ok("hello");
    }
}
