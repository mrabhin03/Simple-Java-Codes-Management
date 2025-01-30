import java.io.FileOutputStream;
public class FileStream {
    public static void main(String ar[]){
            try{
                FileOutputStream file=new FileOutputStream("Files/Test2.txt");
                file.write(65);
                file.close();
        }catch(Exception e){
            System.out.println("Error in File");
        }
    }
}
