package com.company;

import java.util.Scanner;

public class exercise3_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.println ("tseloe polozhitelnie chislo ");
        int n =in.nextInt();
        int i = 1;
        int sum =0;
        while (i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.println ("Sum= "+ sum);
        in.close();
    }
}
