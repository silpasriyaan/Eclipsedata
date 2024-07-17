
public class PalindromeDebug {
		public static void main(String[] args)
		{
			
			int n = 1221;
			int r = 0;
			int sum = 0;
			int temp = n;
			
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;	
		}
			System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");	
		}
		}
	}


	
	
	
	
	


