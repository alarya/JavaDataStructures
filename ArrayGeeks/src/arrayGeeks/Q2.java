
/*
   Maximum Sum Path in Two Arrays
   Given two sorted arrays such the arrays may have some common elements.
   Find the sum of the maximum sum path to reach from beginning of any array to 
   end of any of the two arrays. We can switch from one array to another array only at common elements.
 * 
 */

package arrayGeeks;

public class Q2 {
	
	public static int maxSumPath(int[] arr1, int[] arr2)
	{
	   int i = 0 , j = 0;
       int sum1 = 0, sum2 = 0, finalSum = 0;
       
       while(i < arr1.length && j < arr2.length)
       {
    	   if(arr1[i] < arr2[j])
    		   sum1 += arr1[i++];
    	   else if(arr1[i] > arr2[j])
    		   sum2 += arr2[j++];
    	   else  //common point has been reached
    	   {
    	       finalSum += Math.max(sum1, sum2);
    	       sum1 = 0 ; sum2 = 0;
    	       
    	       //if more common points, keep updating sum
    	       while(i < arr1.length && j < arr2.length && arr1[i] == arr2[j]){
    	    	   finalSum += arr1[i++];
    	    	   j++;
    	       }
    	   }   	 
       }
       //Add remaining elements of arr1 if present
       while(i < arr1.length )
    	   sum1 += arr1[i++];
       //Add remaining elements of arr2 if present
       while(i < arr1.length )   
           sum2 += arr2[j++] ;
       
       finalSum += Math.max(sum1, sum2);
       
       return finalSum;
	}
	
	
	
	public static void main(String[] args) {
		
		int arr1[] = {2, 3, 7, 10, 12};
		int arr2[] = {1, 5, 7, 8} ;
		System.out.println("Max Sum path in two arrays :- " ) ;
		System.out.println("Output: " + maxSumPath(arr1,arr2));
		
		int arr3[] = {10, 12};
		int arr4[] = {5, 7, 9} ;
		System.out.println("Max Sum path in two arrays :- " ) ;
		System.out.println("Output: " + maxSumPath(arr3,arr4));
		
		int arr5[] = {2, 3, 7, 10, 12, 15, 30, 34};
		int arr6[] = {1, 5, 7, 8, 10, 15, 16, 19} ;
		System.out.println("Max Sum path in two arrays :- " ) ;
		System.out.println("Output: " + maxSumPath(arr5,arr6));
		
	}
}
