package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args)
    {
        List<String>names=new ArrayList<>();
        names.add("anantha");
        names.add("raj");
        names.add("jenisha");
        names.add("princy");
        names.add("pritha");
        names.add("ancy");

        System.out.println(names);
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
    }

