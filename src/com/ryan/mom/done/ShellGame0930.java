package com.ryan.mom.done;

import com.ryan.Kattio;

public class ShellGame0930 {
    static int totalswap = 0;
    static int[] guesses = null;
    static int[][] swaps = null;

    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        totalswap = kattio.nextInt();
        int[] shellSet = new int[3];
        int[] correctGuess = new int[3];
        int temp = 0, swap1 = 0, swap2 = 0, guess = 0;
        for (int i = 0; i < 3; i++) {
            //initially, first shell in line has value 0, second has value 1, third has value 3. All match their initial position index;
            shellSet[i] = i;
        }

        //Swap
        for (int i = 0; i < totalswap; i++) {
            swap1 = kattio.nextInt() - 1;
            swap2 = kattio.nextInt() - 1;
            guess = kattio.nextInt() - 1;
            //make swap
            temp = shellSet[swap1];
            shellSet[swap1] = shellSet[swap2];
            shellSet[swap2] = temp;

            //if guess is right, then original position must be the current value in shellSet after swap
            correctGuess[shellSet[guess]]++;
        }

        //find out the max value in the correctGuess array
        int maxCorrect = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            maxCorrect = Math.max(maxCorrect, correctGuess[i]);
        }

        kattio.println(maxCorrect);
        kattio.flush();
        kattio.close();
    }
}
