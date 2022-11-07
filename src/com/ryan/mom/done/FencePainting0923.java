//http://www.usaco.org/index.php?page=viewproblem2&cpid=567
//solution: https://usaco.guide/general/input-output?lang=java
package com.ryan.mom.done;

import com.ryan.Kattio;

public class FencePainting0923 {

    static int a=0, b=0, c=0, d=0, len=0;
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        a=kattio.nextInt();
        b=kattio.nextInt();
        c=kattio.nextInt();
        d=kattio.nextInt();
        kattio.print(getCoveredFence(a, b, c, d));
        kattio.flush();
        kattio.close();

    }

    private static int getCoveredFence(int a, int b, int c, int d)
    {
        if(c>=b || a>=d)
        {
            len=(b-a)+(d-c);
        }
        else {
            len=Math.max(b,d)-Math.min(a,c);
        }
        return len;
    }
}
