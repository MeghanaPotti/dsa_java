package dsa_arrays;

public class NoOfOccurence {
	
	
	public static void main(String[] args) {
		
		char name[] = {'M','e','g','h','a','n','a'};
		  
		char find='m';
		
		int count=0;
		
		for(int i=0;i<name.length;i++) {
			
			if(name[i]==find) {
				count++;
			}
			
		}
		System.out.println("Method to display no.of occurance");
		System.out.println("Count of "+find+" is " +count);

	}

}
