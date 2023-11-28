package Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLinkedList {
    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push operation to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(data + " pushed to the stack");
    }

    // Pop operation to remove the top element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int poppedValue = top.data;
        top = top.next;
        System.out.println(poppedValue + " popped from the stack");
    }

    // Peek operation to get the top element without removing it
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();
        stack.pop();

        stack.peek();
    }
}
