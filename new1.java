
class Node{
    int data;
    Node next;
}

class linkedList{
    
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
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
        Node n = head;
        while(n.next!=null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print(n.data); 
    }
}


public class new1 {

    public static void main(String[] args) {
        linkedList lst = new linkedList();
        lst.insert(20);
        lst.insert(30);
        lst.insert(40);

        lst.display();

        lst.insertAtStart(10);
        System.out.println();
        lst.display();
        System.out.println();
        lst.search(30);
        lst.display();
        System.out.println();
        System.out.println("Deletion success : "+lst.deleteByValue(30));
        lst.display();

    }
}