package com.ryan;

public class milkpail {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int small_pail = kattio.nextInt();
        int med_pail = kattio.nextInt();
        int big_pail = kattio.nextInt();
        int max = Integer.MIN_VALUE;

        for (int x = 0; x < big_pail / small_pail + 1; x++) {
            for (int y = 0; y < big_pail / med_pail + 1; y++) {
                if (small_pail * x + med_pail * y <= big_pail) {
                    max = Math.max(max, small_pail * x + med_pail * y);
                }
            }
        }

        kattio.print(max);
        kattio.close();
    }
}
