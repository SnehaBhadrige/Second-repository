package assignment;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) 
	{
		int f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int a=sc.nextInt();
	
	    for(int i=1;i<=a;i++)
	    {
	    	f=f*i;
	    }
	   System.out.println("factorial of no. is" +f);
	   sc.close();
	}
	
}
