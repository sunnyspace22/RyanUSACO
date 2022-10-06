package com.ryan.mom.done;

import com.ryan.Kattio;

import java.lang.*;

//done by Ryan by 10/02

public class BlockedBillboard2_0923 {
    static int b1_x1=0, b1_y1 =0, b1_x2 =0, b1_y2 =0;
    static int lm_x1=0,lm_y1=0,lm_x2=0,lm_y2 =0;


    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        lm_x1=kattio.nextInt();
        lm_y1=kattio.nextInt();
        lm_x2=kattio.nextInt();
        lm_y2=kattio.nextInt();

        b1_x1=kattio.nextInt();
        b1_y1 =kattio.nextInt();
        b1_x2 =kattio.nextInt();
        b1_y2 =kattio.nextInt();


        int tarp_area=getTarpArea(b1_x1, b1_y1, b1_x2, b1_y2, lm_x1, lm_y1, lm_x2, lm_y2);

        kattio.print(tarp_area);
        kattio.close();
    }

    private static int getTarpArea(int x1, int y1, int x2, int y2, int lm_x1, int lm_y1, int lm_x2, int lm_y2)
    {
        int overlap_x=Math.max(0, Math.min(lm_x2, x2)-Math.max(lm_x1, x1));
        int overlap_y=Math.max(0, Math.min(lm_y2, y2)-Math.max(lm_y1, y1));

        boolean x_contains=(x1<=lm_x1) && (lm_x2<=x2);
        boolean y_contains=(y1<=lm_y1) && (lm_y2<=y2);

        int lm_area=(lm_x2-lm_x1)*(lm_y2-lm_y1);
        int overlap_area=overlap_x * overlap_y;

        if (x_contains || y_contains)
            return lm_area-overlap_area;

        return lm_area;
    }
}
