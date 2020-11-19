import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String args[]) {


        String host = "localhost";
        int port = 7777;
        System.out.println("started");
        try (Socket s = new Socket(host, port)) {
            InputStream i = s.getInputStream();
            BufferedReader r = new BufferedReader(new InputStreamReader(i));
            String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
