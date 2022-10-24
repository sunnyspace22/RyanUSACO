package com.ryan.mom.done;

import com.ryan.Kattio;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=665

public class CowSignal {
    public static void main(String[] arg)
    {
        Kattio kattio=new Kattio();
        int lineCount=kattio.nextInt();
        int charCount=kattio.nextInt();
        int replica=kattio.nextInt();

        for(int i=0;i<lineCount;i++)
        {
            String input=kattio.next();
            for(char c : input.toCharArray())
            {
                for(int r=0;r<replica;r++)
                {
                    kattio.print(c);
                }
            }
            kattio.println();
        }

        kattio.close();
    }

}
