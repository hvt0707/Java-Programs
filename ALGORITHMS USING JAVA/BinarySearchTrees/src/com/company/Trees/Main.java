package com.company.Trees;

public class Main {

    public static void main(String[] args) {
	    Tree intTree = new Tree();
	    intTree.insert(21);
        intTree.insert(34);
        intTree.insert(12);
        intTree.insert(45);
        intTree.insert(43);
        intTree.insert(32);
        intTree.traverseInOrder();
    }
}
