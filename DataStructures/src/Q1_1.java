import java.util.* ;

//Implement an algorithm to determine if a string has all unique characters.
//What if you can not use additional data structures?

public class Q1_1 {
    
	public static boolean isUniquechars(String str)
	{
		boolean[] char_set =  new boolean[256];
		for (int i = 0 ; i < str.length(); i++)
		{
			int AsciiValue = str.charAt(i);
			if(char_set[AsciiValue]) return false;
			char_set[AsciiValue] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testing 
		System.out.println("input string: abcdefg");
        System.out.println("Unique chars? " + isUniquechars("abcdef"));
        
        System.out.println("input string: abcc");
        System.out.println("Unique chars? " + isUniquechars("abcc"));
	}

}
