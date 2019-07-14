package com.company;

import java.util.Scanner;

public class exercise2_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Please enter  A, B ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println ("Please enter x, y, z ");
        int x = in.nextInt();
        int y = in.nextInt();;
        int z = in.nextInt();
          if ((a>=x) & (b>=y) || (a>=y) & (b>=x)) {
              System.out.println("Everything is good");
          } else if ((a>=x) & (b>=z) || (a>=z) & (b>=x)) {
              System.out.println("Everything is good");
          } else if ((a>=y) & (b>=z) || (a>=z) & (b>=y)) {
              System.out.println("Everything is good");
          } else {
              System.out.println("Everything isn't good");
          }

    }
}