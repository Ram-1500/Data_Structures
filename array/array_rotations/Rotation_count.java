package array_rotations;

import java.util.Scanner;

public class Rotation_count {
//Given an array arr[] of size N having distinct numbers sorted in increasing order and the array has been right rotated (i.e, the last element will be 
	//cyclically shifted to the starting position of the array) k number of times, the task is to find the value of k.
	 static int countRotations(int arr[], int n)
	    {
	        // We basically find index of minimum
	        // element
	        int min = arr[0], min_index = 0;
	        for (int i = 0; i < n; i++) {
	            if (min > arr[i]) {
	                min = arr[i];
	                min_index = i;
	            }
	        }
	        return min_index;
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter No. of array elements: ");
	    	int n= sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter Array: ");
	        for(int i=0;i<n;i++)
	        	arr[i]= sc.nextInt();
	        
	        sc.close();
	 
	        System.out.println(countRotations(arr, n));
	    }
}
