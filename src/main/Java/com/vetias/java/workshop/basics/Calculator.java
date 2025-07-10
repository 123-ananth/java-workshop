package main.java.com.vetias.java.workshop.basicshop.basics;

public class Calculator {
        public int divide (int a,int b){
            return a/b;
        }
        public int add(int a,int b){
            return a+b;
        }
        public int subtraction(int a,int b){
            return a-b;
        }
        public static void main(String[] args) {
        Calculator Calculator=new Calculator();
        System.out.println("division: "+ Calculator.divide(6, 6));
        System.out.println("addition: " + Calculator.add(5, 3));
        System.out.println("subtraction: "+ Calculator.subtraction(10, 4));
        int a=6;
        int b=0;
        {
            try{
               if(b==0)
               {
                throw new ArithmeticException("division by zero is not allowed");
               }
            }
               catch(ArithmeticException e)
               {
                System.out.println(e.getMessage());
               }
               
            }
            
        }

        
        

    }

    



