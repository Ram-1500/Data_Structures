package arrangement_rearrangements;

import java.util.Scanner;

public class Rearrange_arr {
	//Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.

	public static void fixArray(int ar[], int n)
	{
	    int i, j, temp;	     
	    for(i = 0; i < n; i++)
	    {
	        for(j = 0; j < n; j++)
	        {
	            if (ar[j] == i)
	            {
	                temp = ar[j];
	                ar[j] = ar[i];
	                ar[i] = temp;
	                break;
	            }
	        }
	    }
	  
	    for(i = 0; i < n; i++)
	    {
	        if (ar[i] != i)
	        {
	            ar[i] = -1;
	        }
	    }
	  
	    System.out.println("Array after Rearranging");
	    for(i = 0; i < n; i++)
	    {
	        System.out.print(ar[i] + " ");
	    }
	}
	 
	// Driver Code
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
        
	    fixArray(arr, n);
}
}
//RamGhantasala