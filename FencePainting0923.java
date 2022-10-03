import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.StringTokenizer;

public class FencePainting0923 {

    static int a=0, b=0, c=0, d=0, len=0;
    public static void main(String[] args)
    {
        Kattio kattio=new Kattio();
        a=kattio.nextInt();
        b=kattio.nextInt();
        c=kattio.nextInt();
        d=kattio.nextInt();
        kattio.print(getCoveredFence(a, b, c, d));
        kattio.close();

    }

    private static int getCoveredFence(int a, int b, int c, int d)
    {
        if(c>=b || a>=d)
        {
            len=(b-a)+(d-c);
        }
        else {
            len=Math.max(b,d)-Math.min(a,c);
        }
        return len;
    }
}

class Kattio extends PrintWriter {
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
