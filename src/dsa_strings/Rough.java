package dsa_strings;

import dsa_arrays.SortArray;

public class Rough{
	
	public static void main (String[] args) {
		
		String name="meghana&";
		int vowelsCount = 0, consonantCount = 0, specialCharCount = 0;
		
		for (int i=0; i<name.length(); i++) {
			if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vowelsCount++;
			}
			else if(name.charAt(i)>='a' && name.charAt(i)<='z')
			{
				consonantCount++;
			}
			else {
				specialCharCount++;
			}
		}
			System.out.println("Number of vowels "+vowelsCount);
			System.out.println("Number of consonants "+consonantCount);
			System.out.println("Number of special charcaters are "+specialCharCount);

		
	}
}
		
	

	

//reverse of a string

//String name= "Meghana";
//String temp= "";
//
//for(int i=name.length()-1; i>=0; i--) {
//	temp=temp+name.charAt(i);
//	
//}
//
//System.out.println("Original String is "+name);
//System.out.println("Reversed string is "+temp);


//swapping without 3rd variable

//int a=2, b=3;
//System.out.println("Initial value of a is "+a);
//System.out.println("Initial value of b is "+b);
//
//a=a+b; //a value is 5(2+3)
//b=a-b; //b value is 2(5-3)
//a=a-b; //a value is 3(5-2)
//
//System.out.println("Updated a value is "+a);
//System.out.println("Updated b value is "+b);	


//vowel,consonants,special characters

//String name="meghana&";
//int vowelsCount = 0, consonantCount = 0, specialCharCount = 0;
//
//for (int i=0; i<name.length(); i++) {
//	if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
//		vowelsCount++;
//	}
//	else if(name.charAt(i)>='a' && name.charAt(i)<='z')
//	{
//		consonantCount++;
//	}
//	else {
//		specialCharCount++;
//	}
//}
//	System.out.println("Number of vowels "+vowelsCount);
//	System.out.println("Number of consonants "+consonantCount);
//	System.out.println("Number of special charcaters are "+specialCharCount);


// palindrome of number

//String originalNum="160010061";
//String reversedNum="";
//	
//for(int i=originalNum.length()-1; i>=0; i--) {
//	reversedNum=reversedNum+originalNum.charAt(i);
//}
//System.out.println("Original number is "+originalNum);
//System.out.println("Reversed number is "+reversedNum);
//
//if(originalNum.equals(reversedNum)) {
//	System.out.println("Given number is palindorme");
//}
//else {
//	System.out.println("Given number is not palindrome");
//}

//palindrome of String

//String originalNum="MOM";
//String reversedNum="";
//	
//for(int i=originalNum.length()-1; i>=0; i--) {
//	reversedNum=reversedNum+originalNum.charAt(i);
//}
//System.out.println("Original number is "+originalNum);
//System.out.println("Reversed number is "+reversedNum);
//
//if(originalNum.equals(reversedNum)) {
//	System.out.println("Given number is palindorme");
//}
//else {
//	System.out.println("Given number is not palindrome");
//}


// arrays/list, Strings, map, set 

// prime number

//int n=3, count=0;
//
//for (int i=2; i<=n/2; i++) {
//	
//	if(n%i==0) {
//		count++;
//	}
//}
//if(count>=1) {
//	System.out.println("Not a primenumber");
//}
//else {
//	System.out.println("Prime number");
//}


// String occurance

//String name= "Meghana";
//char find= 'a';
//int count= 0;
//
//	for(int i=0; i<name.length(); i++) {
//		if(name.charAt(i)==find){
//			count++;
//		}
//	}
//System.out.println("Number of occurances are "+count);


// finding duplicate characters in a string

//String name="Meghana";
//for(int i=0; i<name.length()-1; i++) {
//	for (int j=i+1; j<name.length(); j++) {
//		if(name.charAt(i)==name.charAt(j)) {
//			System.out.println(name.charAt(i));
//		}
//	}
//}


// finding duplicate characters in an array

//char name[]={'M','E','G','H','A','N','A'};
//for(int i=0; i<name.length; i++) {
//	for (int j=i+1; j<name.length; j++) {
//		if(name[i]==name[j]) {
//			System.out.println(name[i]);
//		}
//	}
//}
	

// sorting an array and printing 2nd largest number

//int[] numbers = { 1, 21, 11, 5, 41, 3 };
//
//for(int i=0; i<numbers.length-1; i++) {
//	int min=i;
//	for(int j=i+1; j<numbers.length; j++) {
//		if(numbers[j]<numbers[min]) {
//			min=j;
//		}
//	}
//	int temp=numbers[min];
//	numbers[min]=numbers[i];
//	numbers[i]=temp;
//}
//
//for(int i=0; i<numbers.length;i++) {
//	System.out.print(numbers[i]+" ");  
//}
//	System.out.println();
//   System.out.println("Second largest number is "+numbers[numbers.length-2]);


// number of words in a string and reverse of words in a string

//String places = "hyd vij vskp gnt";
//String reverseOfPlaces= "";
//
//String placesArr[]=places.split(" ");
//System.out.println("No of words in the string places "+placesArr.length);
//	
//	for (int i=placesArr.length-1; i>=0; i--) {
//		reverseOfPlaces=reverseOfPlaces+placesArr[i]+" ";
//	}
//	System.out.println("Reversed places array is "+reverseOfPlaces); 	


// occurances of charcater in a given string

//String location = "Hyd";
//String string6 = "To find first occurance and last occurance";
//	System.out.println("replaced string is "+location.replace('y', 'a'));
//	System.out.println("Single replacement "+string6.replaceFirst("occurance", "repetition"));
//	System.out.println("Multiple replacements "+string6.replaceAll("occurance", ""));
//	System.out.println("Multiple replacements "+string6.replaceAll("c", ""));


// pyramid printing

//int n=6;
//
//for(int i=1; i<=n; i++) {
//	for(int j=1; j<=n-i; j++) {
//		System.out.print(" ");
//	}
//	for(int k=i; k<=2*i-1; k++) {
//		System.out.print("* ");
//	}
//	System.out.println();
//}


//largest of 3 numbers

//int a=1,b=2,c=3;
//
//if(a>=b && a>=c) {
//	System.out.println("A is largest "+a);
//}
//else if(b>=a && b>=c) {
//	System.out.println("B is largest "+b);
//}
//else{
//	System.out.println("C is largest "+c);
//}
