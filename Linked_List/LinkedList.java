package Linked_List;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;           // it is set at head to start traversing from 
                                     // head to last node for inserting at last
            while(n.next!=null){
                n = n.next;
            }   
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void search(int val){
        Node n = head;
        boolean found = false;
        while(n.next!=null){
            if(n.data == val){
                found = true;
                break;
            }
            n = n.next;
        }
        if(found || n.data==val){
            System.out.println("Value found : "+n.data);
        } 
        else{
            System.out.println("Value not found");
        }
    }
    public boolean deleteByValue(int val){
        if (head == null) {
            return false; // Empty list, deletion not possible
        }
        
        if (head.data == val) {
            head = head.next; // Special case: deletion at the head
            return true;
        }
        Node n = head;
        Node prev = null;
        while(n.next!=null){
            if(n.data == val){
                prev.next = n.next;
                return true;
            }
            prev = n;
            n = n.next;
        }
        return false;
    }

    public void display(){
        Node node = head;
        while(node.next != null){
            System.out.print(node.data + " -> ");   
            node = node.next;
        }
        System.out.print(node.data);
    }

}
