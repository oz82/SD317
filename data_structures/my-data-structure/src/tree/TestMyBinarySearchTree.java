package tree;

public class TestMyBinarySearchTree {
    public static void main(String[] args) {
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        mbst.insert(4);
        mbst.insert(8);
        mbst.insert(7);
        mbst.insert(10);
        mbst.insert(12);
        mbst.insert(11);
        mbst.insert(2);
        mbst.traverseInOrder();
        System.out.println(mbst.containsNode(7));
        mbst.delete(7);
        mbst.traverseInOrder();
        System.out.println(mbst.containsNode(7));
    }
}