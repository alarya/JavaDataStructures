/*
 * 2.2 Implement an algorithm to find the nth to last element of a singly linked list.
 * 
 */

package crackingCode;


class nElementLL extends LinkedList{
	
	 //constructors
	 public nElementLL(int n){
		 super(n);
	 }
	 public nElementLL(){
		 super();
	 }
	 
	 //Find nth last element
	 public Node nthLastElement(int n){
		 Node first, second;

		 first = this.getHeadOfLL();
		 for(int count=0;count<n-1;count++)
			 first = first.next;
		 
		 if(first == null) return null; //node does not exist
		 
		 second = this.getHeadOfLL();
		 while(first.next !=null){
			 second = second.next ;
			 first = first.next ;
		 }
		 
		 return second;
	 }
}



public class Q2_2 {

	public static void main(String[] args) {
		
		//create a linked list
				nElementLL D1 = new nElementLL(2);
				D1.appendNode(2);
				D1.appendNode(1);
				D1.appendNode(1);
				D1.appendNode(1);
				D1.appendNode(1);
				D1.appendNode(1);
				D1.appendNode(1);
				D1.appendNode(3);
				D1.appendNode(4);
				D1.appendNode(5);
				D1.appendNode(1);
				D1.appendNode(2);
				D1.appendNode(3);
				D1.appendNode(1);
				D1.appendNode(3);
				D1.appendNode(4);
				D1.appendNode(4);
				
				//print nodes
				System.out.print("Nodes in Linked list: ");
				D1.printNodes();
				System.out.println("Count: " + D1.returnCount());
				
				//remove duplicates without buffer
				System.out.print("5th Last Element is: " + D1.nthLastElement(5).value);
			
	}

}
