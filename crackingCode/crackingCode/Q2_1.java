/*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 */
package crackingCode;

import java.util.Hashtable;

//import crackingCode.LinkedListDemo;


class deleteDups extends LinkedList{
	
	
	//constructor calls base class constructor
		public deleteDups(){
			super();
		}
	
	//constructor calls base class constructor
	public deleteDups(int n){
		super(n);
	}
	
	//delete duplicates from linked list with buffer
	public void deleteDupsWbuffer(){
	
    if(this.getHeadOfLL() == null) return;
    if(this.returnCount() == 1 ) return;
    Hashtable H1 = new Hashtable();	
	
	Node start = this.getHeadOfLL();
	//loop through nodes to delete dups
	H1.put(start.value, true);
	while(start.next != null){
		if(H1.containsKey(start.next.value)){
			start.next = start.next.next;
            this.count-- ;		
		}
		else{
			H1.put(start.next.value, true);
			start = start.next;
		}
	}
	}
	
	
	//delete duplicates from linked list without buffer
	public void deleteDupWobuffer(){
		
		Node current, prev, runner;
		
		current = this.getHeadOfLL();
		prev = current;
		current = prev.next;
		while(current !=null){
			runner = this.getHeadOfLL();
			
			while(runner!= current)
			{
				if(runner.value == current.value)
				{
					prev.next = current.next ;
					current = prev.next;
					break;
				}
				runner = runner.next ;
			}
			if(runner == current){
				prev = prev.next;
				current = prev.next ;
			}
		}
	}
}

public class Q2_1 {

	public static void main(String[] args) {
		
		//create a linked list
		deleteDups D1 = new deleteDups(2);
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
		D1.deleteDupsWbuffer();
		System.out.print("Removing duplicate Nodes in Linked list: ");
		D1.printNodes();
		System.out.println("Count: " + D1.returnCount());
		
		//create a linked list
		deleteDups D2 = new deleteDups(2);
		D2.appendNode(2);
		D2.appendNode(1);
		D2.appendNode(1);
		D2.appendNode(1);
		D2.appendNode(1);
		D2.appendNode(1);
		D2.appendNode(1);
		D2.appendNode(3);
		D2.appendNode(4);
		D2.appendNode(5);
		D2.appendNode(1);
		D2.appendNode(2);
		D2.appendNode(3);
		D2.appendNode(1);
		D2.appendNode(3);
		D2.appendNode(4);
		D2.appendNode(4);
		
		//print nodes
		System.out.print("Nodes in Linked list: ");
		D2.printNodes();
		System.out.println("Count: " + D2.returnCount());
				
		//remove duplicates without buffer
		D2.deleteDupWobuffer();
		System.out.print("Removing duplicate Nodes in Linked list: ");
		D2.printNodes();
		System.out.println("Count: " + D2.returnCount());
		System.out.println("test");
	}

}
