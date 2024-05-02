package dsa_arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		int initialNumber = -141;
		int number=initialNumber;
		int reverse=0;
		int remainder;
		
		while(number!=0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		
		System.out.println("reversed number is " +reverse);
		
		if(initialNumber==reverse) {
			System.out.println("Given int is palindrome");
		}
		else
			System.out.println("Given int is not palindrome");
	}
}
