
/*
 * Find the missing number in Arithmetic Progression
 */

package arrayGeeks;

public class Q3 {

	//using binary search tree approach
	public static int missingApNumberUtil(int[] arr, int d, int low, int high)
	{
		
		if(high<=low) return 99999;
		
		int mid = (low + high)  / 2 ;
		
		//element after mid is missing 
		if(arr[mid + 1] - arr[mid] != d)
			return arr[mid] + d ;
		
		//element before mid is missing
		if(arr[mid] - arr[mid-1] != d)
			return arr[mid] - d ;
		
		//If AP till mid is followed then recurse right
		if(arr[mid] == arr[0] + d * mid )
			return missingApNumberUtil(arr, d, mid + 1,high) ;
		
		else if(arr[high] == arr[mid] + d * (high - low))
		    return missingApNumberUtil(arr, d, low, mid - 1);
		
		else
		return 99999;
	}
	
	//
	public static int missingApNumber(int[] arr){
		
		int diff = (arr[arr.length - 1] - arr[0]) / arr.length ;
		
		
		return missingApNumberUtil(arr, diff, 0, arr.length -1) ;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 8, 10, 12, 14};
		System.out.println("Missing number: " + missingApNumber(arr));
		
		int[] arr1 = {2, 4, 6,  8, 10, 14};
		System.out.println("Missing number: " + missingApNumber(arr1));
		
		int[] arr2 = {4, 6, 8, 10, 12, 14};
		System.out.println("Missing number: " + missingApNumber(arr2));
		
		int[] arr3 = {1, 2, 3, 4, 5, 7};
		System.out.println("Missing number: " + missingApNumber(arr3));
	}

}
