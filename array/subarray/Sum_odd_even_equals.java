package subarray;

import java.util.Scanner;

//Count subarrays having sum of elements at even and odd positions equal
public class Sum_odd_even_equals {

	static void countSubarrays(int arr[], int n)
	{
		// Initialize variables
		int count = 0;
		
		// Iterate over the array
		for (int i = 0; i < n; i++) 
		{
			int sum = 0;
			
			for (int j = i; j < n; j++) {
				
				if ((j - i) % 2 == 0)
				  sum += arr[j];
				
				// else subtract it to sum
				else
				  sum -= arr[j];
				
				// Increment the count
				// if the sum equals 0
				if (sum == 0)
				
				  count++;
			}
		}
		System.out.println(count);
	}
	
		// Driver Code
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of array elements:");
		int n= sc.nextInt();
		System.out.println("Enter array");
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
	
		countSubarrays(arr, n);
	}
}
