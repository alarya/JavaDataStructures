/*
 * Median of two sorted arrays
 * 
 *  There are 2 sorted arrays A and B of size n each. Write an algorithm to find the median
 *   of the array obtained after merging the above 2 arrays(i.e. array of length 2n). 
 *   The complexity should be O(log(n))
 */

package arrayGeeks;

public class Q8 {
	
	public static int getMedian1(int[] arr1, int[] arr2){
		
		if(arr1.length == 0)
			return arr2[(arr2.length-1)/2 ];
		if(arr2.length == 0)
			return arr1[(arr1.length-1) /2];
		
		int mid = ((arr1.length-1) + (arr2.length-1)) / 2 ;
		
		int[] mergeArray = new int[arr1.length + arr2.length];
		
		int i = 0, j = 0, k = 0 ;
		while(i < arr1.length && j < arr2.length){
							
			if(arr1[i] < arr2[j])
				{
				  mergeArray[k++] = arr1[i++];
				}			
			else
				mergeArray[k++] = arr2[j++];				
		}
		
		return mergeArray[mid];
	}
	
	public static int getMedian2(int[] arr1, int[] arr2, int low1, int high1, int low2, int high2)
	{
		int mid1 = low1 + high1 ;
		int mid2 = low2 + high2 ;
		
		if(high1 - low1 == 1)
			return 
		
		if(arr1[mid1] < arr2[mid2])
		{
			return getMedian2(arr1,arr2,mid1+1,high1,low2 * 2, mid2);
		}
					
		else	
			return getMedian2(arr1,arr2,low1,mid1-1,mid2+1,high2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1, 12, 15, 26, 38};
	    int arr2[] = {2, 13, 17, 30, 45};
	    
	    System.out.println("Result: " + getMedian1(arr1,arr2));
	    
	    int arr3[] = {1, 2, 4, 5, 6};
	    int arr4[] = {7, 8, 9};
	    
	    System.out.println("Result: " + getMedian1(arr3,arr4));
	}

}
