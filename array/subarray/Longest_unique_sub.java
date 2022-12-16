package subarray;

import java.util.HashMap;

//Given an array arr[] consisting of N integers, the task is to find the largest subarray consisting of unique elements only.
public class Longest_unique_sub {

	static int largest_subarray(int a[], int n)
	{
	    // Stores index of array elements
	    HashMap<Integer,
	            Integer> index = new HashMap<Integer,
	                                         Integer>();
	    int ans = 0;
	    for(int i = 0, j = 0; i < n; i++)
	    {
	  
	        // Update j based on previous
	        // occurrence of a[i]
	        j = Math.max(index.containsKey(a[i]) ? 
	                             index.get(a[i]) : 0, j);
	  
	        // Update ans to store maximum
	        // length of subarray
	        ans = Math.max(ans, i - j + 1);
	  
	        // Store the index of current
	        // occurrence of a[i]
	        index.put(a[i], i + 1);
	    }
	  
	    // Return final ans
	    return ans;
	}
	  
	// Driver Code
	public static void main(String[] args)
	{
	    int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3 };
	    int n = arr.length;
	    System.out.print(largest_subarray(arr, n));
	}
}
