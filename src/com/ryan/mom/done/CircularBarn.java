package com.ryan.mom.done;

import com.ryan.Kattio;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=616

public class CircularBarn {
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int roomCount=kattio.nextInt();

        int[] cowCountPerRoom=new int[roomCount];
        for(int i=0;i<roomCount;i++)
        {
            cowCountPerRoom[i]=kattio.nextInt();
        }

        int totalDistance=0, index=0, offset=0, minDistance=Integer.MAX_VALUE;


        for(int i=0;i<roomCount;i++)
        {
            offset=i;
            index=0;
            totalDistance=0;
            while(index<roomCount) {
                totalDistance = totalDistance + cowCountPerRoom[index] * ((index + offset + 1) % roomCount);
                index++;
            }

            minDistance=Math.min(minDistance, totalDistance);

        }

        kattio.println(minDistance);
        kattio.close();
    }
}
