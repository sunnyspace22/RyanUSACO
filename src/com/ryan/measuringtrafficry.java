package com.ryan;

public class measuringtrafficry {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int length = kattio.nextInt();

        String[] ramps = new String[length];
        int[] starts = new int[length];
        int[] ends = new int[length];

        for(int i = 0; i < length; i++){
            ramps[i] = kattio.next();
            starts[i] = kattio.nextInt();
            ends[i] = kattio.nextInt();
        }

        int low=((int) 1e9) *-1, high=(int)1e9;

        for(int i = length - 1; i >= 0; i--){
            if(ramps[i].equals("none")){
                low = Math.max(low, starts[i]);
                high = Math.min(high, ends[i]);
            }
            else if(ramps[i].equals("on")){
                low = Math.max(0, low - ends[i]);
                high = Math.max(0, high - starts[i]);
            }
            else{
                low = low+starts[i];
                high = high+ends[i];
            }
        }

        kattio.println(low + " " + high);

        low=((int) 1e9) *-1;
        high=(int)1e9;

        for (int i = 0; i < length; i++){
            if(ramps[i].equals("none")){
                low = Math.max(low, starts[i]);
                high = Math.min(high, ends[i]);
            }
            else if (ramps[i].equals("on")){
                low = low+starts[i];
                high = high + ends[i];
            }
            else{
                low = Math.max(0, low - ends[i]);
                high = Math.max(0, high - starts[i]);
            }
        }

        kattio.println(low + " " + high);
        kattio.close();
    }
}
