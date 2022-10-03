package com.ryan;

public class MaxMin {
    public static void main(String[] poopoo)
    {
        Kattio peepee = new Kattio();
        int len = peepee.nextInt();
        int[] fart = new int[len];
        for(int i=0; i<len; i++)
        {
            fart[i] = peepee.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<len; i++)
        {
            max = Math.max(max, fart[i]);
            min = Math.min(min, fart[i]);
        }
        System.out.println(min);
        System.out.println(max);
    }
}

