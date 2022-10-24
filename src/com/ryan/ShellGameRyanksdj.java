package com.ryan;


public class ShellGameRyanksdj {
    static int totalswap = 0;

    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        totalswap = kattio.nextInt();
        int[] shellSet = new int[3];
        int[] correctGuess = new int[3];
        int temp = 0, swap1 = 0, swap2 = 0, guess = 0;
        for (int i = 0; i < 3; i++) {
            shellSet[i] = i;
        }

        for (int i = 0; i < totalswap; i++){
            swap1 = kattio.nextInt() - 1;
            swap2 = kattio.nextInt() - 1;
            guess = kattio.nextInt() - 1;
            temp = shellSet[swap1];
            shellSet[swap1] = shellSet[swap2];
            shellSet[swap2] = temp;

            correctGuess[shellSet[guess]]++;
        }

        int maxCorrect = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++){
            maxCorrect = Math.max(maxCorrect, correctGuess[i]);
        }
        kattio.println(maxCorrect);
        kattio.close();
    }
}
