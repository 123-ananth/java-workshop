package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WordCountTest {
    @Test
    public void testWordCount(){
        WordCount WordCount = new WordCount();
        int count = WordCount.count("this is a java program");
        Assertions.assertEquals(5,count);
    }

}
