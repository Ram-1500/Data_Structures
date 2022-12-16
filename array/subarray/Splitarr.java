package subarray;
//Split array into maximum subarrays such that every distinct element lies in a single subarray
public class Splitarr {

	static int maxCtSubarrays(int arr[], int N)
	{
		
		int hash[] = new int[1000001];
		
		for (int i = 0; i < N; i++) 
		{
			hash[arr[i]] = i;
		}
		
		// Store the maximum index of the last occurrence of all elements
		int maxIndex = -1;		
		// Store the count of subarrays
		int res = 0;
		
		for (int i = 0; i < N; i++) 
		{
			maxIndex = Math.max(maxIndex, hash[arr[i]]);
			if (maxIndex == i) 
			{
				res++;
			}
		}
		
		return res;
	}
		
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 4, 1, 4, 7, 7, 8};
		int N = arr.length;
		System.out.print(maxCtSubarrays(arr, N));
	}
}
