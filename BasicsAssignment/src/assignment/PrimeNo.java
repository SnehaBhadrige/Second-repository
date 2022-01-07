package assignment;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args)
	{
		int t=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no:");
		int a=sc.nextInt();
		
		for(int i=2; i<=a-1;i++)
		{
			if(a%i==0)                         //its divisible only its self and 1  
			{
				t++;
			}
		}
		
		if(t>0)
		{
			System.out.println("No.is not prime");
		}
		else
		{
			System.out.println("No.is prime");
		}
	sc.close();
	}
	
	}

	

