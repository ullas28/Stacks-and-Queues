package com.bridgelabz;

import java.util.LinkedList;

public class StackDemo {
    LinkedList<Integer>newlist =new LinkedList<Integer>();
    public void Push(Integer Data) {
        newlist.add(Data);
    }

    public void peek() {
        System.out.println(newlist.peek());
    }

    public void pop() {
        while(newlist.size()!=0) {
            newlist.pop();
        }
    }
    public void PrintStack() {
        System.out.println(newlist);
    }
}