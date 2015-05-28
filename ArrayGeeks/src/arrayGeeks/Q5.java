/*
 * Find Index of 0 to be replaced with 1 to get longest continuous sequence of 1s in a binary array
 * 
 * 2 approaches 
 *  
 * 1) for every 0 count number of 1s before and after
 * 2) using 3 pointers all pointing to zeros
 */

package arrayGeeks;

public class Q5 {

	public static int returnIndex(int[] arr)
	{
		int prev_zero  = -1 , prev_prev_zero = -1 ;
		int resultIndex = -1, resultCount = 0;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] == 0)
			{
				if(i - prev_prev_zero > resultCount)
				{
					resultCount = i - prev_prev_zero ;
					resultIndex = prev_zero;
				}
				
				prev_prev_zero = prev_zero;
				prev_zero = i;								
		    }
		}
		//check for last encountered zero
		if(arr.length - prev_prev_zero > resultCount)
		     resultIndex = prev_zero;
		
		return resultIndex ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1} ;
		System.out.println("Index: " + returnIndex(arr1));
		
		int[] arr2 = {1, 1, 1, 1, 0} ;
		System.out.println("Index: " + returnIndex(arr2));
		
		int[] arr3 = {1, 1, 0} ;
		System.out.println("Index: " + returnIndex(arr3));
	}

}
