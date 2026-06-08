package Strings;

public class consonants {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int consonantCount = 0;

        // Convert the string to lowercase to simplify comparison
        str = str.toLowerCase();

        // Count the number of consonants in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                consonantCount++;
            }
        }

        System.out.println("Number of consonants in the string: " + consonantCount);
    }
}
