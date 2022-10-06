package com.ryan.mom;

import com.ryan.Kattio;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=568

public class SpeedingTicket {

    public static void main(String[] main)
    {
        Kattio kattio=new Kattio();
        int segmentCount=kattio.nextInt();
        int bessieSegmentCount=kattio.nextInt();
        final int range=100;

        int[] speedLimits=new int[range];
        int[] bessieSpeed=new int[range];

        int index=0;
        int len=0, speed=0;
        int maxSpeeding=0;
        for(int i=0; i<segmentCount; i++)
        {
            len=kattio.nextInt();
            speed=kattio.nextInt();

            for(int id=index;id<len;id++)
            {
                speedLimits[id]=speed;
            }
        }

        for(int i=0; i<bessieSegmentCount; i++)
        {
            len=kattio.nextInt();
            speed=kattio.nextInt();

            for(int id=index;id<len;id++)
            {
                bessieSpeed[id]=speed;
            }
        }

        for(int i=0;i<range; i++)
        {
            maxSpeeding=Math.max(maxSpeeding, bessieSpeed[i]-speedLimits[i]);
        }

        kattio.print(maxSpeeding);
        kattio.close();
    }



}

/**
 public static void main(String[] args)
 {
 int maxSpeeding=0, segLen=0, segSpeed=0, currentTotalLenForBessie=0;
 Kattio kattio=new Kattio();
 int segment=kattio.nextInt();
 int bSegment=kattio.nextInt();

 int[][] segmentPairs=new int[segment][2];
 int[][] bSegmentPairs=new int[bSegment][2];

 for(int i=0;i<segment;i++)
 {
 segmentPairs[i]=new int[]{kattio.nextInt(), kattio.nextInt()};
 }
 int currentTotalLen=segmentPairs[0][0];

 int index=0;
 for(int i=0;i<bSegment;i++)
 {
 segLen=kattio.nextInt();
 currentTotalLenForBessie+=segLen;
 segSpeed=kattio.nextInt();

 while(currentTotalLenForBessie>=currentTotalLen) {
 maxSpeeding = Math.max(segSpeed - segmentPairs[index][1], maxSpeeding);
 if(index<segment-1) {
 index++;
 currentTotalLen += segmentPairs[index][0];
 }
 else
 {
 break;
 }
 }
 }

 kattio.print(maxSpeeding);
 kattio.close();
 }
 */