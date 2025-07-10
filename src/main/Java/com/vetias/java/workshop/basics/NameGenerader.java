package main.java.com.vetias.java.workshop.basicshop.basics;
import java.util.Scanner;

public class NameGenerader {
  public static void main(String[] args){
    System.out.println("enter your name");
    System.out.println("enter your gender");
    System.out.println("enter your qualification");
    Scanner scanner=new Scanner(System.in);
    String name=scanner.next();
    String gender=scanner.next();
    String qualification=scanner.next();
    if("Male".equalsIgnoreCase(gender))
    {
    System.out.println("Mr."+name+","+qualification);
     }
    else
    {
        System.out.println("Miss."+name+","+qualification);
    }



  }

}
