package matrix;//dev

import java.util.Arrays;
//Find median in row wise sorted matrix
public class Median_rowwise {

	 static int binaryMedian(int m[][], int r, int c)
	    {
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	 
	        for (int i = 0; i < r; i++) 
	        {   // Finding the minimum element
	            if (m[i][0] < min)
	                min = m[i][0];	 
	            // Finding the maximum element
	            if (m[i][0] > max)
	                max = m[i][0];
	        }	 
	        int desired = (r * c + 1) / 2;
	        
	        while (min < max) {
	            int mid = min + (max - min) / 2;
	            int place = 0;
	            int get = 0;
	 
	            for (int i = 0; i < r; ++i) 
	            {	 
	                get = Arrays.binarySearch(m[i], mid);
	 
// If element is not found in the array the binarySearch() method returns (-(insertion_point) - 1). So once we know
// the insertion point we can find elements Smaller than the searched element by the following calculation
	                if (get < 0)
	                    get = Math.abs(get) - 1;
	                else {
	                    while (get < m[i].length
	                           && m[i][get] == mid)
	                        get += 1;
	                }	 
	                place = place + get;
	            }
	 
	            if (place < desired)
	                min = mid + 1;
	            else
	                max = mid;
	        }
	        return min;
	    }
	 
	    // Driver Program to test above method.
	    public static void main(String[] args)
	    {
	        int r = 3, c = 3;
	        int m[][]
	            = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
	 
	        System.out.println("Median is "+ binaryMedian(m, r, c));
	   //wronge result check at min max assign and correct
	    }
}
