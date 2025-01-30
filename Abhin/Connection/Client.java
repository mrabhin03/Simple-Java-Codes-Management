import java.io.*;
import java.net.*;

class Client{
    public static void main(String ar[]){
        try{
            Socket conn=new Socket("localhost",5000);
            System.out.println("Connected to Server");

            BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
            PrintWriter Send=new PrintWriter(conn.getOutputStream(),true);

            Send.println("Hello Server");

            System.out.println("Message from Server: "+in.readLine());

            conn.close();

        }catch(Exception e){
            System.out.println("Error");
        }
    }
}