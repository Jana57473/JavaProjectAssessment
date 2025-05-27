import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(
                new InputStreamReader(System.in));

            String clientMsg, serverMsg;
            while ((clientMsg = in.readLine()) != null) {
                System.out.println("Client: " + clientMsg);
                System.out.print("You: ");
                serverMsg = console.readLine();
                out.println(serverMsg);
            }

            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
