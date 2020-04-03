package ks.com.cn.io;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class clientBio1 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",8989);
        OutputStream out = client.getOutputStream();
        out.write("kaisha1".getBytes());
        out.close();
        client.close();
    }

}
