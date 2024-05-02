package oops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
//		Map<Character, Integer> charCountMap = new HashMap<>();
		
		Set<Character> example = new HashSet<>();
		
		// add, contains, size
		
		String s = "automation";
		
		for(int i=0; i<s.length(); i++) {
			
			if(example.contains(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
			else {
			example.add(s.charAt(i));
			}
		}
		
		System.out.println("Printing Unique charcaters");
		
		for (char ch : example) {
            System.out.print(ch+" ");
        }
		
		
	}

}

