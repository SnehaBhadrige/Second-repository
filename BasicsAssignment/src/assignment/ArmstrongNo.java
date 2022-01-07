package assignment;
import java.lang.Math;
public class ArmstrongNo {

public static void main(String[] args) 
{
	double a= 153;
	
	double c= Math.pow(1, 3)+Math.pow(5, 3)+Math.pow(3, 3);
	if(c==a)
	{
		System.out.println("the no. is armstrong number");
	}
	else
	{
		System.out.println("the no. is not armstrong number");
	}

}

}
