package JavaConcepts;

// Definition of a MyClass class
class MyClass {
    static int x;

    // Static block to initialize the static variable
    static {
        x = 10;
        System.out.println("Static block executed. x is initialized to: " + x);
    }
}

// Main class demonstrating the usage of the MyClass class
public class staticBlock {
    public static void main(String[] args) {
        // Accessing the static variable x
        System.out.println("Value of x: " + MyClass.x); // Output: Value of x: 10
    }
}
