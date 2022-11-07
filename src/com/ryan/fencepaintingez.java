package com.ryan;

public class fencepaintingez {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int a = kattio.nextInt();
        int b = kattio.nextInt();
        int c = kattio.nextInt();
        int d = kattio.nextInt();
        int total = 0;

        if ((c > a && c < b) || (d > a && d < b)) {
            int start = Math.min(a, c);
            int end = Math.max(b, d);
            total = end - start;
        }
        else{
            total = (b-a) + (d-c);
        }

        kattio.println(total);
        kattio.close();
    }
}
