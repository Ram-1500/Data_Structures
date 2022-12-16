package subarray;

import java.util.Vector;

//Maximize product of a strictly increasing or decreasing subarray
public class Max_product_c {

	static int maxSubarrayProduct(Vector<Integer> arr, int n)
	  {
	  
	    // Maximum positive product
	    // ending at the i-th index
	    int max_ending_here = 1;
	  
	    // Minimum negative product ending
	    // at the current index
	    int min_ending_here = 1;
	  
	    // Maximum product up to
	    // i-th index
	    int max_so_far = 0;
	  
	    // Check if an array element
	    // is positive or not
	    int flag = 0;
	  
	    // Traverse the array
	    for (int i = 0; i < n; i++)
	    {
	  
	      // If current element
	      // is positive
	      if (arr.get(i) > 0) 
	      {
	  
	        // Update max_ending_here
	        max_ending_here
	          = max_ending_here * arr.get(i);
	  
	        // Update min_ending_here
	        min_ending_here
	          = Math.min(min_ending_here * arr.get(i), 1);
	  
	        // Update flag
	        flag = 1;
	      }
	  
	      // If current element is 0, reset
	      // the start index of subarray
	      else if (arr.get(i) == 0) 
	      {
	  
	        // Update max_ending_here
	        max_ending_here = 1;
	  
	        // Update min_ending_here
	        min_ending_here = 1;
	      }
	  
	      // If current element is negative
	      else 
	      {
	  
	        // Stores max_ending_here
	        int temp = max_ending_here;
	  
	        // Update max_ending_here
	        max_ending_here
	          = Math.max(min_ending_here * arr.get(i), 1);
	  
	        // Update min_ending_here
	        min_ending_here = temp * arr.get(i);
	      }
	  
	      // Update max_so_far, if needed
	      if (max_so_far < max_ending_here)
	        max_so_far = max_ending_here;
	    }
	  
	    // If no array elements is positive
	    // and max_so_far is 0
	    if (flag == 0 && max_so_far == 0)
	      return 0;
	    return max_so_far;
	  }
	  
	  // Function to find the maximum product of either
	  // increasing subarray or the decreasing subarray
	  static int findMaxProduct(int[] a, int n)
	  {
	  
	    // Stores start index of either increasing
	    // subarray or the decreasing subarray
	    int i = 0;
	  
	    // Initially assume maxProd to be 1
	    int maxProd = 1;
	  
	    // Traverse the array
	    while (i < n) {
	  
	      // Store the longest either increasing
	      // subarray or the decreasing subarray
	      // whose start index is i
	      Vector<Integer> v = new Vector<>();
	  
	      v.add(a[i]);
	  
	      // Check for increasing subarray
	      if (i < n - 1 && a[i] < a[i + 1]) {
	  
	        // Insert elements of
	        // increasing subarray
	        while (i < n - 1 && a[i] < a[i + 1]) {
	          v.add(a[i + 1]);
	          i += 1;
	        }
	      }
	  
	      // Check for decreasing subarray
	      else if (i < n - 1 && a[i] > a[i + 1]) {
	  
	        // Insert elements of
	        // decreasing subarray
	        while (i < n - 1 && a[i] > a[i + 1]) {
	          v.add(a[i + 1]);
	          i += 1;
	        }
	      }
	  
	      // Stores maximum subarray product of
	      // current increasing or decreasing
	      // subarray
	      int prod = maxSubarrayProduct(v, v.size());
	  
	      // Update maxProd
	      maxProd = Math.max(maxProd, prod);
	  
	      // Update i
	      i++;
	    }
	  
	    // Finally print maxProd
	    return maxProd;
	  }
	  
	  // Driver Code
	  public static void main(String[] args)
	  {
	    int arr[] = { 1, 2, 10, 8, 1, 100, 101 };
	    int N = arr.length;
	  
	    System.out.print(findMaxProduct(arr, N));
	  }
}
