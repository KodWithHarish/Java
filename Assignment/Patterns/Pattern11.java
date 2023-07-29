package com.kn.pattern;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<6-i;j++) {
					System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
					if(i+j<=6){
						System.out.print("*"+" ");
					}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
					System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
