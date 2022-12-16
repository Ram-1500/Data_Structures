package subarray;
//Longest subarray in which all elements are smaller than K
public class Smallest_subarray {

	static void largestSubarray(int[] arr, int N, int K)
	{		
		// Stores the length of maximum consecutive sequence
		int count = 0;
		
		// Stores maximum length of subarray
		int len = 0;
		
		// Iterate through the array
		for(int i = 0; i < N; i++) 
		{
			
			// Check if array element
			// smaller than K
			if (arr[i] < K) 
			{
				count += 1;
			}
			else
			{
			
				// Store the maximum
				// of length and count
				len = Math.max(len, count);
				
				// Reset the counter
				count = 0;
			}
		}
		
		if (count != 0) 
		{
			len = Math.max(len, count);
		}
		
		// Print the maximum length
		System.out.println(len);
	}
		
		//Driver code
	public static void main(String[] args) 
	{
		
		// Given array arr[]
		int[] arr = { 1, 8, 3, 5, 2, 2, 1, 13 };
		
		// Size of the array
		int N = arr.length;
		
		// Given K
		int K = 6;
		
		// Function Call
		largestSubarray(arr, N, K);
	}
}
