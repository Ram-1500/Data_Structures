package subarray;
//Length of longest subarray whose sum is not divisible by integer K
public class Max_sub_len {

	static int MaxSubarrayLength(int arr[], int n,int k)
	{
	
		// left is the index of the leftmost element that is not divisible by k
		int left = -1;
		
		// right is the index of the rightmost element that is not divisible by k
		int right = 0;
		
		// sum of the array
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
		
		// Find the element that is not multiple of k
			if ((arr[i] % k) != 0) 
			{
			
			// left = -1 means we are finding the leftmost element that is not divisible by k
				if (left == -1) 
				{
					left = i;
				}
			
			// Updating the rightmost element
				right = i;
			}
			
			// Update the sum of the array up to the index i
			sum += arr[i];
		}
			
		// Check if the sum of the array is not divisible by k, then return the size of array
		if ((sum % k) != 0)
		{
			return n;
		}
		
		// All elements of array are divisible by k, then no such subarray possible so return -1
		else if (left == -1)
		{
			return -1;
		}
		else 
		{	// Length of prefix elements that can be removed
			int prefix_length = left + 1;
			
			// Length of suffix elements that can be removed
			int suffix_length = n - right;
			
			return n - Math.min(prefix_length,suffix_length);
			// Return the length of subarray after removing the elements which have lesser number of elements
		}
	}
		
		//Driver code
	public static void main(String[] args)
	{
		int arr[] = { 6, 3, 12, 15 };
		int n = arr.length;
		int K = 2;
		
		System.out.println(MaxSubarrayLength(arr, n, K));
	}
}
