package dsa_strings;

public class PalindromeOfAString {

	public static void main(String[] args) {

//         String actualvalue = "MOMS";
//         String temp = "";
//         
//         
//         
//         for (int i=actualvalue.length()-1; i>=0; i--) {
//        	 temp = temp+actualvalue.charAt(i);
//         }
//
//         if (temp.equals(actualvalue))  // == used for comparing memory location in strings and .equals for comparing value
//    		 System.out.println("Value is palindrome string");
//         else
//        	 System.out.println("Value is not palindrome string");
//         
//          System.out.println("Actual value is "+actualvalue);
//          System.out.println("Palindrome value is "+temp);
         
		  int rows = 6;
		     
		     for (int i = 1; i <= rows; ++i) {
		    	 // Print spaces before the stars
		    	 for (int j = 1; j <= rows - i; ++j) {
		    		 System.out.print(" ");
		    	 }
		    	 
		    	 // Print stars for the current row
		    	 for (int k = 1; k <= 2 * i - 1; ++k) {
		    		 System.out.print("*");
		    	 }
		    	 
		    	 // Move to the next line after each row
		    	 System.out.println();
          
	}
  }
}
