

package com.rays.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

    public static void main(String[] args) throws IOException {
        // Start UDP Socket on port 4445
        DatagramSocket socket = new DatagramSocket(4445);

        System.out.println("Server is up and waiting for a client...");

        // Create a byte buffer to receive incoming data
        byte[] buf = new byte[256];

        // Create an empty data packet to receive client's packet
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        // Wait for a packet and receive
        socket.receive(packet);

        // Display the received message from client
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received from client: " + received);

        // Prepare a response message
        String response = "Hello from UDP Server!";
        buf = response.getBytes();

        // Send the response to the client
        packet = new DatagramPacket(buf, buf.length, packet.getAddress(), packet.getPort());
        socket.send(packet);

        // Close the socket
        socket.close();
        System.out.println("Server closed.");
    }
}