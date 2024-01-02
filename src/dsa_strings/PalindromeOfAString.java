package dsa_strings;

public class PalindromeOfAString {

	public static void main(String[] args) {

         String actualvalue = "MOM";
         String temp = "";
         
         
         
         for (int i=actualvalue.length()-1; i>=0; i--) {
        	 temp = temp+actualvalue.charAt(i);
         }

         if (temp.equals(actualvalue))  // == used for comparing memory location in strings and .equals for comparing value
    		 System.out.println("Value is palindrome string");
         else
        	 System.out.println("Value is not palindrome string");
         
          System.out.println("Actual value is "+actualvalue);
          System.out.println("Palindrome value is "+temp);
         
          
	}

}
