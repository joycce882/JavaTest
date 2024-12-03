package Inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress myaddress = InetAddress.getByName("DESKTOP-SPFLO6B");
        System.out.printf(myaddress.getHostAddress());

    }
}
