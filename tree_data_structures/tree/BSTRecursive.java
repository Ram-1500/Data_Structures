package tree;

public class BSTRecursive {

    private Node root;
    BSTRecursive() {
        root = null;
    }

    public static void main(String[] args) {
        BSTRecursive tree = new BSTRecursive();
        tree.add(5);
        tree.add(10);
        tree.add(9);
        assert !tree.find(4) : "4 is not yet present in BST";
        assert tree.find(10) : "10 should be present in BST";
        tree.remove(9);
        assert !tree.find(9) : "9 was just deleted from BST";
        tree.remove(1);
        assert !tree.find(
            1
        ) : "Since 1 was not present so find deleting would do no change";
        tree.add(20);
        tree.add(70);
        assert tree.find(70) : "70 was inserted but not found";
        /*
     Will print in following order
     5 10 20 70
         */
        tree.inorder();
    }

    private Node delete(Node node, int data) {
        if (node == null) {
            System.out.println("No such data present in BST.");
        } else if (node.data > data) {
            node.left = delete(node.left, data);
        } else if (node.data < data) {
            node.right = delete(node.right, data);
        } else {
            if (node.right == null && node.left == null) { // If it is leaf node
                node = null;
            } else if (node.left == null) { // If only right node is present
                Node temp = node.right;
                node.right = null;
                node = temp;
            } else if (node.right == null) { // Only left node is present
                Node temp = node.left;
                node.left = null;
                node = temp;
            } else { // both child are present
                Node temp = node.right;
                // Find leftmost child of right subtree
                while (temp.left != null) {
                    temp = temp.left;
                }
                node.data = temp.data;
                node.right = delete(node.right, temp.data);
            }
        }
        return node;
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else if (node.data > data) {
            node.left = insert(node.left, data);
        } else if (node.data < data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.print(node.data + " ");
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            inOrder(node.left);
        }
        System.out.print(node.data + " ");
        if (node.right != null) {
            inOrder(node.right);
        }
    }

    private boolean search(Node node, int data) {
        if (node == null) {
            return false;
        } else if (node.data == data) {
            return true;
        } else if (node.data > data) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    public void add(int data) {
        this.root = insert(this.root, data);
    }

    public void remove(int data) {
        this.root = delete(this.root, data);
    }

    public void inorder() {
        System.out.println("Inorder traversal of this tree is:");
        inOrder(this.root);
        System.out.println(); // for next line
    }

    public void postorder() {
        System.out.println("Postorder traversal of this tree is:");
        postOrder(this.root);
        System.out.println(); // for next li
    }

    public void preorder() {
        System.out.println("Preorder traversal of this tree is:");
        preOrder(this.root);
        System.out.println(); // for next li
    }

    public boolean find(int data) {
        if (search(this.root, data)) {
            System.out.println(data + " is present in given BST.");
            return true;
        }
        System.out.println(data + " not found.");
        return false;
    }

       private static class Node {

        int data;
        Node left;
        Node right;
        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }
}