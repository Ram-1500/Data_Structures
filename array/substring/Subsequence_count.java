package substring;
//Number of subsequences of the form a^i b^j c^k
public class Subsequence_count {

	static int countSubsequences(String s)
    {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
 
        for (int i = 0; i < s.length(); i++) {
            /* If current character is 'a', then
               there are following possibilities :
                 a) Current character begins a new subsequence.
                 b) Current character is part of aCount subsequences.
                 c) Current character is not part of  a Count subsequences. */
            if (s.charAt(i) == 'a')
                aCount = (1 + 2 * aCount);
            else if (s.charAt(i) == 'b')
                bCount = (aCount + 2 * bCount);
 
            else if (s.charAt(i) == 'c')
                cCount = (bCount + 2 * cCount);
        }
 
        return cCount;
    }
 
    // Driver code
    public static void main(String args[])
    {
        String s = "abbc";
        System.out.println(countSubsequences(s));
    }
}
