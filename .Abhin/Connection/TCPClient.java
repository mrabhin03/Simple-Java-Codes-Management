import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Server's IP address
        int serverPort = 80; // Server's port number

        try {
            // Step 1: Connect to the server
            Socket clientSocket = new Socket(serverAddress, serverPort);
            System.out.println("Connected to the server.");

            // Step 2: Create output stream to send data
            OutputStream output = clientSocket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Step 3: Send a message to the server
            String message = "Hello, Server!";
            writer.println(message);
            System.out.println("Message sent to server: " + message);

            // Step 4: Create input stream to receive data
            InputStream input = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Step 5: Read the server's response
            String serverResponse = reader.readLine();
            System.out.println("Message received from server: " + serverResponse);

            // Step 6: Close the socket
            clientSocket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
