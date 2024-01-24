// Filename: MultipleClasses.java

// First class
class ClassOne {
    public static void display() {
        System.out.println("This is ClassOne");
    }
}
// Second class
class ClassTwo {
    public static void show() {
        System.out.println("This is ClassTwo");
    }
}

// Main class with the main method
public class test2 {
    public static void main(String[] args) {
        // Creating objects of the first and second classes
        ClassOne obj1 = new ClassOne();
        ClassTwo obj2 = new ClassTwo();

        // Calling methods of the first and second classes
        obj1.display();
        obj2.show();
    }
}
