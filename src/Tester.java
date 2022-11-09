import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {



    public static void main(String[] args) throws Throwable {
        ServerSocket ss = new ServerSocket(1234);
        Socket s = ss.accept();
        Socket s = new Socket("127.0.0.1")

        // registers input from the keyboard
        BufferedReader input =
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        Writer output = new OutputStreamWriter((s.getOutputStream()));
        // creates instance of the object -- the user interface for the chat program
        ChatUI theUI = new ChatUI("Client End", output);
        // reads the String
        String line;
        // From the IO class, BufferedReader registers all keys from the keyboard that is not null
            // uses loop to continue to append text as input continues
        while ((line = input.readLine()) != null) {
        // appends to the object and presents to the user
            theUI.appendText(line);
        }
        theUI.appendText("Connection Unavailable");
    }
}