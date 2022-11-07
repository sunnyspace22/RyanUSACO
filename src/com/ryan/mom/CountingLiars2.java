package com.ryan.mom;

import com.ryan.Kattio;

public class CountingLiars2 {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int n=kattio.nextInt();
        String[] types=new String[n];
        int[] locations=new int[n];
        int location=0;

        for(int i=0;i<n;i++)
        {
            types[i]=kattio.next();
            locations[i]=kattio.nextInt();
        }

        int minLiar=n;
        int liar=0;
        for(int i=1;i<n;i++) {
            liar=0;
            location=locations[i];
            for(int j=0;j<n;j++)
            {
                if(types[j].equals("G") && (locations[j]>location)){
                        liar++;
                }
                else if(types[j].equals("L") && (locations[j]<location)){
                    liar++;
                }
            }
            minLiar=Math.min(minLiar,liar);
        }

        kattio.println(minLiar);
        kattio.close();
    }
}
