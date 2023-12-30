package dsa_strings;

public class StringFunctions {
	
	static String name = "Meghana";
	static String location= "Hyd";
	static String date= "30dec23";
	static String places= "hyd,vij,vskp,gnt";

	public static void main(String[] args) {
		System.out.println("lenght of name is "+name.length());
		System.out.println("index of g is "+name.indexOf('g')); 
		System.out.println("character at position 0 is "+name.charAt(0)); 
		System.out.println("character at position 1 is "+name.charAt(1)); 
		System.out.println("concatination of name and location is "+name.concat(location)); 
		System.out.println("concatination of name and location with operator is "+name+"_"+location); 

		String placesArr[]=places.split(",");
		for (int i=0; i<placesArr.length; i++) {
			System.out.println("Array of "+i+" is "+placesArr[i]); 
		}

	}

}
