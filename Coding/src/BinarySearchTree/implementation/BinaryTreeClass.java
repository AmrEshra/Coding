package BinarySearchTree.implementation;

public class BinaryTreeClass {

	public static void main(String[] args) {

		Tree binartTree = new Tree();
		binartTree.insert(15);
		binartTree.insert(10);
		binartTree.insert(20);
		binartTree.insert(11);
		binartTree.insert(100);
		binartTree.insert(16);
		binartTree.insert(19);
		binartTree.insert(3);
		
//		binartTree.traversal();
		
		System.out.println("max Number is : " + binartTree.max() );
		System.out.println("min Number is : " +  binartTree.min());

	}

}
