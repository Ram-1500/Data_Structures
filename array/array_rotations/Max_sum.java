package array_rotations;

import java.util.Scanner;

public class Max_sum {
//Given an array arr[] of n integers, find the maximum that maximizes the sum of the 
	//value of i*arr[i] where i varies from 0 to n-1.   sum(i*arr[i])
	static int maxSum(int arr[], int n)
	{	// Initialize result
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
		{
		    int curr_sum = 0;
		    for (int j = 0; j < n; j++)
		    {
		        int index = (i + j) % n;
		        curr_sum += j * arr[index];
		    }
		    res = Math.max(res, curr_sum);
		}
		return res;
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
        
        System.out.println(maxSum(arr, n));
	}
}
//RamGhantasala