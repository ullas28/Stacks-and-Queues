package com.bridgelabz;

import java.util.LinkedList;

public class StackDemo {
    LinkedList<Integer>newlist =new LinkedList<Integer>();
    public void Push(Integer Data) {
        newlist.add(Data);
    }
    public void PrintStack() {
        System.out.println(newlist);
    }
}