package com.rays.networking;

import java.io.*;
import java.net.*;

public class HelloTCPServer {
    public static void main(String[] args) throws Exception {
       
    	ServerSocket server = new ServerSocket(1235);

        System.out.println("Server started. Waiting for a client...");
        

        
        
        Socket client = server.accept();
        
        System.out.println("Client connected.");
        
        //client se data read krne ke liye use hota he...
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
        //server se client ko data bhejne ke liye use hota  he...
        DataOutputStream out = new DataOutputStream(client.getOutputStream());

        String greeting = in.readLine(); //client server ko msg sand krta he 
        System.out.println("Received from client: " + greeting);

        out.writeBytes("Hello Client\n");  //sever client ko msg sand krta he

        client.close();
        server.close();
        System.out.println("Server closed."); 
    }
}
