package com.ryan;

import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=663

public class SquarePasture0923 {
    //points for rectangle 1
    static int r1x1=0, r1y1=0, r1x2=0, r1y2=0;
    //points for rectangle 2
    static int r2x1=0, r2y1=0, r2x2=0, r2y2=0;


    public static void main(String[] args) throws IOException {
        Kattio kattio=new Kattio();
        r1x1=kattio.nextInt();
        r1y1=kattio.nextInt();
        r1x2=kattio.nextInt();
        r1y2=kattio.nextInt();

        r2x1=kattio.nextInt();
        r2y1=kattio.nextInt();
        r2x2=kattio.nextInt();
        r2y2=kattio.nextInt();
        kattio.print(getSquareToCoverOrig(r1x1, r1y1, r1x2, r1y2,r2x1, r2y1, r2x2, r2y2));
        kattio.close();
    }

    private static int getSquareToCoverOrig(int x1, int y1, int x2, int y2, int xx1, int yy1, int xx2, int yy2)
    {
        int width=Math.max(xx2, x2)-Math.min(xx1, x1);
        int height=Math.max(yy2, y2)-Math.min(yy1, y1);
        return Math.max(width, height)* Math.max(width, height);
    }
}

