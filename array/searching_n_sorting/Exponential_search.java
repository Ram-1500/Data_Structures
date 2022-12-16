package searching_n_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Exponential_search 
{
	
	static int exponentialSearch(int arr[],int n, int x)
	{
	// If x is present at first location itself
	if (arr[0] == x)
	return 0;
	
	// Find range for binary search by
	// repeated doubling
	int i = 1;
	while (i < n && arr[i] <= x)
	i = i*2;
	
	// Call binary search for the found range.
	return Arrays.binarySearch(arr, i/2, 
	          Math.min(i, n-1), x);
	}

// Driver code
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no. of array elements:");
	    int n = sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter arr:");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();//arr has to be sorted
	    }
	    System.out.println("Enter key: ");
	    int x= sc.nextInt();
	    sc.close();
	    
		int result = exponentialSearch(arr, arr.length, x);	
		System.out.println((result < 0) ? 	"Element is not present in array" :
											"Element is present at index " + result);

	}

}
