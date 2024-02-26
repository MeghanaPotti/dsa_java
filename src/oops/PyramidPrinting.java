 package oops;
 
//public class PyramidPrinting {
//	
//	public static void main(String[] args) {
//		
//	     int rows = 6;
//	     
//	     for (int i = 1; i <= rows; ++i) {
//	    	 // Print spaces before the stars
//	    	 for (int j = 1; j <= rows - i; ++j) {
//	    		 System.out.print(" ");
//	    	 }
//	    	 
//	    	 // Print stars for the current row
//	    	 for (int k = 1; k <= 2 * i - 1; ++k) {
//	    		 System.out.print("*");
//	    	 }
//	    	 
//	    	 // Move to the next line after each row
//	    	 System.out.println();
//	     }
//	}
//}
 
 public class PyramidPrinting {
	    public static void main(String[] args) {
	        int rows = 6; // You can set the number of rows as needed

	        // Outer loop for the number of rows
	        for (int i = 1; i <= rows; i++) {

	            // Inner loop for printing spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Inner loop for printing asterisks
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}