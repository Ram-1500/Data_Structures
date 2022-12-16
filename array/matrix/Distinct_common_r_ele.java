package matrix;

import java.util.Arrays;
/*Given a n x n matrix. The problem is to find all the distinct
 *  elements common to all rows of the matrix. The elements can be printed in any order. */
public class Distinct_common_r_ele {

		public static void sortRows(int mat[][], int n)
	    	{
		        for (int i=0; i<n; i++)
		            Arrays.sort(mat[i]);
	    	}      
		
	    public static void findAndPrintCommonElements(int mat[][], int n)
	    {        
	    	sortRows(mat, n);  // sort rows individually
	        int curr_index[] = new int[n];
	        int f = 0;
	      
	        for (; curr_index[0]<n; curr_index[0]++)
	        {
	            int value = mat[0][curr_index[0]];
	      
	            boolean present = true;
	            for (int i=1; i<n; i++)
	            {
	                while (curr_index[i] < n &&
	                       mat[i][curr_index[i]] <= value)
	                    curr_index[i]++;
	                if (mat[i][curr_index[i]-1] != value)
	                    present = false;
	                if (curr_index[i] == n)
	                {
	                    f = 1;
	                    break;
	                }
	            }      
	            if (present)
	               System.out.print(value+" ");
	            if (f == 1)
	                break;
	        }
	    }     
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int mat[][] = {  {12, 1, 14, 3, 16},
                         {14, 2, 1, 3, 35},
                         {14, 1, 14, 3, 11},
                         {14, 25, 3, 2, 1},
                         {1, 18, 3, 21, 14}
                                            };
            int n = 5;
            findAndPrintCommonElements(mat, n);
    }
}
//RamGhantasala