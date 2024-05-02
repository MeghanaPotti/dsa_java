package oops;

public class PrimeNumber {

		public static void main(String[] args)
		{
			int n=5, count=0;
			
			if(n<=1)
				
				System.out.println("Not a prime number");
			
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
				count++;
				}
			}
				if(count>=1)
					System.out.println("Not a prime number");
				else
					System.out.println("Prime number");
			}
				
		}

