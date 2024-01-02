package dsa_strings;

public class ReverseOfAString {

	public static void main(String[] args) {
		
      String actual = "Meghana";
      String temp = "";
      	
		for (int i=actual.length()-1; i>=0; i--) {
			temp = temp+actual.charAt(i);
		}
			System.out.println("Actual string is "+actual);
			System.out.println("Reverse string is "+temp);	
	}

}
