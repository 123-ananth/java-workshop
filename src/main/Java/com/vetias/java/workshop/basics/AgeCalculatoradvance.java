package main.java.com.vetias.java.workshop.basicshop.basics;
import java.time.LocalDate;
import java.time.LocalDate;
import java.util.Scanner;
public class AgeCalculatoradvance {

    public static void main(String[]args) 
    {
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("enter your date of birth (yyyy-mm-dd)");
        String dateOfBirth=inputscanner.nextLine();
        LocalDate birthDate=LocalDate.parse(dateOfBirth);
        int yearOfBirth=birthDate.getYear();
        int currentYear=LocalDate.now().getYear();
        int age=currentYear-yearOfBirth;
        System.out.println(age);
    }
}
