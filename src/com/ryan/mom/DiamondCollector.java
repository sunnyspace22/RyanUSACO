package com.ryan.mom;

import com.ryan.Kattio;

import java.util.Arrays;

public class DiamondCollector {
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int n=kattio.nextInt();
        int k=kattio.nextInt();
        int[] sizes=new int[n];
        int maxCount=Integer.MIN_VALUE, count=0;
        for(int i=0;i<n;i++)
        {
            sizes[i]=kattio.nextInt();
        }

        Arrays.sort(sizes);
        for(int i=0;i<n;i++)
        {
            count=0;
            int j=i+1;
            while(j<n)
            {
                if(sizes[j]-sizes[i]<=k)
                    count++;
                else
                    break;
                j++;
            }
            j=i-1;
            while(j>=0)
            {
                if(sizes[i]-sizes[j]<=k)
                    count++;
                else
                    break;
                j--;
            }
            maxCount=Math.max(count,maxCount);
        }

        kattio.println(maxCount);
        kattio.close();

    }


}
