package app;

public class BinaryTreeData {
    Node root;

    public static BinaryTreeData Tree() {

        NodeRandom.clearGeneratedNumbers();
        BinaryTreeData binaryTree = new BinaryTreeData();

        binaryTree.root = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.right = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left.left = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left.right = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.right.left = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.right.right = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left.left.left = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left.left.right = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left.right.left = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.left.right.right = new Node(NodeRandom.Random(1, 12));
        binaryTree.root.right.left.left = new Node(NodeRandom.Random(1, 12));

        return binaryTree;
    }
}
