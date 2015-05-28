import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test {

    
	public static int returnInt(){
		return 1;
	}
	
	public static void random1(){
		
		try{
			System.out.println(1/0);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("reached here");
	}
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int number;
        String binary ;
        for(int i = 0 ; i < t ; i++)
            {      	
        	   number = in.nextInt();
               binary = Integer.toBinaryString(number);
               System.out.println(binary);
               StringBuffer result = new StringBuffer();
               for(int j = 0 ; j < binary.length() ; j++){
            	   if(binary.charAt(j) == '0') 
                        result.append(1) ;
                    else
                        result.append(0) ;
               }    
               
               System.out.println(Integer.parseInt(result.toString(), 2));
        }
         in.close();
         
         returnInt();
         */
		
		random1() ;
        
         
         
        	 
         
    }
}