package main.java.com.vetias.java.workshop.basicshop.basics;
import java.time.LocalTime;
public class RegistrationTimeLeft {
    public static void main(String[]args){

        LocalTime currenTime=LocalTime.now();
        LocalTime Reg=LocalTime.of(  13,  59,  59);
        int Hoursleft=Reg.getHour()-currenTime.getHour();
        int Minuteleft=Reg.getMinute()-currenTime.getMinute();
        int Secondleft=Reg.getSecond()-currenTime.getSecond();
        System.out.println("you have"+Hoursleft+"hours,"+Minuteleft+"minutes"+Secondleft+"seconds");

    }

}
