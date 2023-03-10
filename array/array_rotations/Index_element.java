package array_rotations;

public class Index_element {
	//program to find the element located in given index after rotations
	public static int findElement(int[] arr, int[][] ranges,int rotations, int index)
	{
		// Initialize values
		int n1 = 1;
		int i = 0;
		int leftRange = 0;
		int rightRange = 0;
		int key = 0;
		while (n1 <= rotations) {
			leftRange = ranges[i][0];
			rightRange = ranges[i][1];
			key = arr[rightRange];
			for (int j = rightRange; j >= leftRange + 1;j--)
					arr[j] = arr[j - 1];
			arr[leftRange] = key;
			n1++;
			i++;
			}
		// Return the element after all the rotations
		return arr[index];
		}

		public static void main(String[] args)
		{
			int[] arr = { 1, 2, 3, 4, 5 };
			int rotations = 2;
			int[][] ranges = { { 0, 2 }, { 0, 3 } };
			int index = 1;
			
			System.out.println(findElement(arr, ranges, rotations, index));
		}
	}
//RamGhantasala