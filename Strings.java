public class Strings{
	
	//1. Reverse a String
	public String reverseString(String s){
		String reversed ="";
		for(int i = s.length() -1; i >= 0; i--){
			reversed += s.charAt(i);
	}
	return reversed;
	}
	
	
	//2. Remove duplicates from string
	
	public String removeDuplicates(String s){
		String result = "";
		for(int i=0; i< s.length(); i++){
			char currentChar = s.charAt(i);
			boolean found = false;
			for(int j=0;  j<  result.length(); j++){
				if(result.charAt(j) == currentChar){
					found  =  true;
					break;
				}
			}
			if(!found){
				result += currentChar;
			}
		}
		return result;
	}
	
	
	//3. vowels and consonents
	public void countVowelsAndConsonants(String s){
		int vowels = 0, consonants =0;
		for(int i=0; i< s.length(); i++){
			char ch = s.charAt(i);
			if((ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')){
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
				ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
					vowels++;
				}else{
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

}
				

