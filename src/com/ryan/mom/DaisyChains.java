package com.ryan.mom;

import com.ryan.Kattio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DaisyChains {
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int n=kattio.nextInt();
        int count=n, avg=0, sum=0;
        Set<Integer>  pList=new HashSet<Integer>();

        int[] petals=new int[n];
        for(int i=0;i<n;i++)
        {
            petals[i]=kattio.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            pList.clear();
            pList.add(petals[i]);
            sum=0;
            sum+=petals[i];
            for(int j=i+1;j<n;j++)
            {
                pList.add(petals[j]);
                sum+=petals[j];
                //avg=(sum/(j-i+1));
                if(sum%(j-i+1)!=0)
                    continue;
                else
                    avg=(sum/(j-i+1));
                if(pList.contains(avg))
                    count++;
            }
        }

        kattio.println(count);
        kattio.close();

    }
}
