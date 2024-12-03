package Inetaddress;

import java.awt.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceivedataTestUDP {
    public static void main(String[] args) throws IOException {
        // 我需要一个打包箱子来接受数据
        DatagramSocket ds = new DatagramSocket(10089);
        byte[] bytes =new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        byte[] data = dp.getData();
        int length = data.length;
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接收到的数据为"+new String(data,0,length));
        System.out.println("发送的IP地址为"+address+"，端口号为"+ port);
    }
}
