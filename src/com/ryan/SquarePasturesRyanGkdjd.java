package com.ryan;

public class SquarePasturesRyanGkdjd {
    public static void main(String[] arg){
        Kattio kattio = new Kattio();
        int x1 = kattio.nextInt();
        int y1 = kattio.nextInt();
        int x2 = kattio.nextInt();
        int y2 = kattio.nextInt();
        int x3 = kattio.nextInt();
        int y3 = kattio.nextInt();
        int x4 = kattio.nextInt();
        int y4 = kattio.nextInt();

        int bottom_x = Math.min(x1,x3);
        int top_x = Math.max(x2,x4);
        int bottom_y = Math.min(y1,y3);
        int top_y = Math.min(y2,y4);
        int sidelength = (Math.max((top_y - bottom_y),(top_x - bottom_x))) * (Math.max((top_y - bottom_y),(top_x - bottom_x)));

        kattio.print(sidelength);
        kattio.close();
    }
}
