package com.ryan;

public class CowSignalingRyan {
    static int length = 0;
    static int width = 0;
    static int scale = 0;

    public static void main(String[]arg){
        Kattio kattio = new Kattio();
        length = kattio.nextInt();
        width = kattio.nextInt();
        scale = kattio.nextInt();

        for (int i = 0; i < length; i++){
            String input = kattio.next();
            for (int k = 0; k < scale; k++) {
                for (char each : input.toCharArray()) {
                    for (int j = 0; j < scale; j++) {
                        kattio.print(each);
                    }
                }
                kattio.println();
            }
        }
        kattio.close();
    }
}
