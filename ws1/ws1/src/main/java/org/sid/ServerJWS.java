package org.sid;

import jakarta.xml.ws.Endpoint;

import java.util.Arrays;

public class ServerJWS {
    public static void main(String[] args){
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Service Web deployé sur l'adresse http://0.0.0.0:9191/");
    }
}
