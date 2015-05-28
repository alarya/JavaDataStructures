
//Write a method to decide if two strings are anagrams or not.

public class Q1_4 {
	
	public static boolean anagram(String s, String t)
	{
		if(s.length() != t.length()) return false;
		
		int[] char_count = new int[256];
		int uniqueChars = 0;
		int charsCompleted = 0;
		
	    for(int i = 0; i < s.length(); i++) //count occurrences of each char
	    {
	    	int AsciiVal = s.charAt(i) ;
	    	if(char_count[AsciiVal]==0) uniqueChars++ ;
	    	++char_count[AsciiVal] ; 
	    }
	    
	    for(int j = 0; j < t.length(); j++) //match occurrence of each char
	    {
	    	int AsciiVal = s.charAt(j) ;
	    	
	    	if(char_count[AsciiVal] == 0) return false; //extra characters in string
	    	
	    	--char_count[AsciiVal];
	    	if(char_count[AsciiVal] == 0) charsCompleted++;
	    	if(uniqueChars == charsCompleted && j == t.length() -1 )
	    		return true;            //t is completely processed and matches s	    		    		
	    }
	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//testing anagrams
		String s = "abcdefg";
		String t = "gfedcba";
		System.out.println("s: " + s +", t: " + t);
		System.out.println("Strings are anagram? " + anagram(s,t));		
		
		s = "abcdsdfg";
		t = "gfedcba";
		System.out.println("s: " + s +", t: " + t);
		System.out.println("Strings are anagram? " + anagram(s,t));
		
		s = "aabcdefg";
		t = "afedgcba";
		System.out.println("s: " + s +", t: " + t);
		System.out.println("Strings are anagram? " + anagram(s,t));
	}

}
