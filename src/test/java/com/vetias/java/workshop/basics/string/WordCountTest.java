package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCountTest {
    
    @Test
    public void testWordCount(){
        WordCount WordCount = new WordCount();
        int count = WordCount.count("this is a java program");
        Assertions.assertEquals(5,count);
    }
    @Test
    public void testAnotherString(){
        WordCount WordCount = new WordCount();
        int count = WordCount.count("anantha raj");
        Assertions.assertEquals(2,count);
    }

}
