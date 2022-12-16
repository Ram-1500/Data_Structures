package searching_n_sorting;

import java.util.Scanner;

public class Binary_search {

	 int binarySearch(int arr[], int l, int r, int x)
	    {
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	            if (arr[mid] == x)
	                return mid;
	            if (arr[mid] > x)
	                return binarySearch(arr, l, mid - 1, x);
	 
	            return binarySearch(arr, mid + 1, r, x);
	        }
	        return -1;
	    }
	
	public static void main(String[] args) {
		// R_Code Auto-generated method stub
		 Binary_search ob = new Binary_search();
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter no. of array elements:");
	        int n = sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter arr:");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();//arr has to be sorted
	        }
	        System.out.println("Enter key value:");
	        int key = sc.nextInt();
	        sc.close();
	        int result = ob.binarySearch(arr, 0, n - 1, key);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index "+ result);
			}
}
