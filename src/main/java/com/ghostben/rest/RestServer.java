package com.ghostben.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author : ben.zhang.b.q
 * @date : 2018/10/10 16:02
 * package   : com.ghostben.rest
 * description : ${DESC}
 **/
@Path("/restserver")
public class RestServer {
  /*  @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String serverMessageText() {
        return "This is a message from the server";
    }
    @GET
    @Produces(MediaType.TEXT_XML)
    public String serverMessageXML() {
        return " This is a message from the server ";
    }*/

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String serverMessageJSON() {
        return "[{’message’ : ’server json message’, ’content’ : ’message content}]";
}

}
