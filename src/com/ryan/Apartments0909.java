

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://cses.fi/problemset/task/1084/
 * https://usaco.guide/problems/cses-1084-apartments/solution
 */


public class Apartments0909 {

    int appNum=0, aptNum=0, allowedRange=0, index=0, count=0;
    int[] applicants=null, apartments=null;
    final String filename="c:\\data\\code\\ryan\\resources\\apartmentInput.txt";

    public static void main(String[] args){
        long startTime=System.nanoTime();
        Apartments0909 aptClass=new Apartments0909();
        aptClass.parseFileInput();
        System.out.println(aptClass.match());
        double elapsedTimeInSecond = ((double) (System.nanoTime()-startTime)) / 1_000_000_000;
        System.out.println("Time elapsed: "+elapsedTimeInSecond);
    }

    private void parseInput()
    {
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            String firstLine=reader.readLine();
            StringTokenizer tokenizer1=new StringTokenizer(firstLine);
            appNum=Integer.parseInt(tokenizer1.nextToken());
            aptNum=Integer.parseInt(tokenizer1.nextToken());
            allowedRange=Integer.parseInt(tokenizer1.nextToken());
            String secondLine=reader.readLine();
            applicants=new int[appNum];
            StringTokenizer tokenizer2=new StringTokenizer(secondLine);
            while(tokenizer2.hasMoreTokens())
            {
                applicants[index]=Integer.parseInt(tokenizer2.nextToken());
                index++;
            }
            String thirdLine=reader.readLine();
            apartments=new int[aptNum];
            StringTokenizer tokenizer3=new StringTokenizer(thirdLine);
            index=0;
            while(tokenizer3.hasMoreTokens())
            {
                apartments[index]=Integer.parseInt(tokenizer3.nextToken());
                index++;
            }
        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    //Using try-with-resources
    private void parseFileInput()
    {
        try(BufferedReader reader=new BufferedReader(new FileReader(filename))) {
            String firstLine=reader.readLine();
            StringTokenizer tokenizer1=new StringTokenizer(firstLine);
            appNum=Integer.parseInt(tokenizer1.nextToken());
            aptNum=Integer.parseInt(tokenizer1.nextToken());
            allowedRange=Integer.parseInt(tokenizer1.nextToken());
            String secondLine=reader.readLine();
            applicants=new int[appNum];
            StringTokenizer tokenizer2=new StringTokenizer(secondLine);
            while(tokenizer2.hasMoreTokens())
            {
               applicants[index]=Integer.parseInt(tokenizer2.nextToken());
               index++;
            }
            String thirdLine=reader.readLine();
            apartments=new int[aptNum];
            StringTokenizer tokenizer3=new StringTokenizer(thirdLine);
            index=0;
            while(tokenizer3.hasMoreTokens())
            {
                apartments[index]=Integer.parseInt(tokenizer3.nextToken());
                index++;
            }
        }
        catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    private int match()
    {
        Arrays.sort(applicants);
        Arrays.sort(apartments);

        int aptIndex=0, appIndex=0;

        while(aptIndex<aptNum && appIndex<appNum)
        {
            if(Math.abs(applicants[appIndex]-apartments[aptIndex])<=allowedRange) {
                count++;
                aptIndex++;
                appIndex++;
            }
            else if(apartments[aptIndex]+allowedRange<applicants[appIndex])
            {
                aptIndex++;
            }
            else
            {
                appIndex++;
            }
        }

        return count;
    }

}
