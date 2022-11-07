package com.ryan.mom.done;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=526
import com.ryan.Kattio;

public class Censoring {

    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        String s = kattio.next();
        String t = kattio.next();

        while (s.contains(t)){
            s=s.substring(0,s.indexOf(t,0))+s.substring(s.indexOf(t,0)+t.length());
        }

        kattio.println(s);
        kattio.close();
    }
}
