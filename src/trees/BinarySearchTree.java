package trees;

public class BinarySearchTree {

    public Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }
        Node current = root;
        while (true) {
            if (newNode.value < current.value) {
                if (current.left == null) {
                    current.left = newNode;
                    return true;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return true;
                }
                current = current.right;
            }
        }
    }

    public boolean contains(int value) {
        if(root == null) return false;

        Node temp = root;
        while(temp != null) {

            if(value < temp.value) {
                temp = temp.left;
            } else if(value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }


}
