package subarray;

import java.util.Arrays;

//Split array into two subarrays such that difference of their maximum is minimum
public class Split_in_diff {

	static int findMinDif(int arr[], int N)
	{
	     
	    // Sort the array
	    Arrays.sort(arr);
	     
	    // Return the difference between
	    // two highest elements
	    return (arr[N - 1] - arr[N - 2]);
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    int arr[] = { 7, 9, 5, 10 };
	    int N = arr.length;
	 
	    System.out.println(findMinDif(arr, N));
	}
}
