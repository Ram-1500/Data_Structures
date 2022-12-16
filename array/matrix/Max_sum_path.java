package matrix;

public class Max_sum_path {

	 public static int maxPathSum(int matrix[][], int i, int j)
	    {	         
	        if (i<0 || j<0) {
	          return -100_000_000;
	        }
	        if (i==0 && j==0) {
	            return matrix[i][j];
	        }	         
	        int up = matrix[i][j] + maxPathSum(matrix, i - 1, j);
	        int right = matrix[i][j] + maxPathSum(matrix, i, j - 1);
	        int up_left_diagonal = matrix[i][j] + maxPathSum(matrix, i - 1, j - 1);
	        return  Math.max(up , Math.max( right, up_left_diagonal));
	    }
 	    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int matrix [][] ={{100, -350, -200}, {-100, -300, 700}};
        System.out.print(maxPathSum(matrix, 1, 2));
    }
}
//RamGhantasala