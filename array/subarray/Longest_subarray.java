package subarray;

import java.util.ArrayList;
import java.util.List;
//Given an array a[] of N integers, the task is to 
//find the length of the longest Alternating Even Odd sub-array present in the array. 
public class Longest_subarray {
	
	static int longestEvenOddSubarray(ArrayList<Integer> a,int n)
	{	
		// Length of longest
		// alternating spray
		int ans = 1;
		
		// Iterate in the array
		for (int i = 0; i < n; i++) {
		int cnt = 1;
		
		// Iterate for every subarray
		for (int j = i + 1; j < n; j++) {
		if ((a.get(j - 1) % 2 == 0
		&& a.get(j) % 2 != 0)
		|| (a.get(j - 1) % 2 != 0
		&& a.get(j) % 2 == 0))
		cnt++;
		else
		break;
		}
		
		// store max count
		ans = Math.max(ans, cnt);
		}
		
		// Length of 'ans' can never be 1
		// since even odd has to occur in pair or more
		// so return 0 if ans = 1
		if (ans == 1)
		return 0;
		return ans;
	}
	
	// Drivers code
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<Integer>(
		List.of(1, 2, 3, 4, 5, 7, 8));
		int n = a.size();
		System.out.println(longestEvenOddSubarray(a, n));
	}
}
