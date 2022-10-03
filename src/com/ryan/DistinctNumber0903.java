package com.ryan;

import java.io.*;
import java.util.*;

public class DistinctNumber0903 {
    public static void main(String[] args) {
        long startTime=System.nanoTime();
        //create a class instance
        Kattio kattio=new Kattio();
        int num=kattio.nextInt();
        int[] numbers=new int[num];
        for(int i=0;i<num;i++)
        {
            numbers[i]=kattio.nextInt();
        }
        DistinctNumber0903 dNum=new DistinctNumber0903();
        System.out.println(dNum.getNumOfDistinctValue(numbers));
        double elapsedTimeInSecond = ((double) (System.nanoTime()-startTime)) / 1_000_000_000;
        System.out.println("Time elapsed: "+elapsedTimeInSecond);

    }

    private int getNumOfDistinctValue(int[] numArr)
    {
        HashSet<Integer> numSet=new HashSet<Integer>();
        for(int num : numArr)
        {
            numSet.add(num);
        }
        return numSet.size();
    }


    private int[] readInputAsList(String fileName) {
        BufferedReader reader=null;
        int size=0;
        String numStr=null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            size = Integer.parseInt(reader.readLine());
            numStr = reader.readLine();
        }
        catch(IOException exception)
        {
            System.out.println(exception.getMessage());
        }
        finally {
            if(reader!=null) {
                try {
                    reader.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }

        int[] inputNum=new int[size];
        StringTokenizer tokenizer=new StringTokenizer(numStr);
        int index=0;
        while(tokenizer.hasMoreTokens())
        {
            inputNum[index]=Integer.parseInt(tokenizer.nextToken());
            index++;
        }
        return inputNum;
    }

    private void printOutResult(int result)
    {
        System.out.println(result);
    }
}

