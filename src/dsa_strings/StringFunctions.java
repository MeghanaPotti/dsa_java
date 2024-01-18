package dsa_strings;

public class StringFunctions {
	
	static String name = "Meghana";
	static String string1 = "java";
	static String string2 = "javac";
	static String string3 = "java";
	static String string4 = "JAVA";
	static String string5 = "";
	static String string6 = "To find first occurance and last occurance";
	static String string7 = "     HI   2024  ";
	static char[] string = { 'j', 'a', 'v', 'a'};
	static String copyString = "";
	static String location = "Hyd";
	static String date = "30dec23";
	static String places = "hyd,vij,vskp,gnt";

	public static void main(String[] args) {
		
		System.out.println("character at position 0 is "+name.charAt(0));	//System.out.println("Character is at "+name.charAt(0));
		System.out.println("Unicode of character is "+name.codePointAt(2)); 
		System.out.println("Comparision value is "+string1.compareTo(string2));
		System.out.println("concatination of name and location is "+name.concat(location)); 
		System.out.println("status of sequence characters are "+name.contains("Ma")); 
		copyString = String.copyValueOf(string,0,4);
		System.out.println("returned sting is "+copyString); 
		System.out.println("given character in location is "+location.endsWith("e")); 
		System.out.println("character in location is "+location.endsWith("d"));
		System.out.println("comparision status is "+string1.equals(string3));
		System.out.println("casesensitive status is "+string1.equalsIgnoreCase(string4));

		System.out.println("index of g is "+name.indexOf('g')); 
		System.out.println("Empty string status "+name.isEmpty());
		System.out.println("Empty string status "+string5.isEmpty()); 
		System.out.println("position is "+string6.lastIndexOf("occurance"));
		System.out.println("lenght of name is "+name.length());  
		System.out.println("replaced string is "+location.replace('y', 'a'));
		System.out.println("Single replacement "+string6.replaceFirst("occurance", "repetition"));
		System.out.println("Multiple replacements "+string6.replaceAll("occurance", "repetition"));
		
		String placesArr[]=places.split(",");
		for (int i=0; i<placesArr.length; i++) {
			System.out.println("Array of "+i+" is "+placesArr[i]); 
		}
		
		System.out.println("Starting charcater is "+name.startsWith("m"));
		System.out.println("lower case conversion "+string4.toLowerCase());
		System.out.println("upper case conversion "+string1.toUpperCase());
		System.out.println("without trimming "+string7);
		System.out.println("with trimming "+string7.trim());
		System.out.println("concatination of name and location with operator is "+name+"_"+location); 
		System.out.println("Substring is "+string3.substring(1,3));

		
	}
}
