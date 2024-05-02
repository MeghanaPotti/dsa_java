package dsa_arrays;

public class SortArray {

	static int[] numbers = { 1, 21, 11, 5, 41, 3 };

	public void sorting(int[] numbers) {
		
		int length=numbers.length;
		
		for (int i=0; i<length-1 ; i++) {

			int min=i;
			
			for (int j=i+1; j<length ; j++) {

			if (numbers[j]<numbers[min]) {
	
                min=j;
			
			       }
			   }
			
			int temp=numbers[min];
			numbers[min]=numbers[i];
			numbers[i]=temp;
			
			}
	for (int i=0; i<length; i++) {
		System.out.print(numbers[i] +" ");
	   }
				
		System.out.println(" ");
	}

	public static void main(String[] args) {
       SortArray object = new SortArray();
       object.sorting(numbers);
				
	}

}
