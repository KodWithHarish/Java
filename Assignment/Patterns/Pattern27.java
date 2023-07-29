package com.kn.pattern;

public class Pattern27 {

	public static void main(String[] args) {
		for(int i=1;i<=7; i++) {
			for(int j=1; j<=7; j++) {
				if((i<=4&&j>=5-i&&j<=3+i)||(i>=4&&j>=i-3&&j<=11-i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");

				}
				
			
			}
			System.out.println();
		}
		int k=0;
		for(int i=1;i<=7; i++) {
			if(i<=4) {
				k++;
			}else {
				k--;
			}
			for(int j=1; j<=7; j++) {
				if(j>=5-k&&j<=3+k) {
					System.out.print("*");
				}else {
					System.out.print(" ");

				}
				
			
			}
			System.out.println();
		}
	}

}
