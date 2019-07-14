package com.company;

import java.util.Scanner;

public class exercise3_2 {

    public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Entry [a,b] and h");
	int a = in.nextInt();
	int b = in.nextInt();
	int h = in.nextInt();
	int y;
	if (a<b) {
		while ((a <= 2) & (a <= b)) {
			y = -a;
			System.out.println("y=-x; \n y=" + y);
			a = a + h;
		}
		while ((a > 2) & (a <= b)) {
			y = a;
			System.out.println("y=x; \n y=" + y);
			a = a + h;
		}
	} else {
		System.out.println("no solution");
	}
	 }
}
