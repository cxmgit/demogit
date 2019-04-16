package socketTest;

import com.sun.deploy.util.SessionState;

import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端代码
 * Created by Administrator on 2019/4/16/016.
 */
public class ClientTest {
    public static void main(String[] args) throws  Exception{
        Socket socket = new Socket("localhost",9999);
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        scanner.useDelimiter("/n");
        if(scanner.hasNext()){
            System.out.println("[回应数据]"+scanner.next());
        }

        scanner.close();
        socket.close();

    }
}
