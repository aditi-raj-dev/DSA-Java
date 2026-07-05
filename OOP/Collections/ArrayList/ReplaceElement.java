package OOP.Collections.ArrayList;

import java.util.ArrayList;

public class ReplaceElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.set(1, 100);

        System.out.println(numbers);
    }
}
