package com.kn.pattern;

public class Pattern31 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			int k=0;
			if(i<=5) {
				k++;
			}
			else {
				k--;
			}
			for(int j=1;j<=9;j++) {
				if(j<=i+k || j>=i+k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
	}
}				
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						) 
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}

}
