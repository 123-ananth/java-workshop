package main.java.com.vetias.java.workshop.StandardLibsandardLibs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyUsingBinary {
public static void main(String[]args){
    try(FileInputStream inputStream=new FileInputStream("anand.png");
    FileOutputStream outputStream=new  FileOutputStream("Mylogo.png")){
        byte[] chunk = new byte[2048];
        int byteRead;
        while((byteRead= inputStream.read(chunk))!=-1){
            outputStream.write(chunk,0,byteRead);
        }
    }catch (IOException e){
        System.out.println("Error in reading or writing the file");
    }


}
}
