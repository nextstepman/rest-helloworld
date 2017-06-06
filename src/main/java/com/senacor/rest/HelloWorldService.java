package com.senacor.rest;

import javax.ws.rs.*;

/**
 * The classic hello world, as rest service
 */
@Path("/v1")
public class HelloWorldService {
  /**
   * Get back a greeting
   * @param name
   * @return
   */
  @Path("/greet")
  @GET
  @Produces("text/plain")
  public String greeting(@QueryParam("name") String name) {
    // Return some cliched textual content
    return "Hello " + name;
  }
}
