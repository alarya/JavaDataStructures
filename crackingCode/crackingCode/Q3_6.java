
/*Write a program to sort a stack in ascending order. 
 * You should not make any assumptions about how the stack is implemented. 
 * The following are the only functions that should be used to write this 
 * program: push | pop | peek | isEmpty.
 * */

package crackingCode;

import java.util.Arrays;


public class Q3_6 {

	public static Stack SortStack(Stack s){
		
		Stack r = new Stack();
		while(s.returnCount() != 0){
			Node temp = new Node((int)s.pop());			
			 while(r.returnCount()!=0 &&  (int)r.peek() > temp.value){
				 Node temp1 = new Node((int)r.pop());
				 s.push(temp1);
				 
			 }
			 r.push(temp);
		}
		return r;		
	}
	
	public static void printStack(Stack s){
		while(s.returnCount() != 0){
			System.out.print(s.pop() + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		Node N1 = new Node(3);
		s.push(N1);
		N1 = new Node(5);
		s.push(N1);
		
		N1 = new Node(1);
		s.push(N1);
		N1 = new Node(2);
		s.push(N1);
		N1 = new Node(7);
		s.push(N1);
		N1 = new Node(8);
		s.push(N1);
		N1 = new Node(0);
		s.push(N1);
		
		Stack r = SortStack(s);
		System.out.println("Sorted stack: ");
		printStack(r);
		
		//testing inbuilt sort function
	/*	System.out.println();
		int[] array = {1 , 2 , 7 , 4 , 3 } ;
		for(int i = 0 ; i < array.length ; i++)
		   System.out.print(array[i] + " ");
		Arrays.sort(array);
		System.out.println();
		for(int i = 0 ; i < array.length ; i++)
			   System.out.print(array[i] + " ");  */
	}

}
