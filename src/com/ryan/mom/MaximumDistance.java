package com.ryan.mom;

import com.ryan.Kattio;

/**
 * https://codeforces.com/gym/102951/problem/A
 */
public class MaximumDistance {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int count=kattio.nextInt();
        int[] xArray=new int[count];
        for(int i=0;i<count;i++)
        {
            xArray[i]= kattio.nextInt();
        }
        int[] yArray=new int[count];
        for(int i=0;i<count;i++)
        {
            yArray[i]= kattio.nextInt();
        }
        long maxDistance=Integer.MIN_VALUE;

        for(int i=0;i<count;i++)
        {
            for(int j=i;j<count;j++)
            {
                //formula: (y2-y1)(sqr)+(x2-x1)(sqr)
                maxDistance=(long)Math.max(Math.pow((yArray[j]-yArray[i]),2)+Math.pow((xArray[j]-xArray[i]),2),maxDistance);
            }
        }

        kattio.println(maxDistance);
        kattio.close();

    }
}
