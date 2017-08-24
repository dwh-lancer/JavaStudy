package com.example.BinaryTree;

/**
 * Created by dlancer on 2017/4/14.
 */

public class BinaryTree {
    /**
     * 结点类：包括左子树、右子树和数据。
     */
    class Node{
        public int data;
        public Node left;
        public Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;
    public BinaryTree(){
        root=null;
    }

    /**
     * 插入数据到排序二叉树中,其实是插入Node（data）；
     * @param data 数据
     */
    public void insert(int data){
        Node newNode = new Node(data);
        if (root==null){
            root = newNode;
        }else {
            Node current = root;
            while (true){
                if (data<current.data){
                    if (current.left!=null){
                        current = current.left;
                    }else {
                        current.left=newNode;
                        return;
                    }
                }else {
                    if (current.right!=null){
                        current = current.right;
                    }else {
                        current.right=newNode;
                        return;
                    }
                }
            }

        }

    }
    public void buildTree(int[] data){
        for (int i = 0; i < data.length; i++) {
            insert(data[i]);
        }
    }
    //
    public void inOrder(Node localNode){
        if (localNode!=null){
            inOrder(localNode.left);
            System.out.print(localNode.data+"");
            inOrder(localNode.right);
        }
    }
    public void inOrder(){
        this.inOrder(this.root);
    }
    public static void main(String[] args){
        int[] data = {9,8,7,6,5,4,3,2};
        BinaryTree biTree = new BinaryTree();
        biTree.buildTree(data);
        biTree.inOrder();
    }

}
