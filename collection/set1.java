package collection;

import java.util.*;

public class set1 {
    public static void main(String args[]) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(5);
        set1.add(8);
        set1.add(55);
        set1.add(88);
        System.out.println(set1);


        Set<Integer> set2 = new TreeSet<Integer>();
        set2.add(5);
        set2.add(8);
        set2.add(55);
        set2.add(88);
    
        System.out.println(set2);



        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);

        Set<Integer> set4 = new HashSet<>();
        set4.add(2);
        set4.add(3);
        set4.add(4);

        Set<Integer> commonElements = new HashSet<>(set3);
        commonElements.retainAll(set4);   //intersection

        System.out.println("Common elements between set3 and set4: " + commonElements);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");

        for (String element : stringSet) {
            System.out.println(element);
        }


        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    
    }
    
}





// add(E element): Adds an element to the set if it is not already present.
// addAll(Collection<? extends E> collection): Adds all elements from the specified collection to the set.
// remove(Object object): Removes the specified element from the set if it is present.
// clear(): Removes all elements from the set.
// contains(Object object): Returns true if the set contains the specified element; otherwise, returns false.
// isEmpty(): Returns true if the set is empty; otherwise, returns false.
// size(): Returns the number of elements in the set.
// iterator(): Returns an iterator over the elements in the set.
// containsAll(Collection<?> collection): Returns true if the set contains all elements from the specified collection; otherwise, returns false.
// removeAll(Collection<?> collection): Removes all elements from the set that are also present in the specified collection.
// retainAll(Collection<?> collection): Removes all elements from the set except those that are also present in the specified collection.
// toArray(): Returns an array containing all elements in the set.
// equals(Object object): Compares the set with the specified object for equality.
// hashCode(): Returns the hash code value for the set.
