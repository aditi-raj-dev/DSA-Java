package OOP.Collections.LinkedList;

import java.util.LinkedList;

public class AddFirstLast {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Aman");

        names.addFirst("Aditi");
        names.addLast("Sneha");

        System.out.println(names);
    }
}
