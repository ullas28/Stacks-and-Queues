/*Ability to dequeue from the beginning -Use LinkedList to do the Queue Operations*/

package com.bridgelabz.queue;

public class Dequeue <T> {

        public static void main(String[] args) {

            LinkedListDemo list = new LinkedListDemo();

            list.insertLast(65);

            list.insertFirst(45);
            list.showLinkedList();
            System.out.println("============");
            list.insertAtLocation(1,65);
            list.showLinkedList();
            System.out.println("============");
            list.pop();
            list.showLinkedList();
            System.out.println("============");
            list.popLast();
            System.out.println("============");
            list.showLinkedList();

    }
}
