package array_rotations;

import java.util.Scanner;

public class Hamming_distance {

	static int maxHamming(int arr[], int n)
	{	    // arr[] to brr[] two times so that
	    // we can traverse through all rotations.
	    int brr[]=new int[2 *n + 1];
	    for (int i = 0; i < n; i++){
	        brr[i] = arr[i];
	        brr[n+i] = arr[i];
	    }	 
	    // We know hamming distance with
	    // 0 rotation would be 0.
	    int maxHam = 0;
	 
	    // We try other rotations one by one
	    // and compute Hamming distance
	    // of every rotation
	    for (int i = 1; i < n; i++)
	    {
	        int currHam = 0;
	        for (int j = i, k=0; j < (i + n); j++,k++)
	            if (brr[j] != arr[k])
	                currHam++;	 
	        // We can never get more than n.
	        if (currHam == n)
	            return n;	 
	        maxHam = Math.max(maxHam, currHam);
	    }	 
	    return maxHam;
	}
	 
	// driver code
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
	    System.out.print(maxHamming(arr, n));    
	}
}
