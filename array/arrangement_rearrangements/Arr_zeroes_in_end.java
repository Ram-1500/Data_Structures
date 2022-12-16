package arrangement_rearrangements;

import java.util.Scanner;
//program to move all zeroes to end of the array without any sorting.
public class Arr_zeroes_in_end {

	 static void pushZerosToEnd(int arr[], int n)
	    {
	        int count = 0;  // Count of non-zero elements
	 
	        for (int i = 0; i < n; i++)
	            if (arr[i] != 0)
	                arr[count++] = arr[i]; 
	 
	        while (count < n)
	            arr[count++] = 0;
	    }
	 
	    public static void main (String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter No. of array elements: ");
	    	int n= sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter Array: ");
	        for(int i=0;i<n;i++)
	        	arr[i]= sc.nextInt();
	        sc.close();
	        
	        pushZerosToEnd(arr, n);
	        System.out.println("Array after pushing zeros to the back: ");
	        for (int i=0; i<n; i++)
	            System.out.print(arr[i]+" ");
	    }
}
//program by ram ghantasala