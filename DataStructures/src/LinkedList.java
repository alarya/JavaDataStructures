
class Node{
	protected int value;
	protected Node next = null ;
	
	public Node(int n) {this.value = n;}
	public void setNext(Node n){ this.next = n;}
}
class LinkedList{
	private Node head;
	private int count; 
	
	//creating a new LinkedList
	public LinkedList(int n){
		head = new Node(n);
		count = 1;
	}
	
	public Node getHeadOfLL(){return head;}
	
	//append a new element to the linked list 
	public void appendNode(int n){
		Node temp = head;
		while(temp.next != null ){
			temp = temp.next ;
		}
		temp.next = new Node(n);
		count++;
	}
	
	//print all elements of Linked List
	public void printNodes(){
		Node temp = head;
		while(temp.next !=null){
			System.out.println();
			System.out.print(temp.value +" ");
		}
	}
	public static void main(String args[])
	{
		LinkedList L1 = new LinkedList(1);
		L1.appendNode(2);
		L1.appendNode(3);
		L1.appendNode(4);
		L1.appendNode(5);
		L1.printNodes();
		
	}
}

class Demo{
	
	
}
