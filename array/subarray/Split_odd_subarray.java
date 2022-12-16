package subarray;
//Split array into K disjoint subarrays such that sum of each subarray is odd.
public class Split_odd_subarray {

	static void split(int a[], int n, int k)
	{
	    // Number of odd elements
	    int odd_ele = 0;
	   
	    // Loop to store the number
	    // of odd elements in the array
	    for (int i = 0; i < n; i++)
	        if (a[i] % 2==1)
	            odd_ele++;
	   
	    // If the count of odd elements is < K
	    // then the answer doesnt exist
	    if (odd_ele < k)
	        System.out.print(-1);
	   
	    // If the number of odd elements is
	    // greater than K and the extra
	    // odd elements are odd, then the
	    // answer doesn't exist
	    else if (odd_ele > k && (odd_ele - k) % 2==1)
	        System.out.print(-1);
	   
	    else {
	        for (int i = 0; i < n; i++) {
	            if (a[i] % 2==1) {
	   
	                // Printing the position of
	                // odd elements
	                System.out.print(i + 1+ " ");
	   
	                // Decrementing K as we need positions
	                // of only first k odd numbers
	                k--;
	            }
	   
	            // When the positions of the first K
	            // odd numbers are printed
	            if (k == 0)
	                break;
	        }
	    }
	}
	   
	// Driver code
	public static void main(String[] args)
	{
	    int n = 5;
	    int arr[] = { 7, 2, 11, 4, 19 };
	    int k = 3;
	   
	    split(arr, n, k);
	}
}
