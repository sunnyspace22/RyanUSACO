package com.ryan;

public class BucketList {
    public static void main(String[] args){
        Kattio kattio = new Kattio();

        int[] bt = new int[1000];
        int n = kattio.nextInt();
        for (int i = 0; i < n; i++){
            int s = kattio.nextInt();
            int t = kattio.nextInt();
            int b = kattio.nextInt();
            for(int j = s; j < t; j++){
                bt[j] = bt[j] + b;
            }
        }
        int bucketsNeeded = Integer.MIN_VALUE;
        for (int j = 0; j < 1000; j++) {
            bucketsNeeded = Math.max(bucketsNeeded, bt[j]);
        }
        kattio.println(bucketsNeeded);
        kattio.close();
    }
}
