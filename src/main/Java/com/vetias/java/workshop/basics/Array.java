package main.java.com.vetias.java.workshop.basicshop.basics;
import java.util.Arrays;
public class Array {
    public static void main(String[]args){
        String[][] employees=new String [5][2];
        employees[0][0]="anand";
        employees[0][1]="40000";
        employees[1][0]="jikah";
        employees[1][1]="50000";
        employees[2][0]="varshini";
        employees[2][1]="100000";
        employees[3][0]="jeni";
        employees[3][1]="2000";
        employees[4][0]="vijay";
        employees[4][1]="50000";  
        for(String[] employee:employees)
        {
            System.err.println(Arrays.toString(employee));
        }
    }

}
