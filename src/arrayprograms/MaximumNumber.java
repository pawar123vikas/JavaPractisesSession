package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumNumber {
	/*
	//1.Arrays initlization 
	//2.array is static why i want access in static method, as we know we can not access 
	//instance variable in static method, if you want access then create object of class
	static int maxArray[] = {22,11,88,3003};  
	
	static int largest() {
		int max = maxArray[0];  // i will store the first element of array to max variable for comaparing other elements
		
		for(int i =0; i <maxArray.length;i++) {  
			//1.when i = 0 - maxArray[0] - 22 and max - 22 condition is not satisfied so not enter into if loop
			//2.when i =1 -  maxArray[1] - 11 and max - 22 condition is not satisfied so not enter into if loop
			//3.when i =2 -  maxArray[2] - 88 and max - 22 condition is satisfied so enter into if loop then max = 88 
			//3.when i =3 -  maxArray[3] - 3003 and max - 88 condition is satisfied so enter into if loop then max =3003 

			if(maxArray[i] > max) {    
				max = maxArray[i];
			}
		}
		return max; // 3003
	}

	public static void main(String[] args) {
		
		int maxNumber = largest();
		System.out.println(maxNumber);  //3003
	}
	*/
	
	/*
	public static void main(String args[]) {
		int arr[] = {10,40,33,99,22};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length;i++) {
			list.add(arr[i]);
	}
		System.out.println(Collections.max(list));
	*/
	   	   
	   public static void main(String[] args) {
	   int arr[] = {10, 324, 45, 90, 9808}; 
       //int max1 = Arrays.stream(arr).max().getAsInt(); 
	   int max1 = Arrays.stream(arr).max().getAsInt();
       System.out.println("Largest in given array is " +max1); 
	   }
		
	 
	

}
