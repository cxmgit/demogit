package socketTest;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 网络编程客户端
 * Created by Administrator on 2019/4/16/016.
 */
public class HellloServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器等待连接....");
        Socket accept = serverSocket.accept();
        OutputStream outputStream = accept.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        printStream.print("hello");
        printStream.close();
        accept.close();
        serverSocket.close();
    }
}
