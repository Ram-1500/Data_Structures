package array_rotations;

import java.util.Scanner;

public class Pair {
//Given an array arr[] of distinct elements size N that is sorted and
	//then around an unknown point, the task is to check if the array has a pair with a given sum X.
	static boolean pairInSortedRotated(int arr[], int n,int sum)
	{
			int i;
			for (i = 0; i < n - 1; i++)
				if (arr[i] > arr[i + 1])
						break;
			
			int l = (i + 1) % n;			
			int r = i;  			// r is now index of largest element

			while (l != r) {
				
				if (arr[l] + arr[r] == sum)
					return true;
				if (arr[l] + arr[r] < sum)
					l = (l + 1) % n;
				else
					r = (n + r - 1) % n;
			}
		return false;
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
    	System.out.println("Enter No. of array elements: ");
    	int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++)
        	arr[i]= sc.nextInt();
        System.out.println("Enter Sum: ");
        int sum = sc.nextInt();
        sc.close();
		
		if (pairInSortedRotated(arr, n, sum))
			System.out.print("true");//there is a pair 
		else
			System.out.print("false");
	}
}
