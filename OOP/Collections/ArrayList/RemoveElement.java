package OOP.Collections.ArrayList;

import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.remove(1);

        System.out.println(numbers);
    }
}