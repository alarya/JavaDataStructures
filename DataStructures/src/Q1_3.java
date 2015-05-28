
/*
 * Design an algorithm and write code to remove the duplicate characters in 
 * a string without using any additional buffer. NOTE: One or two additional 
 * variables are fine. An extra copy of the array is not.
 */
public class Q1_3 {

	public static String removeDuplicates(char[] str)
	{
		if(str == null) return null;
		int len = str.length;
		if(len < 2) return str.toString();
		int tail = 1 ;   //points to the current tail of the string
		
		for(int i = 1; i < len ; ++i)
		{
			int j; 
			for(j = 0; j < tail; ++j) //looks for duplicate elements in the string constructed
			{							   //so far
				if(str[i] == str[j]) break; 
			}
			if(j == tail) // No duplicate character found. Move the new character to the tail
			{
				str[tail] = str[i];
				++tail;
			}
		}
		if(tail<len)
		str[tail] = 0;
		
		return str.toString();
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testing method to remove duplicates
		String str1 = "abcdefg" ;
		System.out.println("Input String: " + str1);
		removeDuplicates(str1.toCharArray());
		System.out.println("Duplicates removed(if any): " + str1);
		
		String str2 = "abcdcfv" ;
		System.out.println("Input String: " + str2);
		removeDuplicates(str2.toCharArray());
		System.out.println("Duplicates removed(if any): " + str2);
		
		String str3 = "aaaa" ;
		System.out.println("Input String: " + str3);
		removeDuplicates(str3.toCharArray());
		System.out.println("Duplicates removed(if any): " + str3);
	}

}
