
package crackingCode;

import java.util.* ;
import java.util.HashMap;




public class test {

	  static int superPower(int z) {
	      
	        int range = (int)Math.sqrt(z);
	        int j = 1;
	        
	        for(int n = range ; n >=2 ; n--){           
	            j = 2;
	            while((int)Math.pow(n,j) <= z){
	            	System.out.println((int)Math.pow(n,j));
	                if(z == (int)Math.pow(n,j))
	                   return 1;
	                j++;   
	            }
	        }
	        return 0;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(superPower(121));
		
		String str = "abc";
		System.out.println(str.charAt(0));
		System.out.println(str.substring(2,3));
	}

}
