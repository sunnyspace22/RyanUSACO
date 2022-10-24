package com.ryan.mom.done;

import com.ryan.Kattio;

public class MeasuringTraffic {

    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        int numSegment = kattio.nextInt();

        String[] ramps = new String[numSegment];
        int[] starts = new int[numSegment];
        int[] ends = new int[numSegment];

        int low = ((int) 1e9) * -1, high = (int) 1e9;

        for (int i = 0; i < numSegment; i++) {
            ramps[i] = kattio.next();
            starts[i] = kattio.nextInt();
            ends[i] = kattio.nextInt();
        }


        for (int i = numSegment - 1; i >= 0; i--) {
            if (ramps[i].equals("none")) {
                low = Math.max(starts[i], low);
                high = Math.min(ends[i], high);
            } else if (ramps[i].equals("on")) {
                low = Math.max(0, low - ends[i]);
                high = Math.max(0, high - starts[i]);
            } else {
                low = low + starts[i];
                high = high + ends[i];
            }
        }

        kattio.println(low + " " + high);
        low = ((int) 1e9) * -1;
        high = (int) 1e9;

        for (int i = 0; i < numSegment; i++) {
            if (ramps[i].equals("none")) {
                low = Math.max(starts[i], low);
                high = Math.min(ends[i], high);
            } else if (ramps[i].equals("off")) {
                low = Math.max(0, low - ends[i]);
                high = Math.max(0, high - starts[i]);
            } else {
                low = low + starts[i];
                high = high + ends[i];
            }
        }

        kattio.println(low + " " + high);
        kattio.close();
    }
}
