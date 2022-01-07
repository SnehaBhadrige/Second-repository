package assignment;

public class Fibonacci {

	public static void main(String[] args)
	{
		int n=5;    //series for 5 terms
		int a=0;
		int b=1;
		
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+ " ");
			int c= a+b;
			a=b;
			b=c;
		}
		
	}
	
	
	
}
