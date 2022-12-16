package subarray;
//Given an array arr[] and an integer K, the task is 
//to calculate the sum of all subarrays of size K.
public class Subarrays_sum {

	static void calcSum(int arr[], int n, int k)
	{
	   
	    // Loop to consider every 
	    // subarray of size K
	    for (int i = 0; i <= n - k; i++) {
	           
	        // Initialize sum = 0
	        int sum = 0;
	   
	        // Calculate sum of all elements
	        // of current subarray
	        for (int j = i; j < k + i; j++)
	            sum += arr[j];
	   
	        // Print sum of each subarray
	        System.out.print(sum+ " ");
	    }
	}
	   
	// Driver Code
	public static void main(String[] args)
	{
	    int arr[] = { 1, 2, 3, 4, 5, 6 };
	    int n = arr.length;
	    int k = 3;
	   
	    // Function Call
	    calcSum(arr, n, k); 
	}
}
