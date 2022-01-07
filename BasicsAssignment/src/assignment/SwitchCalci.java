package assignment;

import java.util.Scanner;

public class SwitchCalci {

	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter value a");
		int a=sc1.nextInt(); 
		System.out.println("enter value b");
		int b=sc1.nextInt(); 
		
		System.out.println("1.Addition\n 2.subtraction\n 3.Multiplication \n 4.Division \n 5.Modulo");
		
		System.out.println("enter operation no.");
		int op=sc1.nextInt();
		
		switch(op)
		{
		case 1:
			int c=a+b;
			System.out.println("addition of a & b is" +c);
			break;
		
		case 2:
			c=a-b;
			System.out.println("subtraction of a & b is" +c);
			break;
		
		case 3:
			c=a*b;
			System.out.println("Multiplication of a & b is" +c);
			break;
		
		case 4:
			c=a/b;
			System.out.println("Division of a & b is" +c);
			break;
			
		case 5:
			c=a%b;
			System.out.println("Modulo of a & b is" +c);	
			break;
		
		}
		
		sc1.close();
		
		
	}

}
