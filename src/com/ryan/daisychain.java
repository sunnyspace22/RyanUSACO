package com.ryan;

public class daisychain {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int number_of_flowers = kattio.nextInt();
        int[] flower_petals = new int[number_of_flowers];
        for(int i = 0; i < number_of_flowers; i++){
            flower_petals[i] = kattio.nextInt();
        }
        int sum = 0, counter = 0;

        for(int i = 0; i < number_of_flowers; i++){
            for(int j = i+1; j < number_of_flowers; j++){
                sum = 0;
                for(int x = i; x <= j; x++){
                    sum = sum + flower_petals[x];
                }
                if(sum%(j-i+1)!=0) {
                    continue;
                }
                int avg = sum/(j-i+1);
                for(int x = i; x <= j; x++){
                    if(avg == flower_petals[x]) {
                        counter += 1;
                        break;
                    }
                }
            }
        }
        kattio.println(counter+number_of_flowers);
        kattio.close();
    }
}
