package main.java.com.vetias.java.workshop.basicshop.basics;

public class StringExample {
   public static void main(String[]args){
   // String firstname="anantha";
   // String lastname="raj";
   // String finalname=firstname.concat(lastname);
   // System.out.println(finalname.toUpperCase());
   String sentance ="this program shows how can we split a string into multiple strings . We need to count sentance ,word,character"; 
   String[] sentances=sentance.split("\\.");
   String[] words=sentance.split(" ");
   String[] character=sentance.split("");
   System.out.println(sentances.length);
   System.out.println(words.length);
   System.out.println(character.length);
   // for (String word:words){
   //    System.out.println(word);
   // }
   }
}