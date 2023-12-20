package stringconcepts;


//Displays the total number of characters present in the given string


public class CountCharacter {

	public static void main(String[] args) {
		
		//charAt(index) - Returns the char value at the specified index.
		String string = "The best of both words";
		
		int count = 0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!= ' ') {  // here spaces are ignore
				count++;
			}
		}
		System.out.println("Total number of character present in string is : " +count);
		
		
	}
	

}
