package Linked_List;

import java.util.Scanner;

class Node{
    char data;
    Node next;
}

class Stack{
    Node head;
    public void push(char val){
        Node node = new Node();
        node.data = val;
        node.next = null;
        if(head==null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
        System.out.println("Pushed sucessfully");
    }
    public char pop(){
        Node newHead;
        char poped=' ';
        if(head == null){
            System.out.println("Stack empty");
        }
        else{
            poped = head.data;
            newHead = head.next;
            head = newHead;
        }
        return poped;
    }
    public void display() {
        if (head == null) {
            System.out.println("Stack empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    
}

public class plaindrome {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push('q');
        st.push('r');
        st.push('y');
        st.pop();
        st.display();


    }
}
