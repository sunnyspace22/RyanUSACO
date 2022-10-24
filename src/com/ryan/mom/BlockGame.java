package com.ryan.mom;

import com.ryan.Kattio;

import java.awt.event.PaintEvent;

/**
 * http://www.usaco.org/index.php?page=viewproblem2&cpid=664
 */

public class BlockGame {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int totalLine = kattio.nextInt();

        int[] letterCount1=new int[26];
        int[] letterCount2=new int[26];
        int[] letterCount=new int[26];



        for (int i = 0; i < totalLine; i++) {
            String first=kattio.next();
            String second=kattio.next();
            for(int j=0;j< first.length();j++)
            {
                int index=(int)first.charAt(j)-'a';
                letterCount1[index]++;
                index=(int)second.charAt(j)-'a';
                letterCount2[index]++;
            }
            for(int k=0;k<26;k++)
            {
                letterCount[k]=letterCount[k]+ Math.max(letterCount1[k],letterCount2[k]);
                letterCount1[k]=0;
                letterCount2[k]=0;
            }
        }

        for(int i=0;i<26;i++) {
            kattio.println(letterCount[i]);
        }

        kattio.close();

    }
}
