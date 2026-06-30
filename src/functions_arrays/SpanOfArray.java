package functions_arrays;

import java.util.*;
import java.util.List;

class Fruit {}
class Apple extends Fruit {}
class RedApple extends Apple {}

public class SpanOfArray {
    public static void main(String[] args) {
        List<RedApple> source = new ArrayList<>();
        source.add(new RedApple());

        List<Fruit> destination = new ArrayList<>();
        processApples(source, destination);

        System.out.println("Source apples: " + source.size());
        System.out.println("Destination items: " + destination.size());
    }
    
    public static void processApples(List<? extends Apple> source, List<? super Apple> destination) {
        // int[] arr = {1, 2, 3, 4, 5};
        // Collections.sort(arr,(Interger v1, Integer v2 ) -> v2-v1);
        // // Operation 1
        // source.add(new RedApple());
        
        
        destination.add(new RedApple());
        
        // // Operation 3
        // Apple apple1 = source.get(0);
        
        // // Operation 4
        // Apple apple2 = destination.get(0);
    }
}
