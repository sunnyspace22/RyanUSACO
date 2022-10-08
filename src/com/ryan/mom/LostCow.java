package com.ryan.mom;

import com.ryan.Kattio;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=735

public class LostCow {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int johnStart=kattio.nextInt();
        int cowPosition=kattio.nextInt();

        int direction=1, distance=1, totalDistance=0;
        while(true)
        {
            if((direction==1 && johnStart<=cowPosition && cowPosition<=johnStart+distance)
            || (direction==-1 && cowPosition<=johnStart && cowPosition>=johnStart-distance))
            {
                totalDistance=totalDistance+Math.abs(cowPosition-johnStart);
                break;
            }
            else
            {
                //johnStart = johnStart + (distance*direction);
                totalDistance +=distance*2;
                distance = distance * 2;
                direction = direction * -1;
            }
        }

        kattio.print(totalDistance);
        kattio.close();
    }
}
