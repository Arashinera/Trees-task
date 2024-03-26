package app;

public class DataHandler {

    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + " ");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.item + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.item + " ");
        preorder(node.left);
        preorder(node.right);
    }
}
