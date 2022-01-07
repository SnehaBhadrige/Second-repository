package assignment;

import java.util.Scanner;

public class VowelConso {

	public static void main(String[] args) 
	{
	    
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter any character: ");
	    String sc1 = sc.nextLine();
		char op  =sc1.charAt(0);
		
		if(op=='a'|| op=='e'|| op=='i'||op=='o'|| op=='u'||op=='A'|| op=='E'|| op=='I'||op=='O'|| op=='U')
		{
		System.out.println("this is vowel");
		}
		
		else
		{
			System.out.println("this is consonant");
		}
		
	}
	
	
	
	
}
