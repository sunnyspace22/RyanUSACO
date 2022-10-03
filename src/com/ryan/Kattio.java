package com.ryan;

import java.io.*;
import java.util.StringTokenizer;

public class Kattio extends PrintWriter {
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

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                if ((line = reader.readLine()) != null)
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
