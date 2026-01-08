package org.example;

public class WriteSinglyLinkedList {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;



        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = n1;
        myLinkedList.head.next = n2;
        myLinkedList.head.next.next = n4;
        myLinkedList.head = null;

        myLinkedList.print();
    }


}
 class Node {
    int data ;
    Node next ;

     public Node(int data) {
         this.data = data;
         this.next = null;
     }
 }

 class MyLinkedList {
    private Node head;
    private int size;

     public MyLinkedList() {
         this.head = null;
         this.size = 0;
     }

     void print (){
         Node current = head;
         while (current  != null){
             System.out.print(current.data + "->");
             current = current.next;
         }
         System.out.println("NUll");
     }

     void addFirst (Node item){
         item.next = head;
         head = item;
         size ++;
     }
     void addLast(Node item){
         if(head == null){
             head = item;
             size++;
             return;
         }
         Node current = head;
         while(current.next != null){
             current = current.next;

         }
         current.next = item;
         size ++;
     }
     void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            size --;
            return;
        }
        /*
        list.size > 2
         */
         Node flag = head;
        while(flag.next.next != null){
            flag = flag.next;
        }

        flag.next = null;

        size -- ;


     }



 }
