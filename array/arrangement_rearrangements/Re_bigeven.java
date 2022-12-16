package arrangement_rearrangements;

import java.util.Arrays;
import java.util.Scanner;
//
public class Re_bigeven {
//program to rearrange array such that all even indexes are bigger values than odd index values
	 static void assign(int a[], int n)
	    {	 
	        // Sort the array
	        Arrays.sort(a);
	 
	        int ans[] = new int[n];
	        int p = 0, q = n - 1;
	        for (int i = 0; i < n; i++) {
	 
	            // Assign even indexes with maximum elements
	            if ((i + 1) % 2 == 0)
	                ans[i] = a[q--];
	 
	            // Assign odd indexes with remaining elements
	            else
	                ans[i] = a[p++];
	        }	 
	        // Print result
	        for (int i = 0; i < n; i++)
	            System.out.print(ans[i] + " ");
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter No. of array elements: ");
	    	int n= sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter Array: ");
	        for(int i=0;i<n;i++)
	        	arr[i]= sc.nextInt();
	        sc.close();
	        assign(arr, n);
	    }
}
//code by ram ghantasala