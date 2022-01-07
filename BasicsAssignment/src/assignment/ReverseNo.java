package assignment;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a= sc.nextInt();
	    int rem=0;
	    int rev=0;
	    while(a!=0)
	    {
		  rem=a%10;
		  rev=rev*10+rem;
		  a=a/10;
	    }
	   System.out.println("reverse no. is:" +rev);
	  
	}

}
