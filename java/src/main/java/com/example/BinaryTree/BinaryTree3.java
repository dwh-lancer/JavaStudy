package com.example.BinaryTree;

/**
 * Created by dlancer on 2017/4/17.
 */

public class BinaryTree3 {
   //结点类
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
    //排序二叉树类的属性
    private Node root;

    /**
     * 插入数据
     * @param data
     */
    private void insertData(int data){
        Node newNode = new Node(data);
        if (root==null){
            root = newNode;
        }else {
            Node current = root;
            while (current!=null){
                if (data<current.data){
                    if (current.left!=null){
                        current = current.left;
                    }else {
                        current.left = newNode;
                        break;
                    }
                }else {
                    if (current.right!=null){
                        current = current.right;
                    }else {
                        current.right = newNode;
                        break;
                    }
                }
            }
        }
    }

    /**
     * 建立排序二叉树
     * @param data
     */
    private void buildTree(int[] data){
        if (data!=null){
            for (int i = 0; i < data.length; i++) {
                insertData(data[i]);
            }
        }
    }

    /**
     * 中序排序
     * @param root
     */
    public void inOrder(Node root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public void inOrder(){
        this.inOrder(this.root);
    }

    public static void main(String[] args){
        int[] data = {4,9,8,7,6,5,4,3,2,1};
        BinaryTree3 biTree = new BinaryTree3();
        biTree.buildTree(data);
        biTree.inOrder();
    }
}
