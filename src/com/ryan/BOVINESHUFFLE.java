package com.ryan;

public class BOVINESHUFFLE {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int cowCount = kattio.nextInt();

        int[] swaps = new int[cowCount+1];
        int[] cowOrig = new int[cowCount+1];
        int[] cowCurrent = new int[cowCount+1];
        int[] origPositionCowNames = new int [cowCount+1];

        for(int i = 1; i < cowCount+1; i++){
            swaps[i] = kattio.nextInt();
            cowOrig[i] = i;
        }
        for(int j = 0; j < 3; j++){
            for(int i = 1; i < cowCount+1; i++){
                cowCurrent[swaps[i]] = cowOrig[i];
            }
            for(int i = 1; i < cowCount+1; i++) {
                cowOrig[i] = cowCurrent[i];
            }
        }
        int[] currentPositionCowNames = new int[cowCount+1];
        for(int i = 1 ; i < cowCount + 1; i++){
            currentPositionCowNames[i] = kattio.nextInt();
        }
        for(int i = 1; i < cowCount +1; i++){
            origPositionCowNames[cowCurrent[i]] = currentPositionCowNames[i];
        }

        for(int i = 1; i < cowCount +1; i++) {
            kattio.println(origPositionCowNames[i]);
        }
        kattio.close();
    }
}
