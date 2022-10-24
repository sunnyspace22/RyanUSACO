package com.ryan.mom.done;

import com.ryan.Kattio;

// http://www.usaco.org/index.php?page=viewproblem2&cpid=856

public class BucketList {

   public static void main(String[] args)
   {
       Kattio kattio=new Kattio();
       int cowNum=kattio.nextInt();

       final int range=1000;
       int startTime=0, endTime=0, bucketNeeded=0, totalBucketNeeded=0;
       int[] milkBucketNeeded=new int[range+1];
       for(int i=0;i<cowNum;i++)
       {
           startTime=kattio.nextInt();
           endTime=kattio.nextInt();
           bucketNeeded=kattio.nextInt();

           for(int t=startTime; t<=endTime;t++)
           {
               milkBucketNeeded[t]=milkBucketNeeded[t]+bucketNeeded;
               totalBucketNeeded=Math.max(totalBucketNeeded,milkBucketNeeded[t]);

           }
       }

       kattio.print(totalBucketNeeded);
       kattio.close();
   }
}
