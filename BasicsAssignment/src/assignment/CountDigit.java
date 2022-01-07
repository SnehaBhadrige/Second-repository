package assignment;

public class CountDigit {

	public static void main(String[] args) 
	{
		int a=198;
		int digit=0;
		
		while(a>0)
		{
			a=a/10;
			digit++;
		}
		System.out.println("my digit count is:"+digit);
		
	}

}
