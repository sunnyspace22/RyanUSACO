package com.ryan;

import java.util.ArrayList;

public class mowingthefield {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int n = kattio.nextInt();
        String[] direction = new String[n];
        int[] steps = new int[n];
        ArrayList<String> cells = new ArrayList<String>();
        int x = 0;
        int y = 0;
        int first_time = 0;
        int last_time = 0;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            direction[i] = kattio.next();
            steps[i] = kattio.nextInt();

            if (direction[i].equals("N")){
                for (int j = 0; j < steps[i]; j++){
                    x = x;
                    y = y+1;
                    if (cells.lastIndexOf(x + "" + y) > -1){
                        first_time = cells.lastIndexOf(x + "" + y);
                        cells.add(x + "" + y);
                        last_time = cells.lastIndexOf(x + "" + y);
                        result = Math.min(result, last_time - first_time);
                    }
                    else{
                        cells.add(x + "" + y);
                    }
                }
            }
            else if (direction[i].equals("S")) {
                for (int j = 0; j < steps[i]; j++) {
                    x = x;
                    y = y - 1;
                    if (cells.lastIndexOf(x + "" + y) > -1){
                        first_time = cells.lastIndexOf(x + "" + y);
                        cells.add(x + "" + y);
                        last_time = cells.lastIndexOf(x + "" + y);
                        result = Math.min(result, last_time - first_time);
                    }
                    else {
                        cells.add(x + "" + y);
                    }
                }
            }
            else if (direction[i].equals("E")) {
                for (int j = 0; j < steps[i]; j++) {
                    x = x + 1;
                    y = y;
                    if (cells.lastIndexOf(x + "" + y) > -1){
                        first_time = cells.lastIndexOf(x + "" + y);
                        cells.add(x + "" + y);
                        last_time = cells.lastIndexOf(x + "" + y);
                        result = Math.min(result, last_time - first_time);
                    }
                    else {
                        cells.add(x + "" + y);
                    }
                }
            }
            else if (direction[i].equals("W")) {
                for (int j = 0; j < steps[i]; j++) {
                    x = x - 1;
                    y = y;
                    if (cells.lastIndexOf(x + "" + y) > -1){
                        first_time = cells.lastIndexOf(x + "" + y);
                        cells.add(x + "" + y);
                        last_time = cells.lastIndexOf(x + "" + y);
                        result = Math.min(result, last_time - first_time);
                    }
                    else {
                        cells.add(x + "" + y);
                    }
                }
            }
        }
        kattio.println(result);
        kattio.close();
    }
}
