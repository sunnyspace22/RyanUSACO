package com.ryan;

public class lifeguardsimgnonakms {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int number_of_lifeguards = kattio.nextInt();
        int[] start_times = new int[number_of_lifeguards];
        int[] end_times = new int[number_of_lifeguards];
        for (int i = 0; i < number_of_lifeguards; i++) {
            start_times[i] = kattio.nextInt();
            end_times[i] = kattio.nextInt();

        }
        /*
        //finding overlap
        for(int i = 0 ; i < number_of_lifeguards; i++){
            if (start_times[i+1] > start_times[i] && start_times[i] < end_times[i] && end_times[i+1] > end_times[i]){
            }
            */
        }
    }

