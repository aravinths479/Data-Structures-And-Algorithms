package collection;
import java.util.*;
public class ArrayList1 {
    public static void main(String args[]){
        List<String> lst = Arrays.asList("hai","bye");
        lst.add("hi there");
        //System.out.println(lst);
        List<Integer> lst1 = Arrays.asList(1,2,3,4,5,22,6,7,8);
        int max = Collections.max(lst1);
        System.out.println(max);
        System.out.println(lst1.contains(5));
        System.out.println(lst1.isEmpty());
    }
}

// add(E element): Adds an element to the end of the list.
// add(int index, E element): Inserts an element at the specified index in the list.
// addAll(Collection<? extends E> collection): Adds all elements from the specified collection to the end of the list.
// addAll(int index, Collection<? extends E> collection): Inserts all elements from the specified collection into the list at the specified index.
// remove(Object object): Removes the first occurrence of the specified element from the list, if it is present.
// remove(int index): Removes the element at the specified index from the list.
// clear(): Removes all elements from the list.
// get(int index): Returns the element at the specified index in the list.
// set(int index, E element): Replaces the element at the specified index in the list with the specified element.
// indexOf(Object object): Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.
// contains(Object object): Returns true if the list contains the specified element; otherwise, returns false.
// size(): Returns the number of elements in the list.
// isEmpty(): Returns true if the list is empty; otherwise, returns false.
// subList(int fromIndex, int toIndex): Returns a new list containing elements from the specified fromIndex (inclusive) to the specified toIndex (exclusive).
// sort(Comparator<? super E> comparator): Sorts the elements of the list using the specified comparator.