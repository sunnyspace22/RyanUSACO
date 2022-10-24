package com.ryan;

public class LOSTCOW {
    public static void main(String[] args){
        Kattio kattio = new Kattio();
        int x = kattio.nextInt();
        int y = kattio.nextInt();

        int direction = 1; int distance = 1; int totalDistance = 0;
        while(true){
            if ((direction == 1 && x <= y && y <= x + distance) || (direction == -1 && y <= x && y >= x - distance)){
                totalDistance = totalDistance + Math.abs(y-x);
                break;
            }
            else{
                totalDistance += distance * 2;
                distance = distance * 2;
                direction = direction * -1;
            }
        }

        kattio.print(totalDistance);
        kattio.close();
        }
    }
