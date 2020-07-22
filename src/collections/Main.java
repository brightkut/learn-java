package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(nums);

        //convert List interface to array list
        ArrayList<Integer> n = new ArrayList<>(nums);
        System.out.println(n);

        //Link list
        LinkedList<String> linked = new LinkedList<>();
        linked.addFirst("Sunday");
        linked.addLast("Holiday");
        System.out.println(linked);
        linked.add("Wednesday");
        System.out.println(linked);
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());

        //Vector same like ArrayList + LinkList
        // have a method to work in synchronized (its a multi thread)
        Vector<Integer> vector = new Vector<>();
        vector.add(4);
        vector.addElement(6);
        System.out.println(vector);
        System.out.println(vector.firstElement());

        //Stack is inherit from Vector (LIFO)
        List<Integer> num = Arrays.asList(3, 4, 5, 6);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(num);
        System.out.println(stack);
        //add to top stack
        stack.push(2);
        stack.push(1);
        System.out.println(stack);
        //print top of stack
        int x = stack.peek();
        System.out.println(x);
        //other way to print top of stack
        System.out.println(stack.pop());
        System.out.println(stack);

        //Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("Android");
        queue.offer("IOS");
        queue.offer("Windows");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        //Set have 3 type
        //1.Hash set can store distinct element only but not sequence
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Thailand");
        hashSet.add("England");
        hashSet.add("Australia");
        System.out.println(hashSet);

        //2. LinkedHashSet can store distinct element and sequence from what is come first
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Thailand");
        linkedHashSet.add("England");
        linkedHashSet.add("Australia");
        System.out.println(linkedHashSet);

        //3. TreeHashSet can store distinct element and sequence with character
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Thailand");
        treeSet.add("England");
        treeSet.add("Australia");
        System.out.println(treeSet);

        //Map like a Set but store with key value
        // have 3 type
        // 1. HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("th", "Thailand");
        hashMap.put("jp", "Japan");
        hashMap.put("aus", "Australia");
        System.out.println(hashMap);

        //2. LinkHashMap
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("th", "Thailand");
        linkedHashMap.put("jp", "Japan");
        linkedHashMap.put("aus", "Australia");
        System.out.println(linkedHashMap);

        //3. TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("th", "Thailand");
        treeMap.put("jp", "Japan");
        treeMap.put("aus", "Australia");
        System.out.println(treeMap);
    }
}
