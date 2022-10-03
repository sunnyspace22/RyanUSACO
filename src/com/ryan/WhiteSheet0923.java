package com.ryan;

//https://codeforces.com/contest/1216/problem/C
public class WhiteSheet0923 {

    //points for white rectangle
    static int wrx1=0, wry1=0, wrx2=0, wry2=0;
    //points for two black rectangle
    static int br1x1=0, br1y1=0, br1x2=0, br1y2=0;
    static int br2x1=0, br2y1=0, br2x2=0, br2y2=0;

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        wrx1=kattio.nextInt();
        wry1=kattio.nextInt();
        wrx2=kattio.nextInt();
        wry2=kattio.nextInt();

        br1x1=kattio.nextInt();
        br1y1 =kattio.nextInt();
        br1x2 =kattio.nextInt();
        br1y2 =kattio.nextInt();

        br2x1=kattio.nextInt();
        br2y1 =kattio.nextInt();
        br2x2 =kattio.nextInt();
        br2y2 =kattio.nextInt();


        int overlap_wb_1=calculateOverlap(wrx1, wry1, wrx2, wry2,br1x1, br1y1, br1x2, br1y2);
        int overlap_wb_2=calculateOverlap(wrx1, wry1, wrx2, wry2,br2x1, br2y1, br2x2, br2y2);
        int overlap_bb=calculateOverlap(br1x1, br1y1, br1x2, br1y2,br2x1, br2y1, br2x2, br2y2);
        int visible_area=getRecArea(wrx1, wry1, wrx2, wry2)-overlap_wb_1- overlap_wb_2 +overlap_bb;
        String can_see=visible_area>0?"YES":"NO";

        kattio.print(can_see);
        kattio.close();
    }

    private static int calculateOverlap(int x1, int y1, int x2, int y2, int xx1, int yy1, int xx2, int yy2) {
        int x_overlap = Math.max(0, Math.min(xx2, x2) - Math.max(xx1, x1));
        int y_overlap = Math.max(0, Math.min(yy2, y2) - Math.max(yy1, y1));

        return x_overlap* y_overlap;
    }

    private static int getRecArea(int x1, int y1, int x2, int y2)
    {
        return (x2-x1)*(y2-y1);
    }
}
