package arrangement_rearrangements;

import java.util.Scanner;

public class ReverseArray {
	
	    static void rvereseArray(int arr[],int start, int end)
		{
		  int temp;		    
		  while (start < end)
		  {
		      temp = arr[start];
		      arr[start] = arr[end];
		      arr[end] = temp;
		      start++;
		      end--;
		  }
		}
			  
		static void printArray(int arr[],int size)
		{
		  for (int i = 0; i < size; i++)
		       System.out.print(arr[i] + " ");		    
		   System.out.println();
		}
	// Driver code
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
    	System.out.println("Enter No. of array elements: ");
    	int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++)
        	arr[i]= sc.nextInt();
        
        
        sc.close();
        
        printArray(arr, 6);
	  rvereseArray(arr, 0, 5);
	  System.out.print("Reversed array is \n");
	  printArray(arr, 6);
	
	}
}
//ramghantasala