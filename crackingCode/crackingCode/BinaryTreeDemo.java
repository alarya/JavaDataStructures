package crackingCode;


class NodeTree{
	int data;
	NodeTree parent; // may not use
	NodeTree left = null;
	NodeTree right = null;
	
	public NodeTree(int data){		
		this.data = data ;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data = data ;
	}
	
	public void setRight(NodeTree n){
		this.right = n ;
	}
	
	public NodeTree getRight(){
		return this.right;
	}
	
	public void setLeft(NodeTree n){
		this.left = n ;
	}
	public NodeTree getLeft(){
		return this.left;
	}
	
}

class BinaryTree{
	NodeTree root;
	int noOfNodes;
	
	BinaryTree(int n){
		root = new NodeTree(n) ;
		noOfNodes = 0;
	}
	
	public static int getHeight(NodeTree root){
		
		if(root == null) return 0;
		
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1 ;
		
	}
}


public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		//testing height of a binary tree function
		BinaryTree B1 = new BinaryTree(1);
		
		
		NodeTree N = new NodeTree(2);
		B1.root.setLeft(N);

		N = new NodeTree(3);
		B1.root.setRight(N);
		
		N = new NodeTree(4);
		B1.root.getLeft().setLeft(N);
		
		System.out.println("Height of the tree: " + BinaryTree.getHeight(B1.root));
	}

}
