package assignment;

public class Swap {
    
	
	public void swap(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swap");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		System.out.println("before swap");
		Swap s= new Swap();
		s.swap(10, 20);
	}

}
