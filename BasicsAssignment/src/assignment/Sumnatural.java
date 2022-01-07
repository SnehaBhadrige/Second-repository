package assignment;

public class Sumnatural {

	int a;
	int b;
	int c;
public void Addition(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println("Addition of natural no.:"+d);
}
	
public static void main(String[] args) 
{
	Sumnatural k = new Sumnatural();
	k.Addition(10, 20, 30);
}	
	
}
