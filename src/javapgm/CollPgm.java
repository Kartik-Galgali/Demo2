package javapgm;

import java.util.*;

public class CollPgm {
    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<Integer> a = new ArrayList<>();
        a.add(30);
        a.add(10);
        a.add(20);
        a.add(5);
        a.add(10);

        int size = a.size();
        System.out.println(size);
        
        // 2. Vector
        Vector<Integer> v = new Vector<>(a);

        // 3. LinkedList
        LinkedList<Integer> l = new LinkedList<>(a);

        // 4. PriorityQueue
        PriorityQueue<Integer> q = new PriorityQueue<>(a);

        // 5. HashSet
        HashSet<Integer> h = new HashSet<>(a);

        // 6. LinkedHashSet
        LinkedHashSet<Integer> lh = new LinkedHashSet<>(a);

        // 7. TreeSet
        TreeSet<Integer> t = new TreeSet<>(a);

        System.out.println("ArrayList: " + a);
        System.out.println("Vector: " + v);
        System.out.println("LinkedList: " + l);
        System.out.println("PriorityQueue: " + q);
        System.out.println("HashSet: " + h);
        System.out.println("LinkedHashSet: " + lh);
        System.out.println("TreeSet: " + t);

        System.out.println("PriorityQueue polling:");

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}