package com.ryan;

public class circlebarn {
    public static void main(String[] args){
        Kattio kattio = new Kattio();

        int rooms = kattio.nextInt();

        int[] capacity = new int[rooms];
        for(int i = 0; i < rooms; i++){
            capacity[i] = kattio.nextInt();
        }

        int sum = 0;
        int counter = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < rooms; i++){
            counter = 0;
            sum=0;
            for(int j = i; j < rooms+i; j++){
                sum = sum + capacity[j%rooms] * counter;
                counter++;
            }
            min = Math.min(min, sum);
        }
        kattio.println(min);
        kattio.close();
    }
}
