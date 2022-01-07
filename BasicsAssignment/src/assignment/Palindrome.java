package assignment;

public class Palindrome {

	public static void main(String[] args) {
		
       int a=111;
       int num=a;
       int rem;
       int rev=0;
      
       while(a>0)
       {
    	     rem=a%10; 
    	     rev =rev*10+rem;
    	     a= a/10;
       }
       if(rev==a)
       {
    	   System.out.println("No. is palindrome");
       }
       else
       {
    	   System.out.println("No.is not palindrome");
       }
	
	}

}
