package com.ryan;

public class SpeedingRyan {
    public static void main(String[]arg){
        Kattio kattio = new Kattio();
        int road_segs = kattio.nextInt();
        int bessie_segs = kattio.nextInt();

        int [] speed_limits = new int [100];
        int [] bessie_speeds = new int [100];

        int index=0, len=0, speed=0, speeding=0;
        for(int i=0; i<road_segs; i++)
        {
            len=kattio.nextInt();
            speed=kattio.nextInt();

            for(int id=index;id<len;id++)
            {
                speed_limits[id]=speed;
            }
        }

        for(int i=0; i<bessie_segs; i++)
        {
            len=kattio.nextInt();
            speed=kattio.nextInt();

            for(int id=index;id<len;id++)
            {
                bessie_speeds[id]=speed;
            }
        }
        for (int i = 0; i<100; i++){
            speeding = Math.max(speeding, bessie_speeds[i] - speed_limits[i]);
        }
        kattio.print(speeding);
        kattio.close();
    }
}
