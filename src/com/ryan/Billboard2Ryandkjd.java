package com.ryan;

public class Billboard2Ryandkjd {

    public static void main(String[] arg) {

    Kattio kattio = new Kattio();
    int bx1 = kattio.nextInt();
    int by1 = kattio.nextInt();
    int bx2 = kattio.nextInt();
    int by2 = kattio.nextInt();

    int lx1 = kattio.nextInt();
    int ly1 = kattio.nextInt();
    int lx2 = kattio.nextInt();
    int ly2 = kattio.nextInt();

    int tarp_area = calcArea(bx1,by1,bx2,by2,lx1,ly1,lx2,ly2);
    kattio.print(tarp_area);
    kattio.close();
    }

    private static int calcArea(int bx1, int by1, int bx2, int by2, int lx1, int ly1, int lx2, int ly2) {
    if (lx1 <= bx1 && bx2 <= lx2) {
        int area = (bx2 - bx1) * (by2 - ly2);
        return area;
    }
    if (ly1 <= by1 && by2 <= ly2) {
        int area = (by2 - by1) * (lx1 - bx1);
        return area;
    }
    else {
        int area = (bx2-bx1) * (by2 - by1);
        return area;
    }
    }
}