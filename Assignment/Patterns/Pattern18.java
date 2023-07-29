package com.kn.pattern;

public class Pattern18 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
					if(j>=i) {
						System.out.print((char)(70-i));
	
					}else {
						System.out.print(" ");
					}
			}
			System.out.println();
	}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				
					if(j>=i) {
						System.out.print((char)(64+i));
	
					}else {
						System.out.print(" ");
					}
			}
			System.out.println();
	}
		
		
		System.out.println("\n\n");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
					if(j>=i) {
						System.out.print((char)(70-j));
	
					}else {
						System.out.print(" ");
					}
			}
			System.out.println();
	}
	}

}
