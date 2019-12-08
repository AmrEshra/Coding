package BinarySearchTree.implementation;

public class Tree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traversal() {
    	root.traversal();
    }
    
    public int max() {
    	return root.max();
    }
    
    public int min() {
    	return root.min();
    }
}