package com.example.LinkedList;

/**
 * Created by dlancer on 2017/8/7.
 * 1.向链表中插入数据
 * 2.删除第i个结点
 * 3.返回结点的长度
 * 4.对链表进行排序
 */

public class LinkedListOperate {
    /**
     * 结点类，包括指针next和数据data
     */
    class Node{
        Node next = null;
        int data =0;
        public Node(int data){
            this.data = data;
        }
    }

    //头结点
    Node head = null;

    /**
     *
     * @return 链表的长度
     */
    public int listLength(){
        int length = 0;
        Node temp = head;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    /**
     * 添加结点
     * @param data 结点值
     */
    public void addNode(int data){
        Node newNode = new Node(data);
        //头结点不能为空，且头结点索引是0
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * 删除第index个结点
     * @param index 结点位置
     * @return boolean
     */
    public boolean deleteNode(int index){
        return false;
    }

    /**
     * 对链表进行冒泡排序
     * 思想：{a[1],a[2],a[3],a[4],a[5],a[6],a[7]},将a[1]分别与a[2、3、4...]比较如果比a[1]小，就交换值。
     * 一次遍历后得到a[1]的值最小；接着将a[2]分别与a[3、4...]比较，得到最小的a[2]
     * @param head 为链表的头结点
     * @return 返回排序后的头结点
     */
}
