import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Server(){
        int port = 7777;
        try (ServerSocket s = new ServerSocket(port)) {
            System.out.println("Farkle by Vaibhav v0.0.1");
            System.out.println("Starting Farkle Server");



            System.out.println("Server listening using port " + port);

            while (true) {
                Socket socket = s.accept();
                System.out.println("Client connected!");
                new ServerInstance(socket);
            }

        } catch (IOException e) {
            System.out.println("Failed to start server");
            e.printStackTrace();
        }
    }
}

class ServerInstance extends Thread {

    ServerInstance(Socket s) {
        System.out.println("New Thread");

        try {
            OutputStream output = s.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            String ip = (InetAddress.getLocalHost().getHostAddress());
            writer.println("Hello world!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
