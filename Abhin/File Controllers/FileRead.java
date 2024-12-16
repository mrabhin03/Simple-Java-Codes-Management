import java.io.File;
import java.util.Scanner;
class FileRead{
    public static void main(String ar[]){
        try{
            File f1=new File("Files/Test1");
            Scanner read=new Scanner(f1);
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
        }catch(Exception e){
            
        }
    }
}