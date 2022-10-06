package com.ryan.mom;

import com.ryan.Kattio;

import java.util.Arrays;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=760

public class BovineShuffle {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();

        int cowCount=kattio.nextInt();

        int[] swaps=new int[cowCount+1];
        int[] cowOrig=new int[cowCount+1];
        int[] cowCurrent=new int[cowCount+1];
        for (int i = 1; i <= cowCount; i++) {
            cowOrig[i]=i;
            swaps[i] = kattio.nextInt();
        }
        for(int j=0;j<3;j++) {
            for (int i = 1; i <= cowCount; i++) {
                cowCurrent[swaps[i]] = cowOrig[i];
            }
            //Array copy https://www.baeldung.com/java-array-copy
            cowOrig= Arrays.copyOf(cowCurrent,cowCount+1 );
        }

        String[] cowNames=new String[cowCount+1];
        for(int i=1;i<cowCount+1;i++)
        {
            cowNames[cowCurrent[i]]=kattio.next();
        }


        for(int i=1;i<cowCount+1;i++)
            kattio.println(cowNames[i]);

        kattio.close();
    }

}
