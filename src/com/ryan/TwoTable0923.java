package com.ryan;

public class TwoTable0923 {

    static int testCaseNum=0;

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        testCaseNum=kattio.nextInt();

        int[] room_width_arr=new int[testCaseNum];
        int[] room_height_arr=new int[testCaseNum];

        int[] ftable_x1_arr=new int[testCaseNum];
        int[] ftable_y1_arr=new int[testCaseNum];
        int[] ftable_x2_arr=new int[testCaseNum];
        int[] ftable_y2_arr=new int[testCaseNum];

        int[] stable_width_arr=new int[testCaseNum];
        int[] stable_height_arr=new int[testCaseNum];

        int[] move_distance=new int[testCaseNum];

        for(int i=0;i<testCaseNum;i++) {
            room_width_arr[i]=kattio.nextInt();
            room_height_arr[i]=kattio.nextInt();

            ftable_x1_arr[i]=kattio.nextInt();
            ftable_y1_arr[i]=kattio.nextInt();
            ftable_x2_arr[i]=kattio.nextInt();
            ftable_y2_arr[i]=kattio.nextInt();

            stable_width_arr[i]=kattio.nextInt();
            stable_height_arr[i]=kattio.nextInt();
        }

        for(int i=0;i<testCaseNum;i++) {
            kattio.println(getMoveDistance(room_width_arr[i], room_height_arr[i], ftable_x1_arr[i], ftable_y1_arr[i], ftable_x2_arr[i], ftable_y2_arr[i], stable_width_arr[i], stable_height_arr[i]));
        }


        kattio.close();
    }

    private static double getMoveDistance(int rw, int rh, int fx1, int fy1, int fx2, int fy2, int w2, int h2)
    {
        int w1=fx2-fx1;
        int h1=fy2-fy1;
        int move=Integer.MAX_VALUE;
        int avSpace=0;
        boolean canFit=false;

        if(h2+h1<=rh)
        {
            canFit=true;
            avSpace=Math.max(fy1, rh-fy2);
            move=Math.min(move, h2-avSpace);
        }

        if(w2+w1<=rw)
        {
            canFit=true;
            avSpace=Math.max(fx1, rh-fx2);
            move=Math.min(move, w2-avSpace);
        }

        if(!canFit)
            return -1;
        else
            return Math.max(move, 0);


    }
}
