import java.util.* ;

public class hashtableExample {	
	public static void main(String[] args) {

		//creating a hashtable
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str; 
		double bal;
		
		
		//Insert into hashtable
		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(3434.34));
		balance.put("Ayan", new Double(3434.34));
		balance.put("Daisy", new Double(3434.34));
		
		//Show all key-Value pairs
		names = balance.keys();
		while(names.hasMoreElements())
		{
			str = (String) names.nextElement() ;
			System.out.println(str + ":" + balance.get(str));
		}
		System.out.println();
		
		//Desposit 1000 into Zara's account
		bal = (double)balance.get("Zara") ;
		balance.put("Zara", new Double(bal+1000));
		System.out.println("Zara's new balance: "+ balance.get("Zara"));
		
		HashSet H1 = new HashSet();
		
	
	}

}
