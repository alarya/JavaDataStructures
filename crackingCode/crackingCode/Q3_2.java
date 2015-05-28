package crackingCode;

/*
 * How would you design a stack which, in addition to push and pop, also has a function min 
 * which returns the minimum element? Push, pop and min should all operate in O(1) time.
 */

class Stack{
	Node top;
    int count = 0;
		
	public Stack(){
		top = null ;
	}
	public Object pop(){
		if(top != null){
			Object data = top.value;
			top = top.next;
			count--;
			return data;
		}
		else 
			return null;
	}
	
	public void push(Node item){
		if(top == null)
			item.min = item.value ;
		else
		item.min = Math.min(top.min, item.value);
		
		item.next = top ;
		top = item;
		count++;
		
	}
	
	public Object peek(){
		if(top != null)
		return top.value;
		else
			return null ;
	}
	
	public Object returnMin()
	{
		if(top != null)
			return top.min ;
		else
			return null ;
	}
	
	public int returnCount() { return count;}
}



public class Q3_2 {

	public static void main(String[] args) {
		
		Stack S1 = new Stack();
		Node N1 = new Node(1);
		S1.push(N1);
		System.out.println("pushin element: " + N1.value);
		System.out.println("Current top: " + S1.peek()) ;
		
		N1 = new Node(2);
		S1.push(N1);
		System.out.println("pushin element: " + N1.value);
		System.out.println("Current top: " + S1.peek()) ;
		
		N1 = new Node(3);
		S1.push(N1);
		System.out.println("pushin element: " + N1.value);
		System.out.println("Current top: " + S1.peek()) ;
		
		N1 = new Node(4);
		S1.push(N1);
		System.out.println("pushin element: " + N1.value);
		System.out.println("Current top: " + S1.peek()) ;
		
		System.out.println("popped element: " + S1.pop());
		System.out.println("Current top: " + S1.peek()) ;
		
		System.out.println("popped element: " + S1.pop());
		System.out.println("Current top: " + S1.peek()) ;
		System.out.println("popped element: " + S1.pop());
		System.out.println("Current top: " + S1.peek()) ;
		System.out.println("popped element: " + S1.pop());
		System.out.println("Current top: " + S1.peek()) ;
		
		System.out.println("popped element: " + S1.pop());
		System.out.println("Current top: " + S1.peek()) ;
		
		//testing minimum stack
		System.out.println("\n\n Testing minimum stack");
		Stack S2 = new Stack();
		Node N2 = new Node(10);
		S2.push(N2);
		System.out.println("pushin element: " + N2.value);
		System.out.println("Current min: " + S2.returnMin()) ;
		
		N2 = new Node(6);
		S2.push(N2);
		System.out.println("pushin element: " + N2.value);
		System.out.println("Current min: " + S2.returnMin()) ;
		
		N2 = new Node(8);
		S2.push(N2);
		System.out.println("pushin element: " + N2.value);
		System.out.println("Current min: " + S2.returnMin()) ;
		
		N2 = new Node(4);
		S2.push(N2);
		System.out.println("pushin element: " + N2.value);
		System.out.println("Current min: " + S2.returnMin()) ;
		
		System.out.println("popped element: " + S2.pop());
		System.out.println("Current min: " + S2.returnMin()) ;
		
		System.out.println("popped element: " + S2.pop());
		System.out.println("Current min: " + S2.returnMin()) ;
		
		System.out.println("popped element: " + S2.pop());
		System.out.println("Current min: " + S2.returnMin()) ;
		
		System.out.println("popped element: " + S2.pop());
		System.out.println("Current min: " + S2.returnMin()) ;
		
		System.out.println("popped element: " + S2.pop());
		System.out.println("Current min: " + S2.returnMin()) ;
		
		System.out.println((int)Math.sqrt(130));
	}

}
