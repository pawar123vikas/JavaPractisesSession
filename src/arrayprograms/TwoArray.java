package arrayprograms;

import java.io.IOException;
import java.util.Arrays;

public class TwoArray {
	/*
	public static void print2D(int mat[][]) {
		
		//loop through all row
		for(int[] row: mat) {  // row 3 
			//loop through all columns of each row
			for(int col: row) {  //
				System.out.print(col + " ");  //giving the space between the element and use print
			}
			System.out.println();  // giving next line
		}
	}
	
	
	
	public static void main(String[] args) {

		
		int mat[][] = {
				{10,20,30},
				{70,30,20},
				{56,87,99},
			};
		print2D(mat);
		
		
	}*/
	
	/*
	
	Returns a string representation of the contents of the specified array. The string representation consists 
	of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the 
	characters “, ” (a comma followed by a space). Returns “null” if a is null. 

	In case of an Object Array, if the array contains other arrays as elements, they are converted to strings by 
	the Object.toString() method inherited from Object, which describes their identities rather than their contents
	
	  public static void print2D(int mat[][])
	    {
	        // Loop through all rows
	        for (int[] row : mat)
	 
	            // converting each row as string
	            // and then printing in a separate line
	           System.out.println(Arrays.toString(row));
	    }
	 
	    public static void main(String args[])
	        throws IOException
	    {
	        int mat[][] = {
	        		{ 1, 2, 3, 4 },
	                { 5, 6, 7, 8 },
	                { 9, 10, 11, 12 }
	           };
	        print2D(mat);
	    }
  */
	
	int rollno;
    String name, address;
 
    // Constructor
    public TwoArray(int rollno, String name,
                String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
       
    }
 
   
    // Used to print student details in main()
    @Override
    public String toString()
    {
        return this.rollno + " " + this.name + " " + this.address;
    }
	

	    public static void main(String[] args)
	    {
	    	TwoArray[] arr = { new TwoArray(111, "bbbb", "london"),
	                        new TwoArray(131, "aaaa", "nyc"),
	                        new TwoArray(121, "cccc", "jaipur") };
	 
	        System.out.println(Arrays.toString(arr));
	    }

	
	
	
	
	
}
