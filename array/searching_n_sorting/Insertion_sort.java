package searching_n_sorting;

import java.util.Scanner;

public class Insertion_sort {

	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	 
	public static void main(String[] args) {
		// R_Code Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of array elements:");
        int n = sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter arr:");
        for(int i=0;i<n;i++)
        {
        	arr1[i]=sc.nextInt();//arr has to be sorted
        }
        sc.close();
        
		System.out.println("Before Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	        System.out.println();    
	            
	        insertionSort(arr1);//sorting array using insertion sort    
	           
	        System.out.println("After Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	}

}
