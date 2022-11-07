package com.ryan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BovineGenomics {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int n=kattio.nextInt();
        int m=kattio.nextInt();

        char[][] genes=new char[n*2][m];

        for(int i=0;i<n*2;i++)
        {
            String geneStr=kattio.next();
            for(int j=0;j<m;j++)
            {
                genes[i][j]=geneStr.charAt(j);
            }
        }
        Set<Character> spotSet=new HashSet<>();
        Set<Character> noSpotSet=new HashSet<>();
        int count=0, finalCount=0;
        for(int i=0;i<m;i++) {
            spotSet.clear();
            noSpotSet.clear();
            for (int j = 0; j < n*2; j++) {
                if(j<3)
                    spotSet.add(genes[j][i]);
                else
                    noSpotSet.add(genes[j][i]);
            }
            spotSet.retainAll(noSpotSet);
            if (spotSet.size()==0)
                  finalCount++;
        }

        kattio.println(finalCount);
        kattio.close();
    }
}
