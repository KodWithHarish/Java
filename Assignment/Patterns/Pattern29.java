package com.kn.pattern;

public class Pattern29 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=0;
			for(int j=1;j<=9;j++) {
				if(j<=5) 
					k++;
				else
					k--;
				if(k<=6-i) 
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
	}