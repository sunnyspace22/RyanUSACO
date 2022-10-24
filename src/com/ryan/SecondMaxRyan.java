package com.ryan;

public class SecondMaxRyan {
    public static void main(String[] poopoo) {
        Kattio peepee = new Kattio();
        int len = peepee.nextInt();
        int[] fart = new int[len];
        for (int i = 0; i < len; i++) {
            fart[i] = peepee.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (fart[i] > max) {
                secondmax = max;
                max = fart[i];
            }

        }
        System.out.println(secondmax);
    }

}
