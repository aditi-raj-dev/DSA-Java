package OOP.Collections.ArrayList;

import java.util.ArrayList;

public class LargestElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(18);
        numbers.add(30);

        int largest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {

            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        System.out.println("Largest Element: " + largest);
    }
}
