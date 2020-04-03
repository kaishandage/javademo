package ks.com.cn.io;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBio {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8989);
        while (true){
            Socket accept = server.accept();
            BufferedReader is=new BufferedReader(new InputStreamReader(accept.getInputStream()));
            System.out.println(is.readLine());

        }

    }
}
