package com.company;


public class Main {

    public static void main(String[] args) {
        int x1 =  0, v1 = 2, x2 = 5, v2 = 3;
        String res = "NO";

        if(!((x1 <= x2 && v1 < v2) || (x2 <= x1 && v2 < v1))){
            while(x1 >= x2){
                x1 += v1;
                x2 += v2;
                if (x1 == x2){
                    res = "YES";
                }
            }

            while(x2 >= x1){
                x1 += v1;
                x2 += v2;
                if (x1 == x2){
                    res = "YES";
                }
            }
        }
        System.out.println(res);
    }
}
