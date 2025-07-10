package main.java.com.vetias.java.workshop.basicshop.basics;
import java.time.LocalDateTime;
import java.util.Scanner;;
public class AgeCalculator {
    public static void main(String[]args){
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("enter your year: ");
        int year = inputScanner.nextInt();
        int currentyear=LocalDateTime.now().getYear();
        int age=currentyear-year;
        System.out.println(age);
    }

}
