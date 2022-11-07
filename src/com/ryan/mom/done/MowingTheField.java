package com.ryan.mom.done;

import com.ryan.Kattio;

/**
 * http://www.usaco.org/index.php?page=viewproblem2&cpid=593
 */
public class MowingTheField {
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        int[][] lastVisit=new int[21][21];
        int maxVal=Integer.MAX_VALUE, lastRow=10, lastCol=10, count=1, stepCount=0;
        int lineCount=kattio.nextInt();

        String direction=null;

        for(int i=0;i<lineCount;i++)
        {
            direction=kattio.next();
            stepCount=kattio.nextInt();


            if(direction.equals("E")){

                for(int j=lastCol+1;j<=lastCol+stepCount;j++){
                    if(lastVisit[lastRow][j]!=0)
                        maxVal=Math.min(count-lastVisit[lastRow][j], maxVal);
                    lastVisit[lastRow][j]=count;
                    count++;
                }
                lastCol=lastCol+stepCount-1;
            }
            else if(direction.equals("W")) {
                for(int j=lastCol-1;j>=lastCol-stepCount;j--){
                    if(lastVisit[lastRow][j]!=0)
                        maxVal=Math.min(count-lastVisit[lastRow][j], maxVal);
                    lastVisit[lastRow][j]=count;
                    count++;
                }
                lastCol=lastCol-stepCount+1;
            }
            else if(direction.equals("S")) {
                for(int j=lastRow+1;j>=lastRow+stepCount;j++){
                    if(lastVisit[j][lastCol]!=0)
                        maxVal=Math.min(count-lastVisit[j][lastCol], maxVal);
                    lastVisit[j][lastCol]=count;
                    count++;
                }
                lastRow=lastRow+stepCount-1;
            }
            else {
                for(int j=lastRow-1;j>lastRow-stepCount;j--){
                    if(lastVisit[j][lastCol]!=0)
                        maxVal=Math.min(count-lastVisit[j][lastCol], maxVal);
                    lastVisit[j][lastCol]=count;
                    count++;
                }
                lastRow=lastRow-stepCount+1;
            }

        }

        kattio.println(maxVal);
        kattio.close();

    }


}
