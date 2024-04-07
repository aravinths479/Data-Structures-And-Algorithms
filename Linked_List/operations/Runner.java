package Linked_List.operations;

public class Runner {
    public static void main(String args[]) {
        
        LinkedList lst = new LinkedList();
        
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