package searching_n_sorting;

public class Selection_sort {

	 void sort(int arr[])
	    {
	        int n = arr.length;	       
	        for (int i = 0; i < n-1; i++)  // One by one move boundary of unsorted subarray
	        {	           
	            int min_idx = i;   // Find the minimum element in unsorted array
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx])
	                    min_idx = j;	 
	            // Swap the found minimum element with the first element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	 
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 
	    // Driver code to test above
	    public static void main(String args[])
	    {
	        Selection_sort ob = new Selection_sort();
	        int arr[] = {64,25,12,22,11};
	        ob.sort(arr);
	        System.out.println("Sorted array");
	        ob.printArray(arr);
	}
}
