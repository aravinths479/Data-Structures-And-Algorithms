package collection;
import java.util.*;
public class map1 {
    public static void main(String args[]) {
        Map<Integer,String> map1 = new HashMap<>(); 
        map1.put(1,"aravinth");
        map1.put(2,"Arun");
        map1.put(3,"Aswin");
        map1.put(1,"aravinth");

        System.out.println(map1);
        for (Map.Entry<Integer,String> i : map1.entrySet()) {
            int id = i.getKey();
            String name = i.getValue();
            System.out.println(id + " : " + name);
        }

    }
}


// put(K key, V value): Associates the specified value with the specified key in the map.
// get(Object key): Returns the value to which the specified key is mapped, or null if the key is not present in the map.
// containsKey(Object key): Returns true if the map contains the specified key; otherwise, returns false.
// containsValue(Object value): Returns true if the map contains the specified value; otherwise, returns false.
// remove(Object key): Removes the mapping for the specified key from the map, if it is present.
// size(): Returns the number of key-value mappings in the map.
// isEmpty(): Returns true if the map is empty; otherwise, returns false.
// keySet(): Returns a Set view of the keys in the map.
// values(): Returns a Collection view of the values in the map.
// entrySet(): Returns a Set view of the key-value mappings in the map.
// putAll(Map<? extends K, ? extends V> map): Copies all of the mappings from the specified map to this map.
// clear(): Removes all key-value mappings from the map.
// replace(K key, V value): Replaces the value for the specified key with the specified value, if the key is present in the map.
// getOrDefault(Object key, V defaultValue): Returns the value to which the specified key is mapped, or a default value if the key is not present in the map.
// computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction): If the specified key is not already associated with a value, computes its value using the given mapping function and associates it with the key in the map.
 