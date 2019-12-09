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

    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getNumber()) {
            subtreeRoot.setLeftNode(delete(subtreeRoot.getLeftNode(), value));
        }
        else if (value > subtreeRoot.getNumber()) {
            subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), value));
        }
        else {
            // Cases 1 and 2: node to delete has 0 or 1 Children
            if (subtreeRoot.getLeftNode() == null) {
                return subtreeRoot.getRightNode();
            }
            else if (subtreeRoot.getRightNode() == null) {
                return subtreeRoot.getLeftNode();
            }
            
            // Case 3: node to delete has 2 children
            // Replace the value in the subtreeRoot node with the smallest value
            // from the right subtree
            subtreeRoot.setNumber(subtreeRoot.getRightNode().min());
            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), subtreeRoot.getNumber()));
        }

        return subtreeRoot;
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