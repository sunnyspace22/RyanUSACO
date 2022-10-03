package com.ryan;

import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;


//http://www.usaco.org/index.php?page=viewproblem2&cpid=759
public class BlockedBillboard0923 {

    /*
    b1x1, b1x2 used for x coordinates of billboard 1, b1y1, b1y2 used for y coordinates of billboard 1
    b2x1, b2x2 used for x coordinates of billboard 2, b2y1, b2y2 used for y coordinates of billboard 2
    b3x1, b3x2 used for x coordinates of billboard 3, b3y1, b3y2 used for y coordinates of billboard 3
    We need to calculate the overlap area b3 has for b1 and b2
    If there is area overlapping for billboard1 and billboard3, then
    Math.min(b3x2, b1x2)-Math.max(b3x1, b1x1)>0 && Math.min(b3y2, b1y2)-Math.max(b3y1, b1y1)>0
    To get the overlapped area:
    (Math.min(b3x2, b1x2)-Math.max(b3x1, b1x1)) * (Math.min(b3y2, b1y2)-Math.max(b3y1, b1y1))
    */
    static int b1x1=0, b1y1=0, b1x2=0, b1y2=0;
    static int b2x1=0, b2y1=0, b2x2=0, b2y2=0;
    static int b3x1=0, b3y1=0, b3x2=0, b3y2=0;

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        b1x1=kattio.nextInt();
        b1y1=kattio.nextInt();
        b1x2=kattio.nextInt();
        b1y2=kattio.nextInt();

        b2x1=kattio.nextInt();
        b2y1=kattio.nextInt();
        b2x2=kattio.nextInt();
        b2y2=kattio.nextInt();

        b3x1=kattio.nextInt();
        b3y1=kattio.nextInt();
        b3x2=kattio.nextInt();
        b3y2=kattio.nextInt();

        int overlap_area=calculateOverlap(b1x1, b1y1, b1x2, b1y2, b3x1, b3y1, b3x2, b3y2)+calculateOverlap(b2x1, b2y1, b2x2, b2y2, b3x1, b3y1, b3x2, b3y2);
        //billboard area minus overlapped area will equal to the can see area
        int see_area= getBillboardArea(b1x1, b1y1, b1x2, b1y2)+getBillboardArea(b2x1, b2y1, b2x2, b2y2)-overlap_area;

        kattio.print(see_area);
        kattio.close();

    }

    private static int calculateOverlap(int x1, int y1, int x2, int y2, int xx1, int yy1, int xx2, int yy2) {
        int x_overlap = Math.min(xx2, x2) - Math.max(xx1, x1);
        int y_overlap = Math.min(yy2, y2) - Math.max(yy1, y1);
        if (x_overlap > 0 &&  y_overlap > 0)
        {
            return x_overlap* y_overlap;
        }

        return 0;
    }

    private static int getBillboardArea(int x1, int y1, int x2, int y2)
    {
        return (x2-x1)*(y2-y1);
    }
}


/**
class Kattio extends PrintWriter {
    BufferedReader reader = null;
    StringTokenizer st = null;
    String line = null;

    public Kattio() {
        this(System.in, System.out);
    }

    public Kattio(InputStream in, OutputStream out) {
        super(out);
        reader = new BufferedReader(new InputStreamReader(in));
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                if ((line = reader.readLine()) != null)
                    st = new StringTokenizer(line);
                else
                    return null;
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return st.nextToken();

    }
}
**/
