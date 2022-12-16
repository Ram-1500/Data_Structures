package substring;
//Count distinct occurrences as a subsequence
public class Count_distinct_sub {
	
	static int f(int i, int j, String s, String t)
	{
		
		if (j >= t.length()) {
			return 1;
			}
		
		if (i >= s.length()) {
			return 0;
			}
		if (s.charAt(i) == t.charAt(j)) 
			{   // if character at i'th place is equal to character at j'th place then we can either take it or not take it.
				return f(i + 1, j + 1, s, t)+ f(i + 1, j, s, t);
			}
		// if characters are not equal then we will increase only first string
		return f(i + 1, j, s, t);
	}
		
		// Driver code to check above method
	public static void main(String[] args)
	{
		String T = "ge";
		String S = "geeksforgeeks";
		System.out.println( f(0, 0, S, T));
	}
}
