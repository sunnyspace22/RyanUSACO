package com.ryan;

import java.util.HashSet;
import java.util.Set;

public class DistinctNumberRyan {
    public static void main(String[] poopoo)
    {
        Kattio peepee = new Kattio();
        int len = peepee.nextInt();
        int[] fart = new int[len];
        for(int i=0; i<len; i++)
        {
           fart[i] = peepee.nextInt();                              
        }

        Set<Integer> fangpi = new HashSet<>();
        for(int i=0; i<len; i++)
        {
            fangpi.add(fart[i]);
        }
        int poop = fangpi.size();

        System.out.println(poop);
    }
}
