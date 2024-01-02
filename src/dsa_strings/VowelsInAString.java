package dsa_strings;

public class VowelsInAString {

	public static void main(String[] args) {
		
		String name = "satya*";
		int vowelsCount= 0, consonantsCount= 0, specialCharacters= 0;
		
		
		for(int i=0;i<name.length();i++) {
			
			if (name.charAt(i)== 'a' || name.charAt(i)== 'e' || name.charAt(i)== 'i' || name.charAt(i)== 'o' || name.charAt(i)== 'u' ) {
				vowelsCount++;
			}
			else if (name.charAt(i)>='a' && name.charAt(i)<='z') {
				consonantsCount++;
			}
			else 
				specialCharacters++;
		}
	
		System.out.println("Vowels count is "+vowelsCount);
		System.out.println("Consonents count is "+consonantsCount);
		System.out.println("Special Charcaters count is "+specialCharacters);
	}

}
