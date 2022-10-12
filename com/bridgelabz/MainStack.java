/*Ability to create a Stack of 56->30->70*/

package com.bridgelabz;

import java.util.List;
import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {

        StackDemo mystack = new StackDemo();
        mystack.Push(56);
        mystack.Push(30);
        mystack.Push(70);

        mystack.PrintStack();

        mystack.peek();

        mystack.PrintStack();

        mystack.pop();//removing till its empty

        mystack.PrintStack();

    }
}
