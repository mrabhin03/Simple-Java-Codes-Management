import java.io.*;

class CopyAndPaste{
    public static void main(String ar[]){
        File From=new File("Files/MainFile.txt");
        File To=new File("Files/SaveTo.txt");

        try{
            FileInputStream copy=new FileInputStream(From);
            FileOutputStream paste=new FileOutputStream(To);
            byte[] value=new byte[1024];
            int data;
            while((data=copy.read(value))!=-1){
                paste.write(value,0,data);
            }
            copy.close();
            paste.close();
        }catch(Exception e){

        }
    }
}