package subarray;
/*Given an array of integers greater than zero, find if it is possible
 *  to split it in two subarrays (without reordering the elements), 
 *  such that the sum of the two subarrays is the same. Print the two subarrays.
 */
public class Split_arr {

	static int findSplitPoint(int arr[], int n)
    {
      
    int leftSum = 0 ;
  
    // traverse array element
    for (int i = 0; i < n; i++)
    {
        // add current element to left Sum
        leftSum += arr[i] ;
  
        // find sum of rest array
        // elements (rightSum)
        int rightSum = 0 ;
          
        for (int j = i+1 ; j < n ; j++ )
            rightSum += arr[j] ;
  
        // split point index
        if (leftSum == rightSum)
            return i+1 ;
    }
  
    // if it is not possible to 
    // split array into two parts
    return -1;
    }   
  
    // Prints two parts after finding 
    // split point using findSplitPoint()
    static void printTwoParts(int arr[], int n)
    {
      
        int splitPoint = findSplitPoint(arr, n);
      
        if (splitPoint == -1 || splitPoint == n )
        {
            System.out.println("Not Possible");
            return;
        }
          
        for (int i = 0; i < n; i++)
        {
            if(splitPoint == i)
               System.out.println();
                 
            System.out.print(arr[i] + " ");
              
        }
    }
  
// Driver program
      
    public static void main (String[] args) {
      
    int arr[] = {1 , 2 , 3 , 4 , 5 , 5 };
    int n = arr.length;
    printTwoParts(arr, n);
      
    }
}
