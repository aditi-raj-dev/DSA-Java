package Recursion.DAY7;

public class Power {
    public static int power1(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power1(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result = power1(a, b);
        System.out.println(a + " raised to the power of " + b + " is: " + result);
    }
}
