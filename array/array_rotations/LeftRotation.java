package array_rotations;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
//Given an array of size n and multiple values around which we need to left rotate the array.
	//How to quickly find multiple left rotations?
	 public static void leftRotate(int[] A, int a, int k)
	    {
	        // if the value of k ever exceeds the length of the
	        // array
	        int c = k % a;	 
	        // initializing array D so that we always have a clone of the original array to rotate
	        int[] D = A.clone();
	 
	        rotateArray(D, 0, c - 1);
	        rotateArray(D, c, a - 1);
	        rotateArray(D, 0, a - 1);	 
	        // printing the rotated array
	        System.out.print(Arrays.toString(D));
	        System.out.println();
	    }	 
	    // Function to rotate the array from start index to end index
	    public static int[] rotateArray(int[] A, int start,int end)
	    {
	        while (start < end) {
	            int temp = A[start];
	            A[start] = A[end];
	            A[end] = temp;
	            start++;
	            end--;
	        }
	        return A;
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
	        System.out.println("Enter Position: ");
	        int key = sc.nextInt();
	        sc.close();
	        
	        leftRotate(arr, n, key);
	    }
}
