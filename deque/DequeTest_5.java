package com.algorithm;

public class DequeTest_5 {
    public static void main(String[] args) throws Exception{
        Deque5 de = new Deque5();
        de.addFirst(10);
        de.addFirst(20);
        de.addFirst(30);
        de.addFirst(40);
        de.addLast(100);
        de.addLast(200);
        de.addLast(300);
        de.addLast(400);
        System.out.println(de.removeFirst());
        System.out.println(de.removeFirst());
        System.out.println(de.removeLast());
        System.out.println(de.removeLast());
        System.out.println(de.removeLast());
        System.out.println(de.removeLast());
        System.out.println(de.removeLast());
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
        System.out.println(de.size());
        System.out.println(de.isEmpty());
    }
}

//addFirst(), addLast(), removeFirst(), removeLast(), getFirst(), getLast(),
class Deque5{
    private Node head;
    private Node tail;
    private int size;
    class Node{
        private int data;
        private Node next;
        private Node previous;
    }

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(size == 0) {
            tail = newNode;
            head = newNode;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(size==0){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        size++;
    }

    public int removeFirst() throws Exception{
        if(size == 0) throw new Exception("isEmpty");
        int returnData = head.data;
        Node newNode = new Node();
        newNode = head.next;
        head = null;
        head = newNode;
        size--;
        return returnData;
    }

    public int removeLast() throws Exception{
        if(size == 0) throw new Exception("isEmpty");
        int returnData = tail.data;
        Node newNode = new Node();
        newNode = tail.previous;
        tail = null;
        tail = newNode;
        size--;
        return returnData;
    }

    public int getFirst() throws Exception{
        if(size == 0) throw new Exception("isEmpty");
        return head.data;
    }

    public int getLast() throws Exception{
        if(size == 0) throw new Exception("isEmpty");
        return tail.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
