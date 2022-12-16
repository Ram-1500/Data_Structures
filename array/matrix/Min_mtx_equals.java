package matrix;
//Minimum operations required to make each row and column of matrix equals
public class Min_mtx_equals {

		static int findMinOpeartion(int matrix[][], int n)
	    {        // Initialization
	        int[] sumRow = new int[n];
	        int[] sumCol = new int[n];
	        
	        for (int i = 0; i < n; ++i)
	            for (int j = 0; j < n; ++j) {
	                sumRow[i] += matrix[i][j];
	                sumCol[j] += matrix[i][j];
	            }
	        int maxSum = 0;
	        for (int i = 0; i < n; ++i) {
	            maxSum = Math.max(maxSum, sumRow[i]);
	            maxSum = Math.max(maxSum, sumCol[i]);
	        }
	        
	        int count = 0;
	        for (int i = 0, j = 0; i < n && j < n;) {
	            
	            int diff = Math.min(maxSum - sumRow[i],
	                                maxSum - sumCol[j]);
	            matrix[i][j] += diff;
	            sumRow[i] += diff;
	            sumCol[j] += diff;
	            // Update the count variable
	            count += diff;
	            if (sumRow[i] == maxSum)
	                ++i;
	            if (sumCol[j] == maxSum)
	                ++j;
	        }
	        return count;
	    }
		
		static void printMatrix(int matrix[][], int n)
	    {
	        for (int i = 0; i < n; ++i) {
	            for (int j = 0; j < n; ++j)
	                System.out.print(matrix[i][j] + " ");
	            System.out.println();
	        }
	    }
	 
    /* Driver program */
    public static void main(String[] args)
    {
        int matrix[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println(findMinOpeartion(matrix, 2));
        printMatrix(matrix, 2);
    }
}
//RamGhantasala