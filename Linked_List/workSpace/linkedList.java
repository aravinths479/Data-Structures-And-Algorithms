package Linked_List.workSpace;

class linkedList{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node  n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
            System.out.println("inserted Sucessfully");
        }
        
    }
    public void display(){
        Node n = head;
        while(n.next!=null){
            System.out.print(n.data+" -> ");
            n = n.next;
        }
        System.out.print(n.data);
    }
}