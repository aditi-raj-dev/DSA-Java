package OOP.Collections.LinkedList;

import java.util.LinkedList;

public class FirstLast {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Aditi");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());
    }
}
