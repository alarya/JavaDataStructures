/*
 * You have two numbers represented by a linked list, where each node contains a 
 * single digit. The digits are stored in reverse order, such that the 1’s digit 
 * is at the head of the list. Write a function that adds the two numbers and returns
 *  the sum as a linked list.
 */
package crackingCode;

class addLL{
	LinkedList result = new LinkedList();
	//constructors
	
/*
	public LinkedList addLinkedListRecursion(Node n1, Node n2, int carry){
		
		if(n1 == null && n2 == null) return null;
		
		int tempResult = 0;
		if(n1!=null)
			tempResult += n1.value;
		if(n2!=null)
		    tempResult += n2.value;
		
		tempResult += carry ;
		int newCarry = tempResult % 10 ;
	    result.appendNode(tempResult / 10);
			
	}
*/
	public LinkedList addLinkedList(LinkedList L1, LinkedList L2){
		
		Node n1= L1.getHeadOfLL();
		Node n2= L2.getHeadOfLL();
		if(n1 == null && n2 == null) return null;
		
		int carry = 0;
		while(n1 != null || n2 != null){
			int tempResult = 0;

			if(n1!=null){
				tempResult += n1.value;
				n1 = n1.next;
			}
			if(n2!=null){
				tempResult += n2.value;
				n2 = n2.next;
			}
			tempResult += carry;
			result.appendNode(tempResult  % 10);
			
			if (tempResult >= 10) carry = 1 ;
			else carry = 0 ;						
		}
		
		if(carry == 1)
			result.appendNode(1);
		
		return result;
	}
}

public class Q2_4 {

	public static void main(String[] args) {
		
		LinkedList L1 = new LinkedList();
		L1.appendNode(1); L1.appendNode(1); L1.appendNode(5);
		
		LinkedList L2 = new LinkedList();
		L2.appendNode(3);L2.appendNode(4);L2.appendNode(9);
		
		LinkedList L3 = new LinkedList();
		addLL addition = new addLL();
		L3 = addition.addLinkedList(L1, L2);
        
		L3.printNodes();
	}

}
