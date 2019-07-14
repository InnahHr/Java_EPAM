package com.company;

import java.util.Scanner;

public class exercise2_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please entry x");
        double x = in.nextDouble();
        double result = 1;
        if (x<=3){
            result = (x*x)-3*x + 9;
        } else {
            result = 1/((x*x*x)+6);
        }
        System.out.println("Result of operation "+ result);
        in.close();
    }
}
