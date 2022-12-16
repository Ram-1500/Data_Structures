package matrix;
/*Given a matrix of n*n size, the task is to find whether all rows 
 * are circular rotations of each other or not. 
 */
public class Circular_row_rotation {

	static int MAX = 1000;
	 
    static boolean isPermutedMatrix(int mat[][], int n)
    {
        String str_cat = "";
        for (int i = 0; i < n; i++)
        {
            str_cat = str_cat + "-" + String.valueOf(mat[0][i]);
        }
 
        str_cat = str_cat + str_cat;
 
        for (int i = 1; i < n; i++)
        {
        	String curr_str = "";
            for (int j = 0; j < n; j++)
            {
                curr_str = curr_str + "-" + String.valueOf(mat[i][j]);
            }
 
            if (str_cat.contentEquals(curr_str))
            {
                return false;
            }
        }
 
        return true;
    }
 
    // Drivers code
    public static void main(String[] args)
    {
        int n = 4;
        int mat[][] = {{1, 2, 3, 4},
        {4, 1, 2, 3},
        {3, 4, 1, 2},
        {2, 3, 4, 1}
        };
        if (isPermutedMatrix(mat, n))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
//RamGhantasala