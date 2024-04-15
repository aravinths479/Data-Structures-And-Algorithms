package Linked_List;

import java.util.Scanner;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        System.out.println("Inserted : " + value);
    }

    public void display() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    
}

public class midElement {

    public static void calcMid(LinkedList lst, int n) {
        if (n == 0) {
            System.out.println("List is empty.");
            return;
        }
    
        int mid = n / 2;
        int count = 0;
        Node current = lst.head;
    
        while (current != null) {
            if (count == mid - 1 && n % 2 == 0) {
                System.out.println("Middle elements are: " + current.data + " and " + current.next.data);
                return;
            } else if (count == mid) {
                if (n % 2 == 0) {
                    System.out.println("Middle elements are: " + current.data + " and " + current.next.data);
                } else {
                    System.out.println("Middle element is: " + current.data);
                }
                return;
            }
            count++;
            current = current.next;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();

        LinkedList lst = new LinkedList();
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            lst.insert(val);
        }

        calcMid(lst,n);
    }
}