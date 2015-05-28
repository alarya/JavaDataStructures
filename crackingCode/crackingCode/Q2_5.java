/*
 * Given a circular linked list, implement an algorithm which returns node at the beginning of the loop.
 */

package crackingCode;


public class Q2_5 extends LinkedList{

	public Node getCorruptNode(){
		
		if(this.getHeadOfLL() == null) return null;
		Node N1= this.getHeadOfLL() ;
		Node N2= this.getHeadOfLL() ;
		do{
			N1 = N1.next;
			N2= N2.next.next;
		}while(N1!=N2);
    	
	
	    Node N3 = this.getHeadOfLL();
	    while(N1!=N3)
	    {
	    	N1 = N1.next ;
	    	N3 = N3.next ;
	    }
	    return N1;
	}
	
	public static void main(String[] args) {
		
		Q2_5 LL = new Q2_5();
		LL.appendNode(1);
		LL.appendNode(2);
		LL.appendNode(3);
		LL.appendNode(4);
		LL.appendNode(5);
		
		//print nodes
		System.out.print("Nodes in Linked list: ");
		LL.printNodes();
		
		//corrupt the LL
		Node N1,N2 ;
		N2 = null;
		N1 = LL.getHeadOfLL();
		while(N1.next != null)
		{
			if(N1.value == 3)
				N2 = N1 ;
			N1 = N1.next ;
		}
		N1.next = N2 ;
		
		//find corrupt node
		System.out.println("Corrupt Node: " + LL.getCorruptNode().value);
	
	}

}
