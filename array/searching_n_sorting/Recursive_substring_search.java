package searching_n_sorting;

import java.util.Scanner;

public class Recursive_substring_search {

	public static boolean myContains(String s1, String s2){
	    if(s1 == null || s2 == null)
	        return false;
	    if(s1.isEmpty() || s2.isEmpty())
	        return false;
	    //int remain= s2.substring(s1);
	    return myContains(s1, s2.substring(1));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Give two string inputs:");
		s1= sc.nextLine();
		s2= sc.nextLine();
		sc.close();
		boolean b= myContains(s1,s2);
		System.out.println(b);
		
	}
}
