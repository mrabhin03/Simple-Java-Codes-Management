import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class FileWrite{
    public static void main(String ar[]){
        try{
            FileWriter writer=new FileWriter("Files/Test1");
            writer.write("HELLO");
            writer.close();
        }catch(IOException io){
            System.out.println("ERROR");
        }
    }
}