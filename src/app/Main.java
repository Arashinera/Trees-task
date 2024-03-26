package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        BinaryTreeData.Tree();

        BinaryTreeData tree = BinaryTreeData.Tree();
        DataHandler dataHandler = new DataHandler();

        int choice = 0;

        do {
            try {
                System.out.println("""
                    Please, select which traversal do you want to use?
                    1) Inorder traversal
                    2) Preorder traversal
                    3) Postorder traversal
                    4) All in one
                    0) Exit""");
                choice = input.nextInt();
            } catch (InputMismatchException exception){
                System.out.println("Please, input integer value!");
            }
        } while (choice < 0 || choice > 4);

        switch (choice) {
            case 1:
                System.out.println("\nInorder traversal:\n");
                dataHandler.inorder(tree.root);
                break;
            case 2:
                System.out.println("\nPreorder traversal:\n");
                dataHandler.preorder(tree.root);
                break;
            case 3:
                System.out.println("\nPostorder traversal:\n");
                dataHandler.postorder(tree.root);
                break;
            case 4:
                System.out.println("\nInorder traversal:");
                dataHandler.inorder(tree.root);
                System.out.println("\nPreorder traversal:");
                dataHandler.preorder(tree.root);
                System.out.println("\nPostorder traversal:");
                dataHandler.postorder(tree.root);
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
