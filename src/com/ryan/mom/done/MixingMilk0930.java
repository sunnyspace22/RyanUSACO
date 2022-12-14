package com.ryan.mom.done;

import com.ryan.Kattio;

public class MixingMilk0930 {
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int[] capacity=new int[3];
        int[] milk=new int[3];
        capacity[0]=kattio.nextInt();
        milk[0]=kattio.nextInt();
        capacity[1]=kattio.nextInt();
        milk[1]=kattio.nextInt();
        capacity[2]=kattio.nextInt();
        milk[2]=kattio.nextInt();
        int current=0, next=0, amount=0;

        for(int i=0;i<100;i++)
        {
            current=i%3;
            next=(current+1)%3;
            amount=Math.min(milk[current], capacity[next]- milk[next]);
            milk[current]=milk[current]-amount;
            milk[next]=milk[next]+amount;
        }
        for(int i=0;i<3; i++)
            kattio.println(milk[i]);

        kattio.close();
    }
}
