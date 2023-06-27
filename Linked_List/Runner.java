package Linked_List;

public class Runner {
    public static void main(String args[]) {
        
        LinkedList lst = new LinkedList();
        lst.insert(5);
        lst.insert(6);
        lst.insert(7);

        lst.insertAtStart(4);

        lst.display();
    }
}