package oops;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountSimple {

	    public static void main(String[] args) {
	        String inputString = "qwertyqwertyasdfgzxcvqwe";

	        System.out.println("Original string: " + inputString);
	       
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        //map methods-put,get, containsValue, containsKey, size, keySet

	        char[] characters = inputString.toCharArray();

	        // Count occurrences of each character     
	       
	        for (char ch : characters) {
	        	if(charCountMap.containsKey(ch)) {
		        	int count=charCountMap.get(ch);
		        	charCountMap.put(ch, count+1);
	        	}
	        	else {
	        		charCountMap.put(ch, 1);
	        	}       		           
	        }

	        // Print character count
	        System.out.println("Character count in the string:");
	        
	        for (char ch : charCountMap.keySet()) {
	            int count = charCountMap.get(ch);
	            System.out.println(ch + " - " + count + " times");
	        }      
	        
 
	      // Count occurrences of each string     
	    	
	    	String inputString1 = "my name is name";
	        System.out.println("Original string: " + inputString1);
	       
	        Map<String, Integer> strCountMap = new HashMap<>();
	        
	        //map methods-put,get, containsValue, containsKey, size, keySet

	        String[] arrayName = inputString1.split(" ");

	        for (String arr : arrayName) {
	        	if(strCountMap.containsKey(arr)) {
		        	int count=strCountMap.get(arr);
		        	strCountMap.put(arr, count+1);
	        	}
	        	else {
	        		strCountMap.put(arr, 1);
	        	}       		           
	        }

	        // Print character count
	        System.out.println("String count in the string:");
	        
	        for (String ch : strCountMap.keySet()) {
	            int count = strCountMap.get(ch);
	            System.out.println(ch + " - " + count + " times");
	        }      
	    }
	}


