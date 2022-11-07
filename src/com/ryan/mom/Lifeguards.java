package com.ryan.mom;

import com.ryan.Kattio;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=784
public class Lifeguards {
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int n=kattio.nextInt();

        int[] range=new int[1000];
        int start=0, end=0, covered=0;
        for(int i=0;i<n;i++)
        {
            start=kattio.nextInt();
            end=kattio.nextInt();
            for(int j=start ;j<= end;j++)
            {
                range[j]+=1;
                if(range[j]==1)
                    covered++;
            }
        }

        int minCover=1000, countOne=0;
        for(int i=0;i<100;i++)
        {
            if(range[i]==1)
                countOne++;
            else if(countOne>0){
                minCover=Math.min(minCover,countOne);
                countOne=0;
            }
        }

        kattio.println(covered-minCover);
        kattio.close();
    }
}
