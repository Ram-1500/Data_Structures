package subarray;

import java.util.HashMap;

//Length of smallest subarray to be removed to make sum of remaining elements divisible by K
public class Subarr_removal {

	static void removeSmallestSubarray(int arr[], int n, int k)
	{
		// Stores the remainder of each
		// arr[i] when divided by K
		int []mod_arr = new int[n];
		
		// Stores total sum of
		// elements
		int total_sum = 0;
		
		// K has been added to each 
		// arr[i] to handle -ve integers
		for (int i = 0; i < n; i++) 
		{
			mod_arr[i] = (arr[i] + k) % k;
		
		// Update the total sum
			total_sum += arr[i];
		}
		
		// Remainder when total_sum
		// is divided by K
		int target_remainder = total_sum % k;
		
		// If given array is already
		// divisible by K
		if (target_remainder == 0) 
		{
			System.out.print("0");
			return;
		}
		
		// Stores curr_remainder and the
		// most recent index at which
		// curr_remainder has occurred
		HashMap<Integer,Integer> map1 = new HashMap<>();
		map1.put(0, -1);
		
		int curr_remainder = 0;
		
		// Stores required answer
		int res = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) 
		{
			// Add current element to curr_sum and take mod
			curr_remainder = (curr_remainder + arr[i] + k) % k;
			
			// Update current remainder index
			map1.put(curr_remainder, i);
			
			int mod = (curr_remainder - target_remainder + k) % k;
			
			// If mod already exists in map the subarray exists
			if (map1.containsKey(mod))
				res = Math.min(res, i - map1.get(mod));
		}
		
		// If not possible
		if (res == Integer.MAX_VALUE || res == n) 
		{
			res = -1;
		}
		
		// Print the result
		System.out.print(res);
	}
		
		
	public static void main(String[] args)
	{
		// Given array arr[]
		int arr[] = {3, 1, 4, 2};		
		// Size of array
		int N = arr.length;		
		// Given K
		int K = 6;		
		// Function Call
		removeSmallestSubarray(arr, N, K);
	}
}
