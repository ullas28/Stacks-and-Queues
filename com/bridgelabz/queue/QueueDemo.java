/*Ability to create a Queue of 56->30->70*/

package com.bridgelabz.queue;

import java.util.LinkedList;

public class QueueDemo {
    LinkedList<Integer> list = new LinkedList<Integer>();

    public void enQueue(Integer Data) {
        list.addLast(Data);
    }

    public void PrintQueue() {
        System.out.println(list);
    }

    //Adding Main method in same class
    public static void main(String[] args) {
        //Queue Program
        QueueDemo myQueue = new QueueDemo();

        myQueue.enQueue(56);
        myQueue.enQueue(30);
        myQueue.enQueue(70);

        myQueue.PrintQueue();
    }
}
