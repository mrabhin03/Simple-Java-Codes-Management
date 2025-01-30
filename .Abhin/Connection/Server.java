import java.net.*;
import java.io.*;

class Server{
    public static void main(String ar[]){
        try{
            ServerSocket Sconn=new ServerSocket(5000);
            System.out.println("Waiting for Client");

            Socket conn=Sconn.accept();

            BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
            PrintWriter SendMsg=new PrintWriter(conn.getOutputStream(),true);

            System.out.print("Message from Client: "+in.readLine());
            SendMsg.println("Welcome Client");

            Sconn.close();
            conn.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}