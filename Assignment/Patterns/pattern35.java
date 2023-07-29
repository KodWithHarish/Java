package com.kn.pattern;

public class pattern35 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;i++) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}System.out.println("");
		}
	}

}
