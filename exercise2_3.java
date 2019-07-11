package com.company;

import java.util.Scanner;

        public class exercise2_3 {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println ("Please enter  (x1;y1) ");
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                System.out.println ("Please enter  (x2;y2) ");
                int x2 = in.nextInt();
                int y2 = in.nextInt();;
                System.out.println ("Please enter  (x3;y3) ");
                int x3 = in.nextInt();
                int y3 = in.nextInt();
                double s = 0;
                s = ((x1-x3)*(y2-y3) - (x2-x3)*(y1-y3));
                if (s==0) {
                    System.out.println("These points lie on the same line");
                } else {
                    System.out.println ("These points do not lie on the same line");
                }

    }
}
