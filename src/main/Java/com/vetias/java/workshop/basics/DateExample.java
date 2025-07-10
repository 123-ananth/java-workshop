package main.java.com.vetias.java.workshop.basicshop.basics;
import java.time.LocalDate;

public class DateExample{

   public static void main(String[]args)
{
     LocalDate today =LocalDate.now();
     System.out.println("Today's date:" +today);
     LocalDate yesdate=today.minusDays(1);
     System.out.println("yesterday's date: " + yesdate);

     
}
}
