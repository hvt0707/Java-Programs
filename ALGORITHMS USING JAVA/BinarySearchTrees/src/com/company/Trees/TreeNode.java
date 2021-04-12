package com.company.Trees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value == data){
            return;
        }

        if(value < data){
            if(leftChild == null){
                leftChild = new TreeNode(data);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if(rightChild == null){
                rightChild = new TreeNode(data);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data+", ");
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        System.out.println(data+", ");
        if(leftChild != null){
            leftChild.traversePreOrder();
        }
        if(rightChild != null){
            rightChild.traversePreOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int value) {
        this.data = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
