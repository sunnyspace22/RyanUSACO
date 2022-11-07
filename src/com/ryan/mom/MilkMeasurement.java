package com.ryan.mom;

import com.ryan.Kattio;

import java.util.*;

public class MilkMeasurement {
    public static void main(String[] args){
        Kattio kattio=new Kattio();
        int line=kattio.nextInt();
        int day=0, produceChange=0, cowProduce=0, changeNeeded=0, max=7;
        String cow=null;
        HashMap<String, Integer> cowProduceMap=new HashMap<>();


        cowProduceMap.put("Bessie", 7);
        cowProduceMap.put("Elsie", 7);
        cowProduceMap.put("Mildred", 7);

        TreeMap<Integer, HashMap<String, Integer>> map=new TreeMap<>();
        for(int i=0;i<line;i++)
        {
            day=kattio.nextInt();
            cow=kattio.next();
            produceChange=kattio.nextInt();
            HashMap<String, Integer> thisCow=new HashMap<>();
            thisCow.put(cow, produceChange);
            map.put(day,thisCow);
        }

        for(Map.Entry<Integer, HashMap<String, Integer>> entry : map.entrySet()){
            HashMap<String, Integer> produceChangeMap=entry.getValue();
            cow=produceChangeMap.keySet().iterator().next();
            produceChange=produceChangeMap.values().iterator().next();
            cowProduce=cowProduceMap.get(cow)+produceChange;
            if(cowProduce>=max)
            {
                changeNeeded++;
                max=cowProduce;
                cowProduceMap.put(cow, cowProduce);
            }
            else if(cowProduceMap.get(cow)==max && cowProduce<max) {
                changeNeeded++;
                cowProduceMap.put(cow, cowProduce);
                max = Collections.max(cowProduceMap.values());
            }
        }
        kattio.println(changeNeeded);
        kattio.close();
    }

}
