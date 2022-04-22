package com.keyin.bst;

public class BstDemo {

    public static void main(String[] args) {
        Bst tree = new Bst();
        tree.root = tree.insertNode(tree.root, 37);
        tree.root = tree.insertNode(tree.root, 16);
        tree.root = tree.insertNode(tree.root, 58);
        tree.root = tree.insertNode(tree.root, 10);
        tree.root = tree.insertNode(tree.root, 23);
        tree.root = tree.insertNode(tree.root, 64);
        tree.root = tree.insertNode(tree.root, 7);
        tree.root = tree.insertNode(tree.root, 13);
        tree.printTree(tree.root, "", true);
        tree.root = tree.deleteNode(tree.root, 16);
        System.out.println("After Deletion: ");
        tree.printTree(tree.root, "", true);
    }
}
