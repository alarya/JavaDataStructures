
//Write a method to replace all spaces in a string with ‘%20’.

public class Q1_5 {

	public static String replaceCharInString(String str)
	{
		int spaceCount= 0;
		int newLength = 0;
		char[] strArray = str.toCharArray();
		for(int i = 0; i < strArray.length; i++)
		{
			if(strArray[i] == ' ')
				++spaceCount;
		}
		
		newLength = strArray.length + 2 * spaceCount;		
		char[] strTemp= new char[newLength] ;
		int end = newLength - 1;
		for(int i = strArray.length - 1; i >= 0; i--)
		{
			if(strArray[i] == ' ')
			{
				strTemp[end--] = '0' ;
				strTemp[end--] = '2' ;
				strTemp[end--] = '%' ;
			}
			else
				strTemp[end--] = strArray[i];
		}
		return new String(strTemp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//testing replace function
		String str = " abde fg" ;
		System.out.println("Input String: " + str);
		str = replaceCharInString(str);
		System.out.println("Output String: " + str);
	}

}
