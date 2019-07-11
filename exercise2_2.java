package com.company;

import java.util.Scanner;

public class exercise2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Please enter  A ");
        double a = in.nextDouble();
        System.out.println ("Please enter  B");
        double b = in.nextDouble();
        System.out.println ("Please enter  C ");
        double c = in.nextDouble();
        System.out.println ("Please enter  D ");
        double d = in.nextDouble();
        double min1, min2, max;
        if (a < b) {
        min1 = a;
        } else {
            min1 = b;
        }
        if ( c < d) {
            min2=c;
        } else {
            min2 = d;
        }
        if (min1>min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println("min1(a;b)= " + min1 + ", min2(c;d)= " + min2+ ". Max(min1; min2) = " + max);
        in.close();
    }
}
