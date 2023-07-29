package com.kn.pattern;


public class Pattern26 {

	public static void main(String[] args) {
		for(int i=1;i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(j>=6-i && j<=4+i ) {
					if(i%2==0) {
						if(i%2==0)
							System.out.print("*");
						else
							System.out.print(" ");

					}
					
					else {
						if(j%2==1)
							System.out.print("*");
						else {
							System.out.print(" ");

						}
					}
				}else {
					System.out.print(" ");

				}
			
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=6-i) {
					System.out.print("*");
				}
				if(j>=6-i) {
					
				}

			}
			System.out.println();
		}
		
		
		int k;
		for(int i=1;i<=5; i++) {
			k=1;
			for(int j=1; j<=9; j++) {
				if(j>=6-i && j<=4+i &&k==1) {
					System.out.print("*");
					k=0;
				}else {
					System.out.print(" ");
					k=1;

				}
				
			
			}
			System.out.println();
		}
	}

}
