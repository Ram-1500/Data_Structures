package arrangement_rearrangements;
import java.util.Arrays;
import java.util.Scanner;

public class AlternativeIndexSort {
//program is rearranging in odd index in ascending order and even indexes in descending order.
	 static void rearrangeArray(int arr[], int n)
	    {  
	        // Sorting the array elements
	        Arrays.sort(arr);
	      
	        int[] tempArr = new int[n]; 
	        int ArrIndex = 0;
	      
	        // Traverse from begin and end simultaneously
	        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2; i++, j--) 
	        {
	            if(ArrIndex < n)
	            {
	                tempArr[ArrIndex] = arr[i];
	                ArrIndex++;
	            }	             
	            if(ArrIndex < n)
	            {
	                tempArr[ArrIndex] = arr[j];
	                ArrIndex++;
	            }
	        }	      
	        // Modifying original array
	        for (int i = 0; i < n; i++)
	            arr[i] = tempArr[i];
	    }
	      
	    // Driver Code
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
	        
	    	rearrangeArray(arr, n);
	      
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i]+" ");
	    }
}
//program by ram ghantasala