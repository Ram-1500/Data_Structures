package arrangement_rearrangements;

//Java Program to shuffle a given array
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
	
public class ShuffleArray
{	// A Function to generate a random permutation of arr[]
	static void randomize( int arr[], int n)
	{
		// Creating a object for Random class
		Random r = new Random();		
		for (int i = n-1; i > 0; i--) {			
			// Pick a random index from 0 to i
			int j = r.nextInt(i+1);			
			int temp = arr[i];  // Swap arr[i] with the element at random index
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// Prints the random array
		System.out.println(Arrays.toString(arr));
	}
	
	// Driver Program to test above function
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
    	System.out.println("Enter No. of array elements: ");
    	int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array: ");
        for(int i=0;i<n;i++)
        	arr[i]= sc.nextInt();
        sc.close();
        
		randomize (arr, n);
	}
}
//RamGhantasala
