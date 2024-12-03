package Inetaddress;

import java.io.IOException;
import java.net.*;

public class SenddataTestUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String src = "你好棒！";
        byte[] bytes = src.getBytes();
        int port = 10089;
        InetAddress address = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();
    }
}
