package com.vetias.java.workshop.basics.string;

public class WordCount {

    public int count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }
public int count(String inpuString){
    int count =0;
    String[] words=inpuString.split(" ");
    count=words.length;
    return count;
}
}
