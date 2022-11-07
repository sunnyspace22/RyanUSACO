package com.ryan;

public class blockgame {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int number_Boards = kattio.nextInt();
        int[] first_Word = new int[26];
        int[] second_Word = new int[26];
        int[] result = new int[26];

        for (int i = 0; i < number_Boards; i++) {
            String first = kattio.next();
            String second = kattio.next();
            for (int j = 0; j < first.length(); j++) {
                first_Word[first.charAt(j) - 'a']++;
                second_Word[second.charAt(j) - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                result[k] += Math.max(first_Word[k], second_Word[k]);
            }
            first_Word = new int[26];
            second_Word = new int[26];
        }
        for (int i = 0; i < 26; i++) {
            kattio.println(result[i]);
        }
        kattio.close();
    }
}
