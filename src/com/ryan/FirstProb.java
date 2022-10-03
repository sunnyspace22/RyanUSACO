package com.ryan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FirstProb {

    public static void main(String[] args) {
        // write your code here
        useIterator();
        usePriorityQueue();
    }

    private Properties loadProperties() throws IOException {
        //try with resource with java NIO
        FileReader reader = new FileReader("c:\\temp\test.properties");
        Properties properties = new Properties();
        properties.load(reader);
        return properties;

    }

    private static void useIterator() {
        List<String> list = Arrays.asList("First", "Second", "Third");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(list, Collections.<String>reverseOrder());
        System.out.println("After sorting");
        for (String s : list) {
            System.out.println(s);
        }

        Collections.reverse(list);
        System.out.println("After reversing");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void usePriorityQueue()
    {
        //Queue<String> pQueue=new PriorityQueue<String>((a,b)->{return a.charAt(0)-b.charAt(0);});
        Comparator<String> c=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0)-o2.charAt(0);
            }
        };

        //PriorityQueue Constructor:
        // public PriorityQueue(Collection c)
        // public PriorityQueue(int capacity, Comparator comparator)
        Queue<String> pQueue=new PriorityQueue<String>(5, c);

        pQueue.add("First");
        pQueue.add("Second");
        pQueue.add("Third");
        pQueue.add("Fourth");

        System.out.println("----- Print Priority Queue -----");
        System.out.println(pQueue);
    }
}
