package dsa_arrays;

public class Practise {

	public static void main(String[] args) {
		
		//Reverse of a String//
		
		String name = "Automation";
		String temp = "";
		
		for(int i=name.length()-1; i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		
		System.out.println("Original name is " +name);
		System.out.println("Reverse name is " +temp);
		
		//Palindrome of a string
		
//		String num = "abc";
//		String palindrome="";
//		
//		for(int i=num.length()-1;i>=0;i--) {
//			palindrome=palindrome+num.charAt(i);
//		}
//		
//		System.out.println("Number is "+num);
//		System.out.println("Palindrome num is "+palindrome);
//		
//		if(num.equals(palindrome)) {
//			System.out.println("Given number is palindrome");
//		}
//		else
//			System.out.println("Given number is not palindrome");
		
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
		
		
		//largest of 3
		
		int a=5, b=3, c=4;
		
		if(a>=b && a>=c) {
			System.out.println("A is the largest number with value "+a);
		}
		else if(b>=a && b>=c) {
			System.out.println("B is the largest number with value "+b);
		}
		else {
			System.out.println("C is the largest number with value "+c);
		}
		
		//pyramid printing
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=2*i-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	 
		// number of words
		
		String name1 = "My name is Meghana";
		String name1Reverse="";
		String name1Arr[]=name1.split(" ");
		System.out.println("Number of words in a string are "+name1Arr.length);

		// reverse of words in a string
		
		for(int i=name1Arr.length-1; i>=0; i--) {
			name1Reverse=name1Reverse+name1Arr[i]+" ";
		}
		System.out.println("Reversed String is "+name1Reverse);
			
		// sorting of array
		
		int[] numbers = {11, 33, 22, 44, 1};
		for(int i=0; i<numbers.length-1; i++) {
			int min=i;
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[j]<numbers[min]) {
					min=j;
				}
			}
			
			int temp1=numbers[min];
			numbers[min]=numbers[i];
			numbers[i]=temp1;
		}
		for(int i=0; i<numbers.length;i++) {
		System.out.print(numbers[i]+" ");  
		}
		System.out.println();
		System.out.println("2nd largest number is "+numbers[numbers.length-2]); 
		System.out.println("Middle number is "+numbers[(numbers.length/2)]);
		
		//duplicate numbers in an array
		
		char[] numbers1 = {'A','U','T','O','M','A','T','I','O','N'};
		for(int i=0; i<numbers1.length-1; i++) {
			for(int j=i+1; j<numbers1.length;j++) {
			if(numbers1[i]==numbers1[j]) {
				System.out.println(numbers1[i]);
				}
			}
		}
		
		//duplicate charcaters in string
		
		String name2 = "INTERVIEW";
		for(int i=0; i<name2.length()-1; i++) {
			for(int j=i+1; j<name2.length(); j++) {
				if(name2.charAt(i)==name2.charAt(j)) {
					System.out.println(name2.charAt(i));
				}
			}
		}
		
		//vowels, consonants, special characters
		
		String place = "aheyd2*";
		int vowelscount=0, conscount=0, specialcount=0;
		
		for(int i=0; i<place.length(); i++) {
			if(place.charAt(i)=='a' || place.charAt(i)=='e' || place.charAt(i)=='i' || place.charAt(i)=='o' || place.charAt(i)=='u') {
				vowelscount++;
			}
			else if(place.charAt(i)>='a' && place.charAt(i)<='z') {
				conscount++;
			}
			else {
				specialcount++;
			}
		}
		
		 vowelscount=0;
		for(int i=0; i<place.length(); i++) {
			switch(place.charAt(i)) {
				case 'a':
				case 'e': 
				case 'i': 
				case 'o':
				case 'u': vowelscount++;
				break;
				default:
			}
		}	
		System.out.println("Vowels count using switch case is "+vowelscount);
		
		System.out.println("Vowels count is "+vowelscount);
		System.out.println("Consonants count is "+conscount);
		System.out.println("Special characters count is "+specialcount);
		
		// prime number
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
