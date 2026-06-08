package Strings;

public class reverse {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversedStr);
    }
}
