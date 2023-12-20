package stringconcepts;

public class RevserseNumber {

	public static void main(String[] args) {

		int number = 98765, reverse =0;
		while(number !=0) {
			int remainder = number % 10;      
			//1 iteration -  5      here number - 98765
			//2. iteration - 6    here number - 9876
			//3. iteration - 7    here number - 987
			//4  iteration - 8    here number - 98
			//5  iteration - 9    here number - 9
			reverse = reverse * 10 + remainder;  
			//1 iteration - 0 * 10 + 5  => 5 + 0 =  reverse - 5
			//2 iteration - 5 * 10 + 6.5  => 50 + 6 = 56
			//3 iteration - 56 * 10 + 7  => 560 + 7 = 567
			//4 iteration - 567 * 10 + 8  => 5670 + 8 = 5678
			//4 iteration - 5678 * 10 + 9  => 56780 + 9 = 56789
			number = number / 10;      
			//1.98765 /10;   => if you go calculator do the this cal number is - 9876.5  but number we defined int so, output is 9876 
			//2.9876
			//3.987
			//4.98
			//5.9
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}
