/*
 * 2.3 Implement an algorithm to delete a node in the middle of a single linked list, 
 * given only access to that node.
 */
package crackingCode;

class deleteMidLL extends LinkedList{
	 
	//constructors
	 public deleteMidLL(int n){
		 super(n);
	 }
	 public deleteMidLL(){
		 super();
	 }
	 
	 public static void deleteMid(Node n){
		 if (n == null) return;
		 
		 n.value = n.next.value ;
		 n.next = n.next.next;
		 
	 }
	 public Node getMid(){
		 int count = 0;
		 Node mid = this.getHeadOfLL();
		 count = this.returnCount();
		 count = count / 2 ;
		 for(int i = 1; i <=count ; i++)
			 mid = mid.next;
		 
		 return mid;
	 }
}

public class Q2_3 {

	public static void main(String[] args) {
		//create a linked list
		deleteMidLL D1 = new deleteMidLL(2);
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
		
		//print nodes
		System.out.print("Nodes in Linked list: ");
		D1.printNodes();
		System.out.println("Count: " + D1.returnCount());
		
		//delete mid
		deleteMidLL.deleteMid(D1.getMid());
		System.out.print("Nodes in Linked list after deleting mid: ");
		D1.printNodes();
	}

}
