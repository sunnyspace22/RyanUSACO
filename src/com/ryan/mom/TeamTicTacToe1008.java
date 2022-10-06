package com.ryan.mom;


import java.io.*;
import java.util.*;

public class TeamTicTacToe1008 {
    static char[][] board = new char[3][3];
    static int oneCowVictory=0, twoCowVictory=0;

    public static void main(String[] args) {
        Kattio kattio = new Kattio();
        for (int i = 0; i < 3; i++) {
            String row = kattio.next();
            for (int j = 0; j < 3; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        CountVictory();

        System.out.println(oneCowVictory);
        System.out.println(twoCowVictory);

    }

    private static void CountVictory() {
        int count=0;
        //check row
        for (int i = 0; i < 3; i++) {
            CheckOneVictory(board[i][0],board[i][1],board[i][2]);
            CheckTwoCowVictory(board[i][0],board[i][1],board[i][2]);
        }
        //check colum
        for (int i = 0; i < 3; i++) {
            CheckOneVictory(board[0][i],board[1][i],board[2][i]);
            CheckTwoCowVictory(board[0][i],board[1][i],board[2][i]);
        }
        //check diagonal
        CheckOneVictory(board[0][0],board[1][1],board[2][2]);
        CheckOneVictory(board[2][0],board[1][1],board[0][2]);

        CheckTwoCowVictory(board[0][0],board[1][1],board[2][2]);
        CheckTwoCowVictory(board[2][0],board[1][1],board[0][2]);
    }

    private static void CheckOneVictory(char first, char second, char third)
    {
        if(first==second && second==third)
            oneCowVictory++;
    }

    private static void CheckTwoCowVictory(char first, char second, char third)
    {
        TreeSet<Character> set=new TreeSet<>();

        set.add(first);
        set.add(second);
        set.add(third);
        if(set.size()==2)
            twoCowVictory++;
    }



    static class Kattio extends PrintWriter {
        BufferedReader reader = null;
        StringTokenizer st = null;
        String line = null;

        public Kattio() {
            this(System.in, System.out);
        }

        public Kattio(InputStream in, OutputStream out) {
            super(out);
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt()
        {
            return Integer.parseInt(next());
        }

        public long nextLong()
        {
            return Long.parseLong(next());
        }

        public double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public String next()
        {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    if((line=reader.readLine())!=null)
                        st = new StringTokenizer(line);
                    else
                        return null;
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
            return st.nextToken();

        }
    }
}


