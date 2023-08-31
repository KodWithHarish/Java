import java.util.Scanner;

public class FrequencyOfCharsInAString {
	
	public static void main(String[] args) {
	     Scanner sc =new Scanner(System.in);
	     System.out.print("Enter String --> ");
	     String str = sc.nextLine(); 
			     
	     int[] count = new int[str.length()]; 
	     char charArr[] = str.toCharArray(); 
	     
	     for(int i = 0; i <str.length(); i++) { 
	    	 count[i] = 1; 
	          for(int j = i+1; j <str.length(); j++) { 
	            if(charArr[i] == charArr[j]) { 
	            	count[i]++; 
	            	charArr[j] = ' '; 
	          } 
	       }    
	    }
	    
	    System.out.println("frequency of each character"); 
	    for(int i = 0; i <count.length; i++) { 
	       if(charArr[i] != ' ') 
	          System.out.println(charArr[i] + " --> " + count[i]); 
	       } 
	   }
	}