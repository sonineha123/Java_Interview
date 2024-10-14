package com.rays.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

public static void main(String[] args) throws IOException {
    // Start UDP Socket
    DatagramSocket socket = new DatagramSocket();

    // Create a byte buffer to send a message
    byte[] buf = "Hello from UDP Client!".getBytes();

    // Encapsulate Server's IP Address
    InetAddress address = InetAddress.getByName("127.0.0.1");

    // Create a packet with Server IP Address and Port Number
    DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);

    // Send packet
    socket.send(packet);

    // Create an empty buffer to receive the server's response
    buf = new byte[256];
    packet = new DatagramPacket(buf, buf.length);

    // Wait for a response and receive it
    socket.receive(packet);

    // Display response
    String received = new String(packet.getData(), 0, packet.getLength());
    System.out.println("Quote of the Moment: " + received);

    // Close the socket
    socket.close();
    System.out.println("Client closed.");
}
}
