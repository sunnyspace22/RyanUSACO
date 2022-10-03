package com.ryan;

public class WhiteSheetRyaahhb {
    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int x1 = kattio.nextInt();
        int y1 = kattio.nextInt();
        int x2 = kattio.nextInt();
        int y2 = kattio.nextInt();
        int x3 = kattio.nextInt();
        int y3 = kattio.nextInt();
        int x4 = kattio.nextInt();
        int y4 = kattio.nextInt();
        int x5 = kattio.nextInt();
        int y5 = kattio.nextInt();
        int x6 = kattio.nextInt();
        int y6 = kattio.nextInt();

        int overlap_area = calcOverlap(x1, y1, x2, y2, x3, y3, x4, y4) + calcOverlap(x1, y1, x2, y2, x5, y5, x6, y6) - calcOverlap(x3, y3, x4, y4, x5, y5, x6, y6);
        int white_area = (x2 - x1) * (y2 - y1);
        if (overlap_area >= white_area) {
            kattio.print("NO");
        } else {
            kattio.print("YES");
        }
        kattio.close();
    }

    private static int calcOverlap(int x1, int y1, int x2, int y2, int tx1, int ty1, int tx2, int ty2) {
        int x_overlap = Math.min(tx2, x2) - Math.max(tx1, x1);
        x_overlap = Math.max(x_overlap, 0);
        int y_overlap = Math.min(ty2, y2) - Math.max(ty1, y1);
        y_overlap = Math.max(y_overlap, 0);
        return x_overlap * y_overlap;
    }
}

