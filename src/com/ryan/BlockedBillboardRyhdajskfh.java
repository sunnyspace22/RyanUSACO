package com.ryan;

public class BlockedBillboardRyhdajskfh {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int b1x1 = kattio.nextInt();
        int b1y1 = kattio.nextInt();
        int b1x2 = kattio.nextInt();
        int b1y2 = kattio.nextInt();

        int b2x1 = kattio.nextInt();
        int b2y1 = kattio.nextInt();
        int b2x2 = kattio.nextInt();
        int b2y2 = kattio.nextInt();

        int tx1 = kattio.nextInt();
        int ty1 = kattio.nextInt();
        int tx2 = kattio.nextInt();
        int ty2 = kattio.nextInt();

        int overlap_area=calcOverlap(b1x1, b1y1, b1x2, b1y2, tx1, ty1, tx2, ty2)+calcOverlap(b2x1, b2y1, b2x2, b2y2, tx1, ty1, tx2, ty2);
        int see_area= getBillboardArea(b1x1, b1y1, b1x2, b1y2)+getBillboardArea(b2x1, b2y1, b2x2, b2y2)-overlap_area;

        kattio.print(see_area);
        kattio.close();
    }

    private static int calcOverlap(int x1, int y1, int x2, int y2, int tx1, int ty1, int tx2, int ty2) {
        //this is important
        int x_overlap = Math.min(tx2, x2) - Math.max(tx1, x1);
        x_overlap=Math.max(x_overlap,0);
        int y_overlap = Math.min(ty2, y2) - Math.max(ty1, y1);
        y_overlap=Math.max(x_overlap,0);
        return x_overlap* y_overlap;
    }
    private static int getBillboardArea(int x1, int y1, int x2, int y2)
    {
        return (x2-x1)*(y2-y1);
    }
}