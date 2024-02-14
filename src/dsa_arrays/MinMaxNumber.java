package dsa_arrays;

public class MinMaxNumber {
	
	    int[] numbers = {1,2,3};
	    int min=numbers[0];
	    int max=numbers[0];
	   
	   void minmax() {
	   
	   for(int i=0;i<numbers.length;++i) {
			
			if (numbers[i]<min) {  
				min = numbers[i];
			}
			 if (numbers[i]>max) {
				max = numbers[i];
			}
		}
	   }
	   
	   public static void main (String[] args) {
		
		   MinMaxNumber object = new 	MinMaxNumber();
		   object.minmax();
		   System.out.println("This is minimum and maximum number validation method");
		   System.out.println("Minimum number is "+object.min);
		   System.out.println("Maximum number is "+object.max);   
	   }
}
	

