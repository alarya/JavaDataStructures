package crackingCode;

class Node{
	protected int value;
	protected Node next = null ;
	protected int min;
	
	public Node(int n) {value = n;}
}


class LinkedList{
	private Node head;
	protected int count; 
	
	//creating a null LinkedList
	public LinkedList(){
		head = null;
	}
	//creating a new LinkedList
	public LinkedList(int n){
		head = new Node(n);
		count = 1;
	}
	
	public Node getHeadOfLL(){return head;}
	public int returnCount(){return count;}
	
	//append a new element to the linked list 
	public void appendNode(int n){
		//if list is empty 
		if(head == null){
			head = new Node(n);
			count++;
			return;
		}
		//else add node to the tail
		Node temp = head;
		while(temp.next != null ){
			temp = temp.next ;
		}
		Node end = new Node(n);
		temp.next = end;
		count++;
	}
	
	//Delete a node with given value (deletes first occurrence of the node)
	public void deleteNode(int n)
	{
		//no element to delete
		if(head == null)
			return;
		
		Node current = head;
		//if node to be deleted is head
		if(current.value == n) {
			head = current.next;
			count--;
			return ;
		}
		
		//non head node to be deleted
		Node prev = head;
		while(current.next != null ){
			prev = current;
			current = current.next ;
			if(current.value == n) 
			{
				prev.next = current.next ;
				count--;
				return ;
			}
		}
		
		//tail to be deleted;
		if(current.value == n){
		prev.next = null ;
		count--;
		}
	}
	
	//print all elements of Linked List
	public void printNodes(){
		if(head == null) return;
		Node temp = head;
		System.out.println();
		System.out.print(temp.value +" ");
		while(temp.next !=null){
			temp = temp.next;			
			System.out.print(temp.value +" ");
		}
		System.out.println();
	}
}


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList L1 = new LinkedList(1);
		System.out.println("Length of linked list of L1 is : " + L1.returnCount());
		L1.appendNode(2);
		L1.appendNode(3);
		L1.appendNode(4);
		L1.appendNode(5);	
		System.out.println("Length of linked list of L1 is : " + L1.returnCount());
		
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		
		//deleting a middle element
		L1.deleteNode(3);
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		
		//deleting head
		L1.deleteNode(1);
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		
		//deleting a tail element
		L1.deleteNode(5);
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		System.out.println("Length of linked list of L1 is : " + L1.returnCount());
		
		//Try to delete an element not present
		L1.deleteNode(10);
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		
		//Try to delete element from an empty Linked list
		L1.deleteNode(2); 
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		L1.deleteNode(4);
		System.out.print("The linked list items of L1 are:-");
		System.out.println();
		System.out.println("Length of linked list of L1 is : " + L1.returnCount());
		L1.deleteNode(4);
		L1.deleteNode(4);
		L1.deleteNode(4);
		
		//Add node to an empty list
		L1.appendNode(1);
		System.out.println();
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		
		//Add random nodes to the tail
		L1.appendNode(21);L1.appendNode(31);L1.appendNode(4);L1.appendNode(7);
		System.out.println();
		System.out.print("The linked list items of L1 are:-");
		L1.printNodes();
		System.out.println("Length of linked list of L1 is : " + L1.returnCount());
	}

}
