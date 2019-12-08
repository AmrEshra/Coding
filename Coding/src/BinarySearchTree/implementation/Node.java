package BinarySearchTree.implementation;

public class Node {

	private int number;
	private Node leftNode;
	private Node rightNode;

	public void insert(int value) {
		if (value == number)
			return;

		if (value < number) {
			if (leftNode == null)
				leftNode = new Node(value);
			else
				leftNode.insert(value);
		} else if (value > number) {
			if (rightNode == null)
				rightNode = new Node(value);
			else
				rightNode.insert(value);
		}
	}

	public void traversal() {
		
		if(leftNode != null)
			leftNode.traversal();
		System.out.println(number);
		
		if(rightNode != null)
			rightNode.traversal();
	}
	
	public int max() {
		
		if(rightNode == null)
			return number;
		else
			return rightNode.max();
	}
	
	public int min() {
		
		if(leftNode == null)
			return number;
		else
			return leftNode.min();
	}
	
	public Node(int number) {
		this.number = number;
	}

	public Node() {
	}
}
