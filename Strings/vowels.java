package Strings;

public class vowels {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0;

        // Convert the string to lowercase to simplify comparison
        str = str.toLowerCase();

        // Count the number of vowels in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
