package substring;
//Find number of times a string occurs as a subsequence in given string
public class Sub_count_in_str {

	static int count(String a, String b, int m, int n)
    {
       
        if ((m == 0 && n == 0) || n == 0)
            return 1;
     
        
        if (m == 0)
            return 0;
     
       
        if (a.charAt(m - 1) == b.charAt(n - 1))
            return count(a, b, m - 1, n - 1) +
                   count(a, b, m - 1, n);
        else
           
            return count(a, b, m - 1, n);
    }
     
    // Driver code
    public static void main (String[] args)
    {
        String a = "GeeksforGeeks";
        String b = "Gks";
        System.out.println( count(a, b, a.length(), b.length())) ;
     
    }
}
