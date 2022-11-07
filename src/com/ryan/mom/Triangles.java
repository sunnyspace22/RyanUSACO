package com.ryan.mom;

import com.ryan.Kattio;

public class Triangles {

    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();

        int n=kattio.nextInt();

        Point[] points=new Point[n];
        for(int i=0;i<n;i++)
        {
            Point point=new Point(kattio.nextInt(), kattio.nextInt());
            points[i]=point;
        }

        int maxXside=0, maxYside=0, maxArea=0;
        for(int i=0;i<n;i++) {
            maxXside=0;
            maxYside=0;
            for(int j=0;j<n;j++){
                if(points[i].xValue==points[j].xValue){
                    maxYside=Math.max(Math.abs(points[j].yValue-points[i].yValue),maxYside);
                }
                if(points[i].yValue==points[j].yValue){
                    maxXside=Math.max(Math.abs(points[j].xValue-points[i].xValue),maxXside);
                }
            }
            maxArea=Math.max(maxArea,maxXside*maxYside);
        }

        kattio.println(maxArea);
        kattio.close();
    }

    static class Point{
        int xValue, yValue;
        public Point(int x, int y)
        {
            xValue=x;
            yValue=y;
        }

        public int getXValue(){
            return xValue;
        }

        public void setXValue(int value){
            xValue=value;
        }

        public int getYValue(){
            return yValue;
        }
        public void setYValue(int value){
            yValue=value;
        }
    }
}
