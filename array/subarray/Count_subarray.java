package subarray;

import java.util.Scanner;

//Given an array arr[] of size N and an integer K > 0. 
//The task is to find the number of sub-arrays with sum at least K.
public class Count_subarray {

	 static int k_sum(int a[], int n, int k) 
	    { 	        
	        int r = 0, sum = 0; // To store the right index and the current sum 	       
	        int ans = 0;  // To store the number of sub-arrays 	      
	       
	        for (int l = 0; l < n; l++)		 // For all left indexes 
	        {       	           
	            while (sum < k) 	 // Get elements till current sum is less than k 
	            { 
	                if (r == n) 
	                    break; 
	                else 
	                { 
	                    sum += a[r]; 
	                    r++; 
	                } 
	            }       	           
	            if (sum < k) 
	                break;       
	           
	            ans += n - r + 1; 			 // Add all possible sub-arrays          
	            sum -= a[l];  				// Remove the left most element 
	        }     	      
	        return ans; 
	    } 
	      
	    // Driver code 
	    public static void main (String[] args)
	    { 
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter no.of elements: ");
	    	int n = sc.nextInt();
	    	System.out.println("Enter array: ");
	    	int []arr= new int[n];
	    	for(int i=0;i<n;i++)
	    		arr[i]=sc.nextInt();
	    	System.out.println("Enter sum: ");
	    	int k=sc.nextInt();
	    	sc.close();
	      
	        System.out.println(k_sum(arr, n, k)); 
	    }
}
