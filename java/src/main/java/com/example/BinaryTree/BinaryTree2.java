package com.example.BinaryTree;

/**
 * Created by dlancer on 2017/4/14.
 */

public class BinaryTree2 {
    public static void main(String[] args){

        int[] data = {9,8,7,6,5,4,3,2,1,10,11,12,13,14,15,16,17,18,19};
        BinaryTree2 biTree = new BinaryTree2();
        biTree.buildTree(data);
        biTree.inOrder();
    }
    //结点类:data,left,right
    class Node{
        public int data;
        public Node left;
        public Node right;
        public Node(int data){
            this.data =data;
            this.left =null;
            this.right=null;
        }
    }

    //排序二叉树类的属性
    public Node root;
    //插入结点的方法
    public void insertNode(int data){
        Node newNode = new Node(data);

        if (root==null){
            root=newNode;
        }else {
            Node current=root;
            while (true){
                if (data<current.data){
                    //赋给左子树
                    if (current.left!=null){
                        current = current.left;
                    }else {
                        current.left= newNode;
                        return;//此时赋值成功要跳出循环，
                    }
                }else {
                    //赋给右子树
                    if (current.right!=null){
                        current = current.right;
                    }else {
                        current.right= newNode;
                        return;
                    }
                }
            }

        }
    }
    //批量存入数据,构建二叉树
    public void buildTree(int[] data){
        for (int i = 0; i < data.length; i++) {
            insertNode(data[i]);
        }
    }
    //递归方法中序遍历二叉树
    public void inOrder(Node localRoot){
        if (localRoot!=null){//重要啊
            inOrder(localRoot.left);
            System.out.print(localRoot.data+"");
            inOrder(localRoot.right);
        }
    }

    public void inOrder(){
        this.inOrder(this.root);
    }
}
