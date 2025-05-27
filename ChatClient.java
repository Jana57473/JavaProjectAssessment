import java.net.*;
import java.io.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in));

            String serverMsg, clientMsg;
            while (true) {
                System.out.print("You: ");
                clientMsg = console.readLine();
                out.println(clientMsg);

                serverMsg = in.readLine();
                if (serverMsg == null) break;
                System.out.println("Server: " + serverMsg);
            }
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
