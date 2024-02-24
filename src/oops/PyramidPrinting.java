package oops;

//public class PyramidPrinting {
//	
//	public static void main(String[] args) {
//		
//	     int rows = 6;
//	     for (int i=0; i<=rows; ++i) {
//	    	 for (int j=0; j<=1; ++j) {
//	    		 System.out.println(".");
//	    	 }
//	    	 System.out.println();
//	     }
//	}
//}


public class PyramidPrinting {
	
	public static void main(String[] args) {
		
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