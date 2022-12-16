package matrix;

public class Rotation {

	 static int R = 4;
	    static int C = 4;
	 
	    static void rotatematrix(int m,
	                    int n, int mat[][])
	    {
	        int row = 0, col = 0;
	        int prev, curr;
	 
	        while (row < m && col < n)
	        {
	     
	            if (row + 1 == m || col + 1 == n)
	                break;
	     
	            prev = mat[row + 1][col];
	     
	            for (int i = col; i < n; i++)
	            {
	                curr = mat[row][i];
	                mat[row][i] = prev;
	                prev = curr;
	            }
	            row++;
	     
	            // Move elements of last column from the remaining columns
	            for (int i = row; i < m; i++)
	            {
	                curr = mat[i][n-1];
	                mat[i][n-1] = prev;
	                prev = curr;
	            }
	            n--;
	     
	            // Move elements of last row from the remaining rows
	            if (row < m)
	            {
	                for (int i = n-1; i >= col; i--)
	                {
	                    curr = mat[m-1][i];
	                    mat[m-1][i] = prev;
	                    prev = curr;
	                }
	            }
	            m--;
	     
	            // Move elements of first column from the remaining rows
	            if (col < n)
	            {
	                for (int i = m-1; i >= row; i--)
	                {
	                    curr = mat[i][col];
	                    mat[i][col] = prev;
	                    prev = curr;
	                }
	            }
	            col++;
	        }
	 
	            // Print rotated matrix
	            for (int i = 0; i < R; i++)
	            {
	                for (int j = 0; j < C; j++)
	                System.out.print( mat[i][j] + " ");
	                System.out.print("\n");
	            }
	    }
	 
	/* Driver program to test above functions */
	    public static void main(String[] args)
	    {
	    // Test Case 1
	    int a[][] = { {1, 2, 3, 4},
	                  {5, 6, 7, 8},
	                {9, 10, 11, 12},
	                {13, 14, 15, 16} };
	 
	    // Test Case 2
	    /* int a[][] = new int {{1, 2, 3},
	                            {4, 5, 6},
	                            {7, 8, 9}
	                        };*/
	    rotatematrix(R, C, a);
	    }
}
//RamGhantasala