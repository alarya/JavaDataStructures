/*
 * 3.5 Implement a MyQueue class which implements a queue using two stacks.
 */

package crackingCode;


class MyQueue{
	Stack s1, s2 ;
	
	MyQueue(){
		s1 = new Stack(); //rear
		s2 = new Stack(); //front
	}
	
	public void add(Node n){
		s1.push(n);
	}
	
	public Object remove(){
		
		//System.out.println("Count of s1: " + s1.returnCount());
		//System.out.println("Count of s2: " + s2.returnCount());
		Node temp;
		if(s2.returnCount() == 0)
		{
			while(s1.returnCount() != 0)
				{
				  temp = new Node((int)s1.pop());
				  s2.push(temp);
				}
			
			return s2.pop() ;
		}
		else 
			return s2.pop();
	}
}

public class Q3_5 {
	public static void main(String[] args) {
	
		MyQueue Q1 = new MyQueue();
		Node N1 = new Node(1);
		Q1.add(N1);
		System.out.println("Enqueue element: " + N1.value);
		
		N1 = new Node(2);
		Q1.add(N1);
		System.out.println("Enqueue element: " + N1.value);
		
		N1 = new Node(3);
		Q1.add(N1);
		System.out.println("Enqueue element: " + N1.value);
		
		
		System.out.println("Dequeue element: " + Q1.remove());
		
		N1 = new Node(4);
		Q1.add(N1);
		System.out.println("Enqueue element: " + N1.value);
		
		N1 = new Node(5);
		Q1.add(N1);
		System.out.println("Enqueue element: " + N1.value);
		
		System.out.println("Dequeue element: " + Q1.remove());
		
		System.out.println("Dequeue element: " + Q1.remove());
		
		System.out.println("Dequeue element: " + Q1.remove());
		
		System.out.println("Dequeue element: " + Q1.remove());
		
	}

}
