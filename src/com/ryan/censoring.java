package com.ryan;

public class censoring {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        String s = kattio.next();
        String t = kattio.next();

        while(s.indexOf(t) != -1){
            s = s.replaceFirst(t, "");
        }
        kattio.println(s);
        kattio.close();
    }
}
