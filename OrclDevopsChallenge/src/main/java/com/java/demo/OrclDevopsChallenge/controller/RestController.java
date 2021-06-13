package com.java.demo.OrclDevopsChallenge.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.java.demo.OrclDevopsChallenge.service.FibonacciService;

@Path("/api")
public class RestController {
	
	@GET
	@Path("/helloWorld")
    public Response simpleHelloWorld() {
        return Response.ok("Hello World!!!").build();
    }
	
	@GET
    @Path("/fibonacci/{range}")
    public Response getFibonacciSeries(@PathParam("range") Integer range) {
        if (range != null && !(range<1 || range>100))
            return Response.ok(FibonacciService.getFibonacciSeries(range), MediaType.APPLICATION_JSON).build();
        else
            return Response.status(Status.BAD_REQUEST).entity("Invalid Range for Fibonacci Series").build();
    }
	
}
