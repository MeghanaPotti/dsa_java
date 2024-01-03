package dsa_arrays;

public class SortArray {

	int[] numbers = {21,11,31,51,41};
	int min = numbers[0];
	
	void sorting() {
	
	for (int i=0; i<numbers.length ; ++i) {
		 
		if (numbers[i]<min) {
			min = numbers[i];
			numbers[i]++;
		}
		
	}
	}

	public static void main(String[] args) {
		
		SortArray object = new SortArray();
		object.sorting();
		System.out.println("Order of array is "+object.min);

	}

}
