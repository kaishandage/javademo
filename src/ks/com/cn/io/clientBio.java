package ks.com.cn.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class clientBio {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",8989);
        OutputStream out = client.getOutputStream();
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()){
            String next = sca.next();
            out.write(next.getBytes());
            if("4".equals(next)){
                out.close();
                break;
            }
        }
        client.close();
    }

}
