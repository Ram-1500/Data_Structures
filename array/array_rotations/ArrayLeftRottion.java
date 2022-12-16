package array_rotations;

import java.util.Scanner;

//left-rotation (or) Split the array and add the first part to the end
public class ArrayLeftRottion {

	public static void splitArr(int arr[], int n, int k)
	{
		for (int i = 0; i < k; i++) { 
			// Rotate array by 1.
            int x = arr[0];
            for (int j = 0; j < n - 1; ++j)
                arr[j] = arr[j + 1];
            arr[n - 1] = x;
		}
    }
 
	public static void printArray(int arr[], int size)
	{
		for(int i = 0; i < size; i++)
		System.out.print(arr[i] + " ");
		System.out.println();
	}
    // Driver code
    public static void main(String[] args)
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter No. of array elements: ");
    	int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++)
        	arr[i]= sc.nextInt();
        System.out.println("Enter Position: ");
        int position = sc.nextInt();
        sc.close();
        
        splitArr(arr, n, position);
 
        printArray(arr,n);
    }
}
//RamGhantasala