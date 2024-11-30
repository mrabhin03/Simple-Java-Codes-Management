import java.io.File;
import java.io.IOException;

class FileCreate{
    public static void main(String ar[]){
        try{
            File obj=new File("Files/Test1");
            if(obj.createNewFile()){
                System.out.print("File Created: "+obj.getName());
            }else{
                System.out.print("Already Exist");
            }
        }catch(IOException io){
            System.out.println("ERROR");
        }
    }
}