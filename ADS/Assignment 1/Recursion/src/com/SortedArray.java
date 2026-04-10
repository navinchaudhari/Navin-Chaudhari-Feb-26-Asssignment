package com;

public class SortedArray {

	 static boolean isSortedHelper(int arr[], int n){
	        
	        if (n == 1 || n == 0)
	            return true;
	            
	        return arr[n - 1] >= arr[n - 2] && isSortedHelper(arr, n - 1);
	    }
	    
	 
	public static void main(String[] args) {
		 int arr[] = { 60, 20, 30, 40, 50 };
	        int n = arr.length;
	        
	        if (isSortedHelper(arr, arr.length))
	            System.out.print("true");
	        else
	            System.out.print("false");
	
	
	}

}
