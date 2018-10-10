package com.ghostben.vaadin.rest;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author : ben.zhang.b.q
 * @date : 2018/10/10 16:30
 * package   : com.ghostben.vaadin.rest
 * description : Rest客户daunt
 **/
public class RestClient{
    ClientConfig config;
    Client client;
    WebTarget webtarget;
    public RestClient(){
        config = new ClientConfig();
        client = ClientBuilder.newClient(config);
        webtarget = client.target("https://localhost:8080");
    }

    public String getResponse(){
        String response = webtarget.path("").
                path("").
                request().
                accept(MediaType.TEXT_PLAIN).
                get(Response.class).toString();
        return response;
    }

    public String getAnswerText(){
        String answer =
                webtarget.path("").
                        path("").
                        request().
                        accept(MediaType.TEXT_PLAIN).
                        //accept(MediaType.TEXT_PLAIN).
                        get(String.class);
        return answer;
    }
    public String getAnswerXML(){
        String answer =
                webtarget.path("").
                        path("").
                        request().
                        accept(MediaType.TEXT_XML).
                        get(String.class);
        return answer;
    }
    public String getAnswerJSON(){
        String answer =
                webtarget.path("server").
                        path("restserver").
                        request().
                        accept(MediaType.APPLICATION_JSON).
                        get(String.class);
        return answer;
    }
}
