package matrix;
/*Given a square matrix mat[][] and a number k. 
 * The task is to shift the first k elements of each row
 *  to the right of the matrix.
 */
public class Shift_row {

	static int N = 4;
    
    // Function to shift first k elements
    // of each row of matrix.
    static void shiftMatrixByK(int [][]mat,
                                    int k)
    {
        if (k > N) {
            System.out.print("Shifting is"
                        + " not possible");
            return;
        }
          
        int j = 0;
        while (j < N) {
              
            // Print elements from index k
            for (int i = k; i < N; i++)
                System.out.print(mat[j][i] + " ");
                  
            // Print elements before index k
            for (int i = 0; i < k; i++)
                System.out.print(mat[j][i] + " ");
                  
            System.out.println();
            j++;
        }
    }
      
    // Driver code
    public static void main(String args[])
    {
        int [][]mtx = new int [][]
                    { {1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16} };
        int k = 2;
          
        // Function call
        shiftMatrixByK(mtx, k);
    }
}
