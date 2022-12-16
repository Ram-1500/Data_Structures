package arrangement_rearrangements;

import java.util.Scanner;

public class SegregateEvenOdd {
//Segregate even and odd numbers
	public static void arrayEvenAndOdd(int arr[], int n)
	{
	    int[] a;
	    a = new int[n];
	    int index = 0;
	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] % 2 == 0)
	        {
	            a[index] = arr[i];
	            index++;
	        }
	    }
	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] % 2 != 0)
	        {
	            a[index] = arr[i];
	            index++;
	        }
	    }
	    for (int i = 0; i < n; i++)
	    {
	        System.out.print(a[i] + " ");
	    }
	    System.out.println("");
	}
	    // Driver code
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
            // Function call
            arrayEvenAndOdd(arr, n);
	    }
	
}
//Ram Ghantasala