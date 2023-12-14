package tree;

public class MyBinarySearchTree {
    // Node ic sinifi agacin her bir dugumunu temsil eder.
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;

    public MyBinarySearchTree() {
        root = null;
    }

    // agaca bir dugum ekler.
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    // agacta belirli bir degerin olup olmadigini kontrol eder.
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
        System.out.println();
    }

    private void traverseInOrderRecursive(Node node) {
        if (node != null) {
            traverseInOrderRecursive(node.left);
            System.out.print(node.value + " ");
            traverseInOrderRecursive(node.right);
        }
    }

    public void traversePreOrder() {
        traversePreOrderRecursive(root);
        System.out.println();
    }

    private void traversePreOrderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            traversePreOrderRecursive(node.left);
            traversePreOrderRecursive(node.right);
        }
    }

    public void traversePostOrder() {
        traversePostOrderRecursive(root);
        System.out.println();
    }

    private void traversePostOrderRecursive(Node node) {
        if (node != null) {
            traversePostOrderRecursive(node.left);
            traversePostOrderRecursive(node.right);
            System.out.print(node.value + " ");
        }
    }

    // agactan bir degeri siler
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Node'u silme durumlari
            // Durum 1: yapraksiz dugum
            if (current.left == null && current.right == null) {
                return null;
            }

            // Durum 2: tek cocuklu dugum
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Durum 3: iki cocuklu dugum
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
}