package com.ryan;

public class diamondcollector {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int number_of_diamonds = kattio.nextInt();
        int size_difference = kattio.nextInt();
        int[] diamonds_shown = new int[number_of_diamonds];
        int[] diamond_sizes = new int[number_of_diamonds];
        for(int i = 0; i < number_of_diamonds; i++){
            diamond_sizes[i] = kattio.nextInt();
        }
        for(int i = 0; i < number_of_diamonds; i++){
            for(int j = 0; j < number_of_diamonds; j++){
                if (diamond_sizes[i] != diamond_sizes[j] &&
                        size_difference <= Math.abs(diamond_sizes[j]-diamond_sizes[i])){
                    diamonds_shown[i] += 1;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < number_of_diamonds; i++){
            max = Math.max(max, diamonds_shown[i]);
        }

        kattio.print(max + 1);
        kattio.close();
    }
}
