package com.ryan.mom;

import com.ryan.Kattio;

import java.util.ArrayList;
import java.util.List;

public class CowGymnastics {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int k=kattio.nextInt();
        int n=kattio.nextInt();
        int cow=0;

        int[][] results=new int[n][k];
        for(int i=0;i<k;i++) {
            for(int j=0;j<n;j++){
                cow=kattio.nextInt();
                results[cow-1][i]=j;
            }
        }

        int prevResult=0;
        int finalCount=0;
        boolean isConsistent=false;
        for(int i=0;i<n;i++)
        {
            int[] result1=results[i];
            for(int j=i+1;j<n;j++)
            {
                int[] result2=results[j];
                isConsistent=true;
                for(int num=0;num<k;num++){
                    if((result2[num]-result1[num]>0 && prevResult<0) || (result2[num]-result1[num]>0 && prevResult<0)){
                        isConsistent=false;
                        break;
                    }
                    prevResult=(result2[num]-result1[num])>0?1:-1;
                }
                if(isConsistent)
                    finalCount++;
            }
        }

        kattio.println(finalCount);
        kattio.close();
    }
}
