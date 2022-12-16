package matrix;//dev
//Frequencies of even and odd numbers in a matrix
public class Freq_odd_even {

	static final int MAX = 100;
	
	static void freq(int ar[][], int m, int n) { // function for calculating frequency
	    
		int even = 0, odd = 0;	 
	    for (int i = 0; i < m; ++i)
	    {
	        for (int j = 0; j < n; ++j)
	        {
	            if ((ar[i][j] % 2) == 0)
	                ++even;
	            else
	                ++odd;
	        }
	    }	 
	    System.out.println(" Frequency of odd number =" + odd);
	    System.out.println(" Frequency of even number = " +even);
	}	 
	// Driver code
	public static void main(String[] args) {
		
	    int m = 3, n = 3;	 
	    int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	 
	    freq(array, m, n);
	}
}
//RamGhantasala