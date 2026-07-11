package OOP.Collections.LinkedList;

import java.util.LinkedList;

public class RemoveFirstLast {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Aditi");
        names.add("Rahul");
        names.add("Priya");
        names.add("Aman");
        names.add("Sneha");

        names.removeFirst();
        names.removeLast();

        System.out.println(names);
    }
}
